package edu.lessons.day60.oops.inheritance;

public class TestHC {

	public static void main(String[] args) 
	{
		Object obj1=new Object();
		Object obj2=new Object();
		Object obj3=new Object();
		Object obj4=new Object();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		String s1="Abcd";
		String s2="Abcd";
		String s3="Abcd";
		String s4="Abcd";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
