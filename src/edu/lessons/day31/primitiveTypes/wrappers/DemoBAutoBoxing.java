package edu.lessons.day31.primitiveTypes.wrappers;
import java.util.Vector;
public class DemoBAutoBoxing
{
	 public static void test()
	 {
		String s="hello";//String is a class . s is a ref
		callme(s);
		//Boolean wb=new Boolean(true);//Boolean is a class. wb is a ref
		Boolean wb=Boolean.valueOf(true);
		callme(wb);
		int x=100;// int is a primetive Type. x is not a ref 
		callme(x);// auto Boxing
	 }
	 public static void callme(Object o)
	 {
	 	    System.out.println("Value of Object: " +o.toString());
	 }
	 
	 @SuppressWarnings({ "rawtypes", "unchecked", "rawtypes" })
	 public static void m1()
	 {
		Vector v=new Vector();
		try{
		    int i=100;
		    v.addElement(i);
		    Byte wByte=Byte.valueOf("41");
		    v.addElement(wByte);
		    Short wShort=Short.valueOf("3131");
		    v.addElement(wShort);
		    Integer wint=Integer.valueOf(i);
		    v.addElement(wint);
		}catch(Exception e)
		{
			System.out.println("exp:" +e.getMessage());
		}
	 }
}