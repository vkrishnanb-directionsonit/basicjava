package edu.lessons.day92.io.serialization;
import java.io.*;
public class SerializationDemo
{
	public static void main(String args[])
	{
		//doSerialize();
		//doDeSerialize();
	}
	public static void doSerialize()
	{
		// Object serialization
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		String fName="c:\\temp\\myclass.dat";
		try
		{
			MyClass object1 = new MyClass("Hello", -7, 100000.50d);
			fos = new FileOutputStream(fName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			System.out.println("Object Serialized");
		}
		catch(Exception e)
		{
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		}
		finally
		{
			try
		    {
				oos.close();
			}
			catch(Exception e)
			{
				System.out.println("Exception during oos.close: " + e);
				System.exit(0);
			}
		}		
	}
	public static void doDeSerialize()
	{
		// Object deserialization
		FileInputStream fis=null;
		ObjectInputStream ois =null;
		MyClass object2=null;
		String fName="c:\\temp\\myclass.dat";
		try
		{
			fis = new FileInputStream(fName);
			ois = new ObjectInputStream(fis);
			object2 = (MyClass)ois.readObject();
  		   System.out.println("Deserialized - object2: " + object2);
		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization: " +e);
			System.exit(0);
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
				System.exit(0);
			}
		}
		//System.out.println("Deserialized object2: " + object2);
	}

}
