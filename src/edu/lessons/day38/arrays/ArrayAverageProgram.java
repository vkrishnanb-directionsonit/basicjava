package edu.lessons.day38.arrays;
public class ArrayAverageProgram
{
	public static void main(String args[])
	{
		float nums[]={10.1f,23.4f,12.3f,13.4f,44.6f};
		findSumandAverageOfaFloatArray(nums);		
    }
	public static void findSumandAverageOfaFloatArray(float[] nums)
	{
		//write code to find the sum, and average of nums
		double result=0;
		int count=nums.length;
		for(int I=0;I<count;I++)
 		{
			System.out.print(nums[I]+",");
 		}
		System.out.println();
 		for(int I=0;I<count;I++)
 		{
 			result=result+nums[I];
 		}
 		System.out.println("Sum is "+result);
        System.out.println("Average is "+result/count);
	}
	
	public static void findTheLargestNumberinArray(float[] nums)
	{
		//write code to find the largest number
		double result=nums[0];
		int count=nums.length;
 		for(int I=1;I<count;I++)
 		{
 			if(result<nums[I])result=nums[I];
 		}
        System.out.println("The Largest No is "+result);
	}
}