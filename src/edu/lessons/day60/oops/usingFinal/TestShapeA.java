package edu.lessons.day60.oops.usingFinal;

import edu.lessons.day60.oops.inheritance.TriangleA;

public class TestShapeA {

	public static void main(String[] args) 
	{
		ShapeAPrivateConstructor s1=
				ShapeAPrivateConstructor.getObject();
		System.out.println(s1.hashCode());
	}
	public static void m1()
	{
		//ShapeA s1=new ShapeA(10); 
		TriangleA t1=new TriangleA(50);
	}
}
