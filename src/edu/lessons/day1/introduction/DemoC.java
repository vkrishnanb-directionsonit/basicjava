package edu.lessons.day1.introduction;

public class DemoC {
	//Global
	static int r1=1111; // static field
	int x=12345; // non static field
	
	public static void m1() 
	{
		// accessing static field inside a static method
		System.out.println("r1="+ r1); 
		// can not access a non static field inside a static method
		// System.out.println("x="+ x);
	}
	
	public static void m2() 
	{
		System.out.println("M2 "+r1);
		// To access a non static field inside a static method
		// An Object of the class has to be created
		DemoC d1=new DemoC();
		System.out.println("x="+ d1.x);
	}
	public void m3()
	{
		// accessing static field inside a non static method
		System.out.println("r1="+r1);
		// accessing non static field inside a non static method 
		// within the same class
		System.out.println("x="+x);
		// For accessing non static field inside a non static method 
		// from another class check ==> DemoCTestNonStatic.java
	}
	public static void testDemoC() 
	{
		System.out.println("testDemoC "+r1);
		//local
		m2();// method call
		m1();
		DemoC d1=new DemoC();
		d1.m3();
	}
	
}
