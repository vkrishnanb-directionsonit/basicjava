package edu.lessons.day3.premitiveTypes;

public class DemoA
{
	//class variable
	static int gx=67765656;
	static int gy;
	//instance variable - requires an Object to access them
	int data1;
	int data2;
	
	public static void m0()// using Class Variables 
	{
		System.out.println( "Inside Main-gx=" + DemoA.gx);// 67765656
		//data1=12345;
		DemoA.gx=200;
		DemoA.m1();
		// x=20;
		System.out.println("Inside Main-gx=" + DemoA.gx);//50000
		// using Instance variables
		DemoA a1 = new DemoA(); //Object creation
		a1.data1 = 12345;
		a1.data2 = 67890;
		System.out.println("Data1=" + a1.data1);
		System.out.println("Data2=" + a1.data2);
	}
	public static void m1()// using Class Variables 
	{
		System.out.println("Inside m1-gx="+gx);//200
		gx=50000;
		System.out.println("Inside m1-gx="+gx);//50000
	}
	public static void m2()//local variables
	{
		int x=0;
		//int x=new int();
		int y=0;
		System.out.println("x="+x+"-----y="+y);
		x=100;
		y=x;
		System.out.println("x="+x+"-----y="+y);//100 100
		System.out.println("x==y "+(x==y));//true
		x=500;
		System.out.println("x="+x+"-----y="+y);//500 100
		System.out.println("x==y "+(x==y));//false
	}
	public void m3()
	{
		System.out.println( "Inside m3-gx=" + DemoA.gx);		
		System.out.println( "Inside m3-data1=" + data1);
		System.out.println( "Inside m3-data1=" + data2);
	}
	public static void test()
	{
		// m0();
		// m2();
		DemoA a1 = new DemoA();
		a1.m3();
	}
}