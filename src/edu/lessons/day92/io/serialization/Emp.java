package edu.lessons.day92.io.serialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable ;
// Emp class uses Myclass Object as a member

public class Emp implements Serializable
{
	private int eno ;
	private String ename ;
	private MyClass myClass;
	Emp(int a, String m)
	{
		eno=a ;
		ename=m;
		myClass=new MyClass(m, 1000, 258.35);
	}
	void print()
	{
		System.out.println(eno + " \t: " + ename +" hc "+hashCode()) ;
		System.out.println("MyClass "+myClass.s);
	}


	private void writeObject(ObjectOutputStream oos)// throws Exception
	{
        System.out.println("writeObject called "+oos.hashCode());
        try {
			oos.writeObject(myClass) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	private void readObject(ObjectInputStream ois) 
	{
 		MyClass ob=null;
        try {
			ois.defaultReadObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        try {
			ob = (MyClass) ois.readObject();
			if(null==ob)
			{
				System.out.println("MyClass Deserialization FAILED");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
