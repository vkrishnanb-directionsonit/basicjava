package edu.lessons.day4.classes;

public class TestCalculator {

	public static void main(String[] args) 
	{
	  int x=125;
	  int y=5;
      int result=0;
      Calculator c1=new Calculator();
      result=c1.add(x,y);
      System.out.println("Result is "+result);
      result=c1.divide(x,y);
      System.out.println("Result is "+result);
      result=c1.substract(x,y);
      System.out.println("Result is "+result);
      result=c1.multiply(x,y);
      System.out.println("Result is "+result);
	}
}
