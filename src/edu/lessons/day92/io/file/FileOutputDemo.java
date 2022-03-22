package edu.lessons.day92.io.file;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class FileOutputDemo
{
  public static void main(String args[])
  {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Data");
    String source = sc.nextLine();
    System.out.println("Enter FileName with full path");
    String fname=sc.nextLine();
	OutputStream f0=null;
	try
	{
	 byte buf[] = source.getBytes();
	 System.out.println("Length "+buf.length);
	 f0= new FileOutputStream(fname);
	 for (int i=0; i < buf.length; i ++)
	 {
		f0.write(buf[i]);
	 }
		 System.out.println("File Write Completed");
		 }catch(java.io.FileNotFoundException e1)
		 {
			 System.out.println("FileNotFoundException "+e1.getMessage());
		 }
		 catch(java.io.IOException e2)
		 {
			 System.out.println("IOException "+e2.getMessage());
		 }
		 finally
		 {
		  try
		  {
			if(null!=f0) f0.close();
		  }catch(java.io.IOException e2)
		  {
			System.out.println("Inside Finally "+e2.getMessage());
		  }
	    }
   }
}
