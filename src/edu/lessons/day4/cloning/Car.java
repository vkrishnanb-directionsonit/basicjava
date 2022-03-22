package edu.lessons.day4.cloning;

public class Car implements Cloneable
{
  public int regNo;
  public String toString()
  {
	  return "ValueA is " + regNo;
  }
  public Car createClone() throws CloneNotSupportedException
  {
	  return (Car)this.clone();
  }
}
