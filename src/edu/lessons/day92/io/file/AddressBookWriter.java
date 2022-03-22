package edu.lessons.day92.io.file;

import java.io.FileWriter;

public class AddressBookWriter
{
  public static void main(String args[]) throws Exception
  {
	  
  }
  public static void createAddressBook() throws Exception
  {
	java.util.Scanner scanner=new java.util.Scanner(System.in);
	String nameAndphone ="";
	String source ="";
	String fname="c:\\temp\\address.txt";
	int srclen=0;
	char buffer[] =null;
	FileWriter fw =null;
	System.out.println("Enter 'quit' to stop:"); 
	do
	{
		System.out.println("Enter ContactName - Phone Number or ");
		nameAndphone= scanner.nextLine();
	    if(nameAndphone.equals("quit")) continue;
	    source+=nameAndphone+System.getProperty( "line.separator" );
	}while(!nameAndphone.equals("quit"));
    srclen=source.length();
    buffer= new char[srclen];
    source.getChars(0, srclen, buffer, 0);
    try
    {
		 fw=new FileWriter(fname);
		 for (int i=0; i < buffer.length; i ++)
		 {
			fw.write(buffer[i]);
		 }
		 System.out.println("Address Saved");
	}catch(Exception err)
	{
		err.printStackTrace();
	}
	finally
	{
		 fw.close();
	 }
  }
}
