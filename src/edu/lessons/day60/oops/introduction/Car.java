package edu.lessons.day60.oops.introduction;
public class Car //base class
{
  public String Regno;
  
  public Car()   
  {
  	  System.out.println("Car Constructed "+this.hashCode());
  }
  
  public void move() //overridable  
  {
	  System.out.println("Car.move");
  }
 }
