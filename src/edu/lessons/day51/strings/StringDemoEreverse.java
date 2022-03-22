package edu.lessons.day51.strings;

public class StringDemoEreverse {
	// Write code to reverse a String
	public static void reverse()
	{
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence="";
		try {
			sentence = scanner.nextLine();
		} finally {
			scanner.close();
		}
		// TODO: reverse the sentence here
	}
	public static void reverseStringSolution()
	{
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence="";
		try {
			sentence = scanner.nextLine();
		} finally {
			scanner.close();
		}
		char[] data=sentence.toCharArray();
		String result="";
		int count = data.length;
		for(int i=(count-1);i>=0;i--)
		{
			result+=data[i];
		}
		System.out.println( result);
	}
	public static void main(String[] args) 
	{
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s1=scanner.nextLine();
		s1=reverse(s1);
		System.out.println(s1);
		scanner.close();
	}
	public static String reverse(String str)
	{
		char[] data=str.toCharArray();
		String result="";
		for(int i=(data.length-1);i>=0;i--)
		{
			result+=data[i];
		}
		return result;
	}
	
}
