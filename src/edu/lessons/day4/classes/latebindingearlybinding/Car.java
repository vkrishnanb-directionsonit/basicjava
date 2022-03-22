package edu.lessons.day4.classes.latebindingearlybinding;
public class Car 
{
  //Field
  public String regNo;
  public int noOfDoors;
  public int noOfSeats;
  public int yearOfManufacture;
  public String fuelType;
  public static final int FuelCapacity=40;
  public String carcolor;
  public double cost;
  public String model;
  //Constructor
//  public Car()   
//  {
//  	  System.out.println("Car Constructed "+this.hashCode());
//  }
  public Car(String s1)   
  {
	  regNo=s1;
  	  System.out.println("Car Constructed "+this.hashCode());
  }
  //Factory Method
  public static Car getCar()
  {
	  return new Car("");
  }
  //method
  public void start()   
  {
	  System.out.println("Car.started "+regNo);
  }
  public void move()   
  {
	  System.out.println("Car.move "+regNo);
  }
  public void turn()   
  {
	  System.out.println("Car.turn "+regNo);
  }
  public void stop()   
  {
	  System.out.println("Car.move "+regNo);
  }
 }
