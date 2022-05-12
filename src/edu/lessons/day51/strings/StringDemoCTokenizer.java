package edu.lessons.day51.strings;

import java.util.StringTokenizer;

public class StringDemoCTokenizer
{
	public static void main(String args[])
	{
		usingStringTokenizer();
	}
	public static void stringTrimandSplit()
	{
	   String firstString="   Tom and Jerry are good friends   ";
	   System.out.println(firstString.length());
	   String trimmedString = firstString.trim();
	   System.out.println(trimmedString.length());
	   String[] data=trimmedString.split(" ");// firstString.trim().split(" ")
	   int count = data.length;
	   System.out.println("Word Count "+ count);
	   for(int index=0;index<count;index++)
	   {
		   System.out.println(data[index]);
	   }
	}
	public static void testStringTrim()
	{
		String secondString="   Hope         it            rain          ";
		System.out.println("Before Trim: "+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim: "+secondString.length());
		char[] c=secondString.toCharArray();
		int wordcount=0;
		for(int i=0;i<secondString.length()-1;i++)
		{
			if(c[i]==32) 
			{
				while(c[i+1]!=32) 
				{
					wordcount++;
					break;
				}
			}
		}
		System.out.println(++wordcount);
	}
	public static void usingStringTokenizer()
	{	 
	  StringTokenizer stringtokenizer = 
	         new StringTokenizer("  Hello   Geeks   How    are you  ", " ");
	  System.out.println("Before "+stringtokenizer.countTokens());
      while (stringtokenizer.hasMoreTokens()) 
            System.out.println(stringtokenizer.nextToken()); 
      System.out.println("After "+stringtokenizer.countTokens());
	}
	
	public static void stringTokenizerSecondConstructor()
	{
       StringTokenizer stringtokens =  
             new StringTokenizer("JAVA : Code : String", " :"); 
       System.out.println(stringtokens.countTokens());
       while (stringtokens.hasMoreTokens()) 
            System.out.println(stringtokens.nextToken()); 
       
      StringTokenizer tokenswithdelimiter =  
       new StringTokenizer("JAVA : Code : String", " :",  true); 
      System.out.println(tokenswithdelimiter.countTokens());
      while (tokenswithdelimiter.hasMoreTokens()) 
    	  System.out.println(tokenswithdelimiter.nextToken()); 
	}
}

//"a=100;b=50;c=a+b;print c;"
