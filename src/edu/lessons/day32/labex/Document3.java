package edu.lessons.day32.labex;
//Write a program to prevent division by zero using Ternary Operator (?:).
 public class Document3 //PreventZeroDiv
 { 
	public static void main(String args[])
 	{
		for(int i = -5; i < 6; i++)
		{
 		  if(i != 0 ? true : false)
		     System.out.println("100 / " + i + " is " + 100 / i);
		}
	} 
  }