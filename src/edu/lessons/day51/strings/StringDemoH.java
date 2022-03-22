package edu.lessons.day51.strings;

public class StringDemoH
{
	public static void main(String args[])
	{
		timeTakentoCreateStrings();
	}
	public static void calculateTimeTaken()
	{
		System.out.println("Started: ");
		long start, end;
		start = System.currentTimeMillis();
		int x=0;
		for(int i=0;i<1000000;i++)
		{
			x=100;
		}
		System.out.println(x);
       end = System.currentTimeMillis(); // get ending time
       System.out.println("Elapsed time: " + (end-start));
	}
	public static void timeTakentoCreateStrings()
	{
		System.out.println("Started: ");
		long start, end;
		start = System.currentTimeMillis();
		String s1="Hello";
		for(int i=0;i<1000000;i++)	
			s1="Hello";
		System.out.println(s1);
        end = System.currentTimeMillis(); 
        System.out.println("Elapsed time: " + (end-start));
	}
	public static void timeTakentoModifyStrings()
	{
		System.out.println("Started: ");
		long start, end;
		start = System.currentTimeMillis();
		String s1="Hello";
		for(int i=0;i<1000000;i++) 
			s1=s1+i;
		
		end = System.currentTimeMillis(); 
		System.out.println("Elapsed time: " + (end-start));
	}
}
