package edu.lessons.day60.oops.introduction;

public class ShapePrivateConstructor
{
    private ShapePrivateConstructor()
    {
    	System.out.println("Shape Created");
    }
    public static ShapePrivateConstructor GetShape()//factory method
    {
    	return null;//new Triangle();//new Shape();
    }
    public void draw()
    {
    	System.out.println("Shape.display");
    }
}
class Triangle //extends Shape
{
	
}
