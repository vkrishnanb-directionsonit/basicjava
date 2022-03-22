package edu.lessons.day3.premitiveTypes.ex;
public class RecursionA
{
	public static void main(String[] args)
	{
		int x=m1(10);
		System.out.println("\tInside Main => "+x);
	}
	public static  int m1 (int aVariable)  
	{  
	  System.out.println("\t aVariable=> "+aVariable);  
	  aVariable--;  
	  if (aVariable == 0)  return 0;  
	  int y=m1(aVariable);
	  System.out.println("*aVariable=> "+aVariable+" y=>"+y);
	  return y;  
	}
}