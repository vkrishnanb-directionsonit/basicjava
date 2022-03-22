package edu.lessons.day4.classes.constructors;
public class Box 
{
	//Constructor Overload
    public Box()
    {
    	System.out.println("Box - c1");
    }
    public Box(int x)
    {
    	System.out.println("Box - c2 "+x);
    }
    public Box(int x,int y)
    {
    	System.out.println("Box - c3 "+x+" "+y);
    }
    public Box(double d)
    {
    	System.out.println("Box - c4 "+d);
    }
//    public final Box(double d,double d2)
//    {
//    	System.out.println("Box - c4 "+d);
//    }

}