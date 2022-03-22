package edu.lessons.day60.oops.inheritance;

public class TestAShape {
	public static void main(String[] args) 
	{
		m6();
	}
	public static void m6()
	{
		Shape s1=new Shape(6);
		s1.draw();//Shape.draw
		Triangle t1=new Triangle();
		t1.height=123;
		t1.width=100;
		t1.draw();//Shape.draw
		t1.show();// Triangle.show
		s1=t1;
		s1.draw(); //Shape.draw
		//s1.show();
		
	}
}
