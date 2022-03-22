package edu.lessons.day92.io.file;
import java.io.*;
import java.util.*;
public class PhonebookWriter
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
    	System.out.println("New File Created");
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

    // Let user enter new names and numbers.
    do {
      System.out.println("Enter new name" +
                         " ('quit' to stop): ");
      name = br.readLine();
      if(name.equals("quit")) continue;

      System.out.println("Enter number: ");
      number = br.readLine();

      ht.put(name, number);
      changed = true;
    } while(!name.equals("quit"));

    // If phone book data has changed, save it.
    if(changed) 
    {
      FileOutputStream fout = new FileOutputStream("c:\\temp\\phonebook.dat");
      try
      {
    	ht.store(fout, "Telephone Book");
      }finally
      {
        fout.close();
      }
      System.out.println("File Saved");
    }
    else
    	System.out.println("File Not Saved");
   }
}

