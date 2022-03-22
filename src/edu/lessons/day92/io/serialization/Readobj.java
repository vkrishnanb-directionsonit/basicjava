package edu.lessons.day92.io.serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Readobj
{
	public static void main(String arg[])throws Exception
	{
	     FileInputStream fis = 
	    		 new FileInputStream("c:\\temp\\emp1.dat") ;
	     ObjectInputStream ois = new ObjectInputStream(fis) ;
 	     Emp ob =null;
 	    try
		{
			ob = (Emp) ois.readObject();
		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization: " +e);
		}
		finally
		{
			try
		    {
				ois.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception during ois close: " + e);
			}
		}
		if(null!=ob)
		{
			ob.print() ;
			System.out.println("HashCode "+ob.hashCode());			
		}
	}
}