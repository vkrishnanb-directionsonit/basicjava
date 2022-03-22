package edu.lessons.day60.oops.inheritance;

public class TriangleA //extends ShapeA 
{
	public TriangleA()
	{
		//System.out.println("B4");
		//super(100);
		System.out.println("Triangle CreatedA "+hashCode());
	}
	public TriangleA(int x)
	{
		//super(x);
		//height=x;width=x;
		System.out.println("Triangle CreatedB "+hashCode());
	}

	public void show()
	{
		System.out.println("Triangle.Show");
	}
}
