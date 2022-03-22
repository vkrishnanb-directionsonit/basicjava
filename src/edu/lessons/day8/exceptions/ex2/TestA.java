package edu.lessons.day8.exceptions.ex2;

import java.util.Scanner;

public class TestA
{
   public static void main(String[] args)
   {
		A.m1();
   }
    public static void m1()throws Exception
   {
    	java.util.Scanner sc=new Scanner(System.in);
    	System.out.println("Enter value for X");
    	String s1=sc.nextLine();
    	System.out.println("Enter value for Y");
    	String s2=sc.nextLine();
    	int x=0;
      	int y=0;
      	double z=0;
      	ClassA a1=null;
      	 x=Integer.parseInt(s1);
		  y=Integer.parseInt(s2);
   		a1=new ClassA();
   		z=a1.execute(x, y) ;
   		System.out.println("Result is "+z);
   }
   public static void m2() throws Exception
   {
	java.util.Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for X");
	String s1=sc.nextLine();
	System.out.println("Enter value for Y");
	String s2=sc.nextLine();
	int x=0;
	int y=0;
	double z=0;
	CalculatorB c1=null;	
	try
   	{
		x=	Integer.parseInt(s1);
		y=	Integer.parseInt(s2);
		c1=new CalculatorB();
		z=c1.divide(x,y);
   		System.out.println("Result in Main "+z);
   	}catch(NumberFormatException err)
   	{
   		System.out.println("Error1 Inside Main "+err.getMessage());
   		err.printStackTrace();
   	}
  	catch(NumberIsZeroException err)
   	{
   		System.out.println("Error2 Inside Main "+err.getMessage());
   		err.printStackTrace();
   		throw err;//re throw
   	}
   	catch(Exception err)
   	{
   		System.out.println("Error3 Inside Main "+err.getMessage());
   		err.printStackTrace();
	}
   }
   //
   //Exceptions that inherit from RuntimeException do not have to be caught
   //even if declared by a method (executeC)
   //Method m3() need not try-catch the call to the method executeC because 
   // it throws exceptions that descend from RuntimeException. 
   //In fact the executeC method need not have to be declared the exception 
   //that descend from RuntimeException
   //
   public static void m3()
	{
		ClassB b1=new ClassB();
		int x[]={10,0,20};
		int z=b1.executeTaskC(x);
		System.out.println("Result "+z);
	}
}