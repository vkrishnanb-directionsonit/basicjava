package edu.lessons.day60.oops.introduction;

public class ShapeTest {
	public static void main(String[] args) 
	{
		//Shape s1=new Shape();
		ShapePrivateConstructor s1=ShapePrivateConstructor.GetShape();
		s1.draw();
	}
}