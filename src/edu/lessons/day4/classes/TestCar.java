package edu.lessons.day4.classes;

public class TestCar {

	public static void main(String[] args) 
	{
		m1();
	}
	public static void m1() 
	{
		Car c1=Car.getCar();//new Car("TN 10 A 007");
		c1.regNo="TN 10 A 007";
		Car c2=c1;//new Car();
		Car c3=Car.getCar();//new Car("TN 10 A 008");
		c3.regNo="TN 10 A 008";
		boolean flag1=c1.equals(c2);
		System.out.println(flag1);
		flag1=c1.equals(c3);
		System.out.println(flag1);
		c1.move();
		c2.move();
		c3.move();
	}	
}