package edu.lessons.day1.introduction;

public class DemoB 
{
	// static method
	public static void m1() 
	{
		System.out.println("m1");
	}
	// non static method
	public void m2()
	{
		System.out.println("m2 ");
	}
	public static void testDemoB()
	{
		DemoB.m1();
		// DemoB.m2(); ==> non static method, Requires an object reference
		DemoB d1=new DemoB();
		d1.m2();
	}
	//*****************
	public static void m3() 
	{
		//local variable
		int x=5;
		int y=x; // copy the value 5		
		System.out.println("x="+x + " y="+y);
		x=3; // x+=3; x-=10;
		System.out.println("x="+x + " y="+y);
		
		String s1="Hello";
		String s2=s1;
		System.out.println("s1="+s1 + " s2="+s2);
		s1="Welcome";
		System.out.println("s1="+s1 + " s2="+s2);
	}	
}