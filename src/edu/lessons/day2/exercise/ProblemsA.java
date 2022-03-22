package edu.lessons.day2.exercise;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ProblemsA 
{
	/*
	 * Solve the equation 2x^2 + x + 5 for all numbers 
	 * between 5 and 10 for x.
	 */
	public static void ex1()
	{
		double result=0;
		for(int x=5;x<=10;x++)
		{
			//result=2*(x*x)+x+5;
			result=2*Math.pow(x,2)+x+5;
			System.out.println("x="+x+"| (2x*x+x+5)="+result);
		}
	}
	/*
	 * Write a program to Generate a Random Number 
	 * in a given range of numbers (1 to 100)
	 * 
	 */
	public static void ex2()
	{
//		double d1=Math.round(Math.random()*100);
//		System.out.println("result is "+d1);
		Calendar cal = Calendar.getInstance();
		int no=cal.get(Calendar.MILLISECOND);
		if(no>100 && no<1000)
		{
		   no=no%100;
		}
		System.out.println("result is "+no);
	}
	// How to encrypt a value (a password or a PIN).
	public static void ex3()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your Password");
	  String pwd=sc.nextLine();
	  char[] data=pwd.toCharArray();
	  String newPwd="";
	  for(int i=0;i<data.length;i++)
	  {
		  newPwd +=(char)((int)data[i]+5);
	  }
	  System.out.println(newPwd);
	  sc.close();
	}
	/*
	 * Write a program that will take as input the user’s 
	 * bank account balance and the type and level of account they have. 
	 * Based on this information and the below rate table, 
	 * determine the interest rate they are receiving.	
	 * REFER the Word document for the table 
	 */	
	public static void ex4()
	{
	  java.util.Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your BankAccType: Personal/Business");
	  String AccountType=sc.nextLine();
	  System.out.println("Select BankAccLevel: Standard/Gold/Platinum");
	  String AccountLevel=sc.nextLine();
	  System.out.println("Enter your Account Balance");
	  double amt=sc.nextDouble();
	  double interest=0;
	  if(AccountType.equals("Personal"))
	  {
		  if(AccountLevel.equals("Standard"))
		  {
			  interest=amt*(1.2/100);
		  }else if(AccountLevel.equals("Gold"))
		  {
			  if(amt>=5000)
				  interest=amt*(2.3/100);
			  else if(amt>1000)
				  interest=amt*(1.9/100);
			  else
				  System.out.println("No Interest.MinBalance must be >=1000");
		  }
		  else
			  System.out.println("Invalid Acc Level. Must Be Standard/Gold");
	  }
	  else if(AccountType.equals("Business"))
	  {
		  if(AccountLevel.equals("Standard"))
		  {
			  if(amt>=1500)
				  interest=amt*(1.7/100);
			  else
				  System.out.println("No Interest. Min Balance must be >=1500");
		  }else if(AccountLevel.equals("Platinum"))
		  {
			  if(amt>=10000)
				  interest=amt*(2.5/100);
			  else
				  System.out.println("No Interest. Min Balance must be >=10000");
		  }
		  else
			  System.out.println("Invalid Acc Level. Must Be Standard/Platinum");
	  }
	  else
		  System.out.println("Invalid Acc type. Must Be Personal/Business");

	  System.out.println("Your interest is "+interest);
	  sc.close();
	}
	static class Char
	{
		 public static void doTask()
		 {
			/* while(true)
			 	{
			 		System.out.println("Hello");
			 	}
			*/ 
			/* while(false)
			 {
			 	System.out.println("Hello");
			 }
			*/
		
			do;
			while(false);
			do
			 {
				System.out.println("Hello");
			 }
			 while(false);
			}
	 }
}
 