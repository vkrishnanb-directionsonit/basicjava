package edu.lessons.day37.staticMethods;
public class StaticDemoA 
{
	//global fields
	static String name="Sam";
	//Variable declaration and assigning a default value to it
	int year=2015;
	static double amount=2323.4543;
		
	public static void main(String[] args) 
	{
		//static int x=0;
		StaticDemoA.m1();
		StaticDemoA obj=new StaticDemoA();
		obj.m4();		
	}
	
	public static void m1()
	{
		StaticDemoA.name="John";//value assign
		StaticDemoA.amount=123456;
		System.out.println("Name "+StaticDemoA.name);
		//System.out.println("Year "+year);
		StaticDemoA d1=new StaticDemoA();
		d1.year=2000;
		System.out.println("Year "+d1.year);
		
		System.out.println("AMT "+StaticDemoA.amount);
	}
	
	public static void m2()
	{
		int x=100;
		char c1='A';
		boolean flag=false;
		float f1=0.21344f;
		double d1=533.422d;
   
	  System.out.println(x);
	  System.out.println(c1);
	  System.out.println(flag);
	  System.out.println(f1);
	  System.out.println(d1);
	}
	
	public static void m3()
	{
	  int x=100;
	  int y=200;
	  int z=(x+y);//300
	  String s1="500";
	  String s2=s1+z;
	  System.out.println(s2);//500300
	}
	  
	public void m4()
	{
		System.out.println("m4---------");
		System.out.println("Name "+StaticDemoA.name);
		System.out.println("Year "+this.year);
		System.out.println("AMT "+StaticDemoA.amount);
	}
	
	public static void m5()
	{
		int v1=1;
		int v2=v1;
		System.out.print("v1 "+v1);
		System.out.println(" v2 "+v2);
		v1=400;
		System.out.print("v1 "+v1);
		System.out.println(" v2 "+v2);
		//v1=null;
		
	}
}
