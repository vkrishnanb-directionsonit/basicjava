package edu.lessons.day4.classes;

public class TestMyClass {

	public static void main( String args[] ) 
	{
		MyClass a, b;
		a = new MyClass(); // (2) Default Constructor is called
		//b = new MyClass(5l); // (3) In_Valid Call
		a.MyClass(5l);// Method Call
		b=new MyClass();
		b.MyClass(123);
		System.out.println("a.var=>"+a.var+"  b.var=>"+b.var);
	}
}
