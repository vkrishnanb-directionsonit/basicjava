package edu.lessons.day4.classNmethods;

public class WoodenBox 
{
	//fields
		int width;
		int length;
	//overloaded Constructor
	public WoodenBox()
	{
		System.out.println("Box Created");
		width=0;length=0;
	}
	public WoodenBox(int width,int length)
	{
		this.width=width;
		this.length=length;
		System.out.println("Box Created");
	}
	/*public WoodenBox(int r,int a)
	{
		width=r;length=a;
		System.out.println("Box Created");
	}*/
	//methods
	public int getArea()
	{
		return length*width;
	}
	public int getVolume()
	{
		return (length*width)*2;
	}
	public void echo()
	{
		System.out.println("Len "+length+" Width"+width);
	}
}
