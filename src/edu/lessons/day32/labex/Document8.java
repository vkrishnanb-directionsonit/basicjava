package edu.lessons.day32.labex;
//Write a program to calculate Factorial of a Number?
 class Factorial
 { 
	public static void main(String args[])
	{
 		int sum = 0;
		int fact = 1;
 		// compute the factorial of the numbers through 5 
		for(int i = 1; i <= 5; i++)
		{
 		 sum += i;
 		 // i is known throughout the loop
		 fact *= i; 
		}
		System.out.println("Sum is " + sum);
 		System.out.println("Factorial is " + fact);
	 } 
 }