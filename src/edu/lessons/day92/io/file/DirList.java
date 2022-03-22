package edu.lessons.day92.io.file;

import java.io.File;
import java.util.Scanner;
public class DirList
{
  public static void main(String args[])
  {
	java.util.Scanner scanner=new Scanner(System.in);
  	System.out.println("Enter a Directory Name");
    String dirname = scanner.nextLine();
    File file = new File(dirname);
    String listoffilenamesindirectory[]=null;
    if (file.isDirectory())
    {
      System.out.println(dirname+" is a Directory");
      listoffilenamesindirectory = file.list();
      for (int i=0; i < listoffilenamesindirectory.length; i++)
      {
        File f = new File(dirname + "/" + listoffilenamesindirectory[i]);
        if (f.isDirectory())
        {
          System.out.println("\t<"+f.getName() + "> is a sub directory");
        }
        else
        {
          System.out.println("\t"+f.getName() + " is a file");
        }
      }
	 }
    else
    {
      System.out.println(dirname + " is not a directory");
    }
    scanner.close();
  }
}