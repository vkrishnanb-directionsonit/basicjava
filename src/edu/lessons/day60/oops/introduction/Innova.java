package edu.lessons.day60.oops.introduction;

public class Innova extends Car 
{
	public Innova()
	{
		System.out.println("Innova "+this.hashCode());
	}
	public void stop()//new method not visible to parent
	{
		System.out.println("Innova.Stop");
	}
	public void move() //overridable  
	  {
		  System.out.println("Innova.move");
	  }

}
