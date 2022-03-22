package edu.lessons.day92.io.file;
import java.io.*;
import java.util.*;
public class PhonebookReader
{
  public static void main(String args[])throws IOException
  {
	String path="c:\\temp\\phonebook.dat";
    Properties ht = new Properties();
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String name, number;
    FileInputStream fin = null;
    boolean changed = false;

    // Try to open phonebook.dat file.
    try {
      fin = new FileInputStream(path);
    } catch(FileNotFoundException e) {
    	System.out.println(e.getMessage());
    	return;
    }

  /* If phonebook file already exists,load existing telephone numbers. */
    try {
      if(fin != null) {
        ht.load(fin);
        fin.close();
      }
    } catch(IOException e) {
      System.out.println("Error reading file.");
    }

    // Look up numbers given a name.
    do {
      System.out.println("Enter name to find" +
                         " ('quit' to quit): ");
      name = br.readLine();
      if(name.equals("quit")) continue;

      number = (String) ht.get(name);
      System.out.println(number);
    } while(!name.equals("quit"));
  }
}