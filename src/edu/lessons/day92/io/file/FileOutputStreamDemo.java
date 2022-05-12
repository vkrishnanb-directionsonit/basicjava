package edu.lessons.day92.io.file;
import java.io.OutputStream;
import java.io.FileOutputStream;
/**
 * 
 * @author Chainsys
 * Programs use byte streams to perform input and output of 8-bit bytes. 
 * All byte stream classes are descended from InputStream and OutputStream.
 * To demonstrate how byte streams work, 
 * we'll focus on the file I/O byte streams, FileInputStream and FileOutputStream. 
 */
public class FileOutputStreamDemo
{
  public static void main(String args[])
  {
    String source = "Now is the time for all good men\n"
      + " to come to the aid of their country\n" ;
		OutputStream f0=null;
		OutputStream f1=null;
		OutputStream f2=null;
		try
		{
			 byte buf[] = source.getBytes();
			 System.out.println(buf.length);
			  f0= new FileOutputStream("file1.txt");
			 for (int i=0; i < buf.length; i += 2)
			 {
				f0.write(buf[i]);
			 }
			 f1 = new FileOutputStream("file2.txt");
			 f1.write(buf);
			 f2 = new FileOutputStream("file3.txt");
			 f2.write(buf,buf.length-buf.length/4,buf.length/4);
		 }catch(java.io.FileNotFoundException e1)
		 {
			 System.out.println(e1.getMessage());
		 }
		 catch(java.io.IOException e2)
		 {
			 System.out.println(e2.getMessage());
		 }
		 finally
		 {
			 try
			 {
				if(null!=f0) f0.close();
				if(null!=f1) f1.close();
				if(null!=f2) f2.close();
			}catch(java.io.IOException e2)
			{
				System.out.println(e2.getMessage());
			}
	   }
   }
}
