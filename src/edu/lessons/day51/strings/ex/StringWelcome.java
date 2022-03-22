package edu.lessons.day51.strings.ex;

public class StringWelcome
{
	public static void main(String[] args)
	{
		String str="Welcome! This is a hot Summer";
		System.out.println(str);
		//Convert all alphabets to capital letters and print out the result;
		String str1=str.toUpperCase();
		System.out.println(str1);
		//Convert all alphabets to lower-case letters and print out the result;
		str1=str.toLowerCase();
		System.out.println(str1);
		//Print out the length of the string.
		System.out.println("Length "+str.length());
		//  Print out the index of the word hot.
		System.out.println("IndexOf 'hot' "+str.indexOf("hot"));
	}
}
