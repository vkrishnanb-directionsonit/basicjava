package edu.lessons.day32.labex;
//Write a program to show the difference in the range of value of  
//integer and double using Modulus operator.

class TestResult
 {
	 public static void main(String args[])
	{
		 int iresult, irem; double dresult, drem;
 		 iresult = 10 / 3; 
		 irem = 10 % 3;
		 System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
		 
 		dresult = 10.0 / 3.0;
 		drem = 10.0 % 3.0;
		System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
	} 
 }