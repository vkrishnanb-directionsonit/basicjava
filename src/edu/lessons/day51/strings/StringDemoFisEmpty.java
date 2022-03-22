package edu.lessons.day51.strings;
public class StringDemoFisEmpty
{
	public static void main(String args[])
	{
		String S1=null;
		verifyString(S1);
		S1="";
		verifyString(S1);
		S1="Hello";
		verifyString(S1);
	}
	public static void verifyString(String s1)//verify and print
	{		
		  if(null!=s1)
		  {
		   System.out.print("String is NotNull ");
		   
		   if(!s1.isEmpty())
			  System.out.println("\t Not Empty "+s1.toString());
			else
		  	  System.out.println("\t String is Empty");
	      }
		  else
		  	System.out.println("String is Null");
	}
}