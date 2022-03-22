package edu.lessons.day36.staticConstants;

public class DemoThis 
{
	static int x=123;
	int y=0;
	public void m1()
	{
		System.out.println("X "+DemoThis.x);
		System.out.println("Y "+this.y);//0
		
		DemoThis d2=new DemoThis();
		System.out.println("Y "+d2.y);//0
		y=55555;//this.y=55555;
		d2.y=66666;
		System.out.println("Y "+this.y);//55555
		System.out.println("Y "+d2.y);//66666
		d2.m3();
		System.out.println("Y "+d2.y);//44444
	}
	public static void m2()
	{
		System.out.println("X "+DemoThis.x);
		//System.out.println("Y "+this.y); illegal
		
		DemoThis d2=new DemoThis();
		System.out.println("Y "+d2.y);//0
		
		//this.y=55555;  illegal
		d2.y=66666;
		//System.out.println("Y "+this.y);// illegal 
		System.out.println("Y "+d2.y);//66666
	}
	public void m3()
	{
		System.out.println("Y "+this.y);//d2.y=>66666
		DemoThis d3=new DemoThis();
		System.out.println("Y "+d3.y);//0
		y=44444;// d2.y
		d3.y=33333;
		System.out.println("Y "+this.y);//d2.y=>44444
		System.out.println("Y "+d3.y);//33333
	}
}
