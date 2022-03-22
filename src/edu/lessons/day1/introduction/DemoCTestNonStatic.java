package edu.lessons.day1.introduction;

public class DemoCTestNonStatic {
	public void m1()
	{
		// accessing static field inside a non static method
		System.out.println("r1="+DemoC.r1);
		// accessing static field inside a non static method
		DemoC d1=new DemoC();
		System.out.println("x="+d1.x);
	}
}
