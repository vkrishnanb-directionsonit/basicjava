package edu.lessons.day60.oops.introduction;

public class TestCar {

	public static void main(String[] args) 
	{
		m2();
	}
	public static void m1() 
	{
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		boolean flag1=c1.equals(c2);
		System.out.println(flag1);
		c1.move();
	}
	
	public static void m2() 
	{
		Car c1=new Maruthi();
		c1.move();//Car.move() if not overriding | else Maruthi.move(); 
		//c1.turn();
		
		Maruthi m1=(Maruthi)c1;//new Maruthi();
		m1.move();
		m1.turn();
		
		c1=new Innova();
		c1.move();
		//c1.stop();
		Innova n1=(Innova)c1;
		n1.move();
		n1.stop();
	}
}