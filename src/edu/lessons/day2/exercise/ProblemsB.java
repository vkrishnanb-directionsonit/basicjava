package edu.lessons.day2.exercise;
import java.util.Scanner;
public class ProblemsB {
	/*
	 * Get a 3 digit number from the user say 123
	 * Split the number as individual digits
	 * Find the cube of each no
	 * add the result
	 * check if the input number and the output number are the same 
	 * 
	 */
	public static void questionA(){
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int inputValue=sc.nextInt();
		int outputValue=0;
		int reminderValue=0;
		for(int i=0;i<3;i++)
		{
			reminderValue=inputValue%10;
			inputValue=inputValue/10;
			System.out.println(reminderValue);
			outputValue+=Math.pow(reminderValue, 3);
		}
		System.out.println("Sum of the cubes Output "+outputValue);
		if(inputValue==outputValue)
		{
			System.out.println("Same numbers");
		}
		else
		{
			System.out.println("Not the Same numbers");
		}
		sc.close();
	}
	/*
	 * 1546903 Find the even digits in the given numbers 
	 */
	public static void questionB()
	{
		int inputnumber=1546903;
		int reminderValue=0;
		while(inputnumber!=0)
		{
			reminderValue=inputnumber%10;
			inputnumber=inputnumber/10;
			if(reminderValue%2==0)System.out.println(reminderValue+" is an Even No");
		}
	}
	/* 
	 * What is the output of 
	 * System.out.println(1 + 2 + "3"); and
	 * System.out.println("1" + 2 + 3);
	 */
	public static void questionC()
	{
		System.out.println(1 + 2 + "3");// output: 33

		System.out.println("1" + 2 + 3);// output:123
	}
}
