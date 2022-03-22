package edu.lessons.day36.staticConstants;

public class TestDemoThis {
	public static void test() 
	{
		System.out.println("X "+DemoThis.x);// 123
		//System.out.println("Y "+y);//non static
		DemoThis.m2();// static method
		
		DemoThis d1=new DemoThis();
		d1.m1();
		
		System.out.println("Y "+d1.y);//0
		System.out.println("X "+d1.x);//123
		d1.y=77777;
		
		d1.m2();// static method
		
		DemoThis d2=new DemoThis();
		System.out.println("Y "+d1.y);//0
		System.out.println("X "+d1.x);//123
		d2.y=8888888;
		d2.m1();
		d2.m2();
	}

}
