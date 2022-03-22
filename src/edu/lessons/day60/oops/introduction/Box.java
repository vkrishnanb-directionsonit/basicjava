package edu.lessons.day60.oops.introduction;
public class Box 
{
	public int height;
//    public Box()
//    {
//    	System.out.println("Box - c1 "+hashCode());
//    }
    public Box(int x)
    {
    	height=x;
    	System.out.println(hashCode()+" Box - c2 "+x);
    }
    public Box(int x,int y)
    {
    	System.out.println(hashCode()+" Box - c3 "+x+" "+y);
    }
    public void echo()
    {
    	System.out.println("Box - Echo "+hashCode());
    }
}
