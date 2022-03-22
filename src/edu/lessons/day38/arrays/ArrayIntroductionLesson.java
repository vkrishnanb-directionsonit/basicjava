package edu.lessons.day38.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntroductionLesson {
	
	public static void main(String[] args) {
		

	}
	
	
	public static void creatingSingleDimensionIntArrays()
	{		
		int firstintArray[] = new int[10];
		//int secondintArray[4] = {1, 2, 3, 4};	
		int secondintArray[] = {1, 2, 3, 4};		
	}
	public static void creatingArrays()
	{
		int firstValue = 100;
		System.out.println("firstValue "+firstValue);
		int[] numbers= {10,20,30,40,50};
		int lengthofnumbers=numbers.length;
		System.out.println("length of numbers= "+lengthofnumbers);
		for(int x:numbers)
		{
			System.out.print(x + ",");
		}
		System.out.println();
		
		Scanner scanner=new Scanner(System.in);
		int days[];
		System.out.println("Enter size for days");
		int size = scanner.nextInt();
		days = new int[size];
		int lengthofdays=days.length;
		System.out.println("No of Days "+lengthofdays);
		
		for(int i=0;i<lengthofdays;i++)
		{
			int value=(int) (Math.random()*10);			
			days[i]=value;
		}
		
		for(int x:days)
		{
			System.out.println(x);
		}
		scanner.close();
	}
	/**
	   * int[] numbers = {11,13,11,20,11,13,2};
	   * Find the size / Length (no of items) of the array
	   * remove duplicate elements from an Array and return it
	   * SOLUTION:
	   * 	Step  1: numbers.length gives the length of the array
	   * 	Step  2: Sort the Array
	   * 	Step  3: Create an int variable to store the count of unique number
	   * 	Step  4: Create a Temp Array. 
	   * 			The size of the Temp array is same as numbers
	   * 	Step  5: Loop through numbers array from index 0(ZERO) to lastindex - 1
	   *  	Step  6: Compare each number with the next number
	   *  	Step  7: If current number is == next number ignore the current number
	   *  	Step  8: Else Copy the Current Number to the Temp Array and increament the uniqueNumber count
	   *  	Step 10: Copy the value of the last index also to Temp Array
	   *  	Step 11: Now the Temp Array has only unique numbers
	   *    		 but length is more than the count of unique numbers,
	   *    		 those index will be filled with 0(ZERO)
	   *    Step 12: Hence to have an array with exact length, equal to the 
	   *    		 count of Unique numbers - we create a new Array
	   *    		 int[] uniqueNumbers = new int[uniqueNumberCount];
	   *    Step 13: Copy the unique numbers from Temp to  uniqueNumbers Array.
	   *    Step 14: Return array uniqueNumbers.
	   *    Step 15: JOB DONE :)
	   */
	  public static void solutionToRemovingDuplicateNumbersFromArray()
	  {
		  int[] numbers = {11,13,11,20,11,13,2};
		  int lengthofnumbers = numbers.length;
		  System.out.println("Length is "+lengthofnumbers);	
		  Arrays.sort(numbers);
		  ArraysDemo.display(numbers);
		  int[] tempNumbers=new int[lengthofnumbers];	 
		  int uniqueNumberCount = 0;		  
	        for (int i = 0; i < lengthofnumbers - 1; i++) 
	        {
	            if (numbers[i] != numbers[i + 1]) {
	                tempNumbers[uniqueNumberCount++] = numbers[i];
	            }
	        }
	  
	        tempNumbers[uniqueNumberCount++] = numbers[lengthofnumbers - 1];
	        int[] uniqueNumbers = new int[uniqueNumberCount];
	        // Creating Array with Unique Values from the original array
	        for (int i = 0; i < uniqueNumberCount; i++) {
	        	uniqueNumbers[i] = tempNumbers[i];
	        }
	        ArraysDemo.display(uniqueNumbers);
	  }
}
