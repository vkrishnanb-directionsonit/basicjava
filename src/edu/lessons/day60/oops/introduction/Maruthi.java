package edu.lessons.day60.oops.introduction;


public class Maruthi extends Car 
{
	public Maruthi()
	{
		System.out.println("Child "+this.hashCode());
	}
	public void turn()//new method not visible to parent
	{
		System.out.println("Maruthi.Turn ");
	}
	public void move() //overridable  
	  {
		  System.out.println("Maruthi.move");
	  }
}
