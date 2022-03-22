package edu.lessons.day60.oops.inheritance;

public class DemoAParent {
	public DemoAParent()
	{
		System.out.println("Super Constructor");
	}
	public void display()
	{
		System.out.println("Super "+this.getClass().getTypeName());
	}
}
