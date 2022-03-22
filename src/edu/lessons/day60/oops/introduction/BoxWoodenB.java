package edu.lessons.day60.oops.introduction;

public class BoxWoodenB extends Box
{
	public BoxWoodenB()
    {
		super(0);
    	System.out.println("WoodenBox - c1 "+hashCode());
    }
	public BoxWoodenB(int x)
    {
		super(x);
    	System.out.println(hashCode()+" WoodenBox - c2 "+x);
    }
	public BoxWoodenB(int x,int y)
    {
	  super(x,y);
   	  System.out.println(hashCode()+" WoodenBox - c3 "+x+" "+y);
    }
}
