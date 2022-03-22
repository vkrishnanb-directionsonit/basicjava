package edu.lessons.day51.strings;
public class StringDemoB
{
	public static void main(String args[])
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a Sentence");
		String firstString="";
		try {
			firstString = scanner.nextLine();
		} finally {
			scanner.close();
		}
		System.out.println(firstString);
		String stringInUppercase=firstString.toUpperCase();
		System.out.println("toUpperCase="+stringInUppercase);
		
		System.out.println("s1="+firstString);
		String stringInLowercase=firstString.toLowerCase();
		System.out.println("toLowerCase="+stringInLowercase);
//substring
		//from the 4th char till end
		String substring=firstString.substring(3);
		System.out.println(substring);
		// from 3rd char to 6th char (i.e excluding 7th char)
		// from index 2 to index 5
		substring=firstString.substring(2,6);		
		System.out.println(substring);
//replace
		String replacedstring=firstString.replace('a','e');
		System.out.println(replacedstring);
// equals
		boolean flag1 = firstString.equals(stringInUppercase);
		System.out.println(flag1);		
// equalsIgnoreCase
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase);
		System.out.println(flag);
	}
}
