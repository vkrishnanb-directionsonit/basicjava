package edu.lessons.day51.strings;

import java.util.StringJoiner;

public class StringDemoEJoiner {
	public static void main(String[] args) {
		testStringJoinerwithDelimeter();
	}
	public static void testStringJoinerwithDelimeter()
	{
		StringJoiner joiner = new StringJoiner(",");
		String colorOne = "Red";
		String colorTwo = "Green";
		String colorThree = "Blue";
		joiner.add(colorOne);
	    joiner.add(colorTwo );
	    joiner.add(colorThree);
	    // Red,Green,Blue
	    System.out.println(joiner.toString()); 
	}
	public static void testStringJoinerwithPrefixSuffix()
	{
		String PREFIX="[";
		String SUFFIX="]";		
		StringJoiner joiner2 = new StringJoiner(":", PREFIX, SUFFIX);
		joiner2.add("Red").add("Green").add("Blue");
		// [Red:Green:Blue]	
		System.out.println(joiner2.toString()); 
	}
}
