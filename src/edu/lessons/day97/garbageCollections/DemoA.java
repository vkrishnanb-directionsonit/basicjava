package edu.lessons.day97.garbageCollections;
public class DemoA
{
	public static void main(String args[])throws Exception
	{
			String s1="Hello";
			System.out.println("Before "+s1);
			for(int i=0;i<1000000;i++)
			     s1+=i;// s1="Hello";
			System.out.println("After "+s1);
	}
}