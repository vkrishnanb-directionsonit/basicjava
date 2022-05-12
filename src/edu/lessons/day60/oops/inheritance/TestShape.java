package edu.lessons.day60.oops.inheritance;

public class TestShape {
	public static void main(String[] args) 
	{
		testPolymorphism();
	}
	public static void m1()
	{
		Shape s1 =new Shape(10);
		Object obj=s1;//up cast
		Class c1=s1.getClass();
		System.out.println("Class Name: "+c1.getName());
		System.out.println("Parent Class Name: "+
								c1.getSuperclass().getName());
		//Shape s2=new Object();//down cast
	}
	public static void m2()
	{
		String s1="Hello";
		Object obj=s1;
		Class c1=s1.getClass();
		System.out.println("Class Name: "+c1.getName());
		System.out.println("Parent Class Name: "+
										c1.getSuperclass().getName());
		//String s2=new Object();
	}
	public static void m3()
	{
		Object obj1=new Object();
		Object obj2=obj1;//new Object();
		System.out.println("Object 1 hash code "+obj1.hashCode());
		System.out.println("Object 2 hash code "+obj2.hashCode());
		System.out.println("ToString "+obj1.toString());
		System.out.println("ToString "+obj2.toString());
		System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));
		System.out.println("obj1.getClass() "+obj1.getClass().getName());
		
	}
	public static void m4()
	{
		Shape obj1=new Shape(1);
		Shape obj2=new Shape(2);
		System.out.println("Object 1 hash code "+obj1.hashCode());
		System.out.println("Object 2 hash code "+obj2.hashCode());
		System.out.println("ToString "+obj1.toString());
		System.out.println("ToString "+obj2.toString());
		System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));
		System.out.println("obj1.getClass() "+obj1.getClass().getName());
	}
	
	public static void testPolymorphism()
	{
		//Triangle t1=new Shape();
		Shape s1=new Triangle();
		System.out.println("Tri.HC "+s1.hashCode());
		s1.height=123;
		s1.width=100;
		s1.draw();//shape.draw -final method - not a virtual method
		s1.show();// tri.Show - not a final method - runtime polymorphism
		// s1.echo();
	}
	public static void m6()
	{
		Shape s1=new Shape(1);
		s1.draw();//Shape.draw
		Triangle t1=new Triangle();
		t1.height=123;
		t1.width=100;
		t1.draw();//Shape.draw
		s1=t1;
		s1.draw();
		//s1.show();
		t1.show();
	}
    public static void m7()
    {
    	Triangle t1=new Triangle();
    	Triangle t2=new Triangle();
    }
    public static void m8()
    {
    	Shape s1=new Triangle();
		s1.draw();//Shape.draw
		
		s1.height=100;
		s1.width=200;
		s1.draw();//Shape.draw
		s1.show();//Triangle.draw
    }
}
