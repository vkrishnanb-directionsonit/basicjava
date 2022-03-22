package edu.lessons.day37.staticMethods;
public class TestCalculator 
{
   static int x=0;
   static int y=0;
   int z=0;
   static java.util.Scanner sc=
		   new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		testAdd();
		testDivide();
		testMultiply();
		testSubtract();
		sc.close();
	}
	public static void m1() 	
	{
      int x=125;
      int y=5;
      int result=0;
      result=Calculator.add(x,y);
      System.out.println("Result is "+result);
      result=Calculator.divide(x,y);
      System.out.println("Result is "+result);
      result=Calculator.substract(x,y);
      System.out.println("Result is "+result);
      result=Calculator.multiply(x,y);
      System.out.println("Result is "+result);
	}
	private static void readData()
	{
		   System.out.println("Enter value for X");
		   x=sc.nextInt();
		   System.out.println("Enter value for Y");
		   y=sc.nextInt();
		   System.out.println("Enter value for Z");
		   TestCalculator c1=new TestCalculator();
		   c1.z=sc.nextInt();
	}
	public static void testAdd()
	{
	   readData();
	   int z=Calculator.add(x,y);
	   System.out.println("Result of Add "+z );	   
	}
	public static void testDivide()
	{
		readData();
		int z=Calculator.divide(x,y);
	   System.out.println("Result of Divide "+z );	   
	}
	public static void testMultiply()
	{
		readData();
		int z=Calculator.multiply(x,y);
	   System.out.println("Result of Multiply "+z );	   
	}
	public static void testSubtract()
	{
		readData();
		int z=Calculator.substract(x, y);
	   System.out.println("Result of Subtract "+z );	   
	}	
}
