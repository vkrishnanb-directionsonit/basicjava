package edu.lessons.day60.oops.inheritance;

public class DemoA 
{
	static int x;	
	static int y;
	int z=0;
	
	public static void main(String args[])
	{
		//accessing Static member
		DemoA.x=1000; //x=1000;
		DemoA.y=2000; //y=2000;
		System.out.println("x= "+DemoA.x);
		System.out.println("y= "+DemoA.y);
		
		//accessing non static member
		//DemoA.z=5895; //z=5895;
		
		DemoA a1=new DemoA();
		a1.z=3000;
		
		DemoA a2=new DemoA();
		a2.z=6000;
		
		a1.display();
		a2.display();
		a1.changeData(5000);
		a1.display();
		a2.display();
		
	}
	public void display()
	{
		System.out.println("z= "+z);//this.z
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		changeData(1);//this.changeData(1)
		System.out.println("this "+this.getClass().getName());
		System.out.println("this "+this.getClass().getSuperclass().getName());
	}
	public void changeData(int v1)
	{
		x=y=v1;
	}
}
