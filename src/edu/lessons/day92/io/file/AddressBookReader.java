package edu.lessons.day92.io.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddressBookReader
{
  public static void main(String args[])
  {
    int i;
    String fname="c:\\temp\\address.txt";
    FileInputStream fin=null;
     try
    {
      fin = new FileInputStream(fname);
    } catch(FileNotFoundException e)
    {
      System.out.println("File Not Found");
      return;
    } 
    try
    {
	 do
	 {
		i = fin.read();
		if(i != -1)	System.out.print((char) i);
	 } while(i != -1);

   }catch(IOException e)
   {
      System.out.println("Error in read "+e.getMessage());
   }
   finally
   {
	 try
	{
		if(null!=fin)   fin.close();
	}catch(IOException e1)
	{
	    System.out.println(e1.getMessage());
	}
   }
  }
}
