package edu.lessons.day51.strings.ex;
import java.util.Scanner;
public class AnagramDemo
{
	//The pot is in the top floor He saw what was a good film 
	//hello the word parts is an anagram of strap and traps
	//Moreover 24 is 42 Please stop for pots
	
	String s1="The pot is in the top floor."+
	" He saw what was a good film."+
	" hello the word parts is an anagram of strap and traps."+
	" Moreover 24 is 42. Please stop for pots";
/*	catalogue	coagulate
	decimate	medicate
	exitation	intoxicate
	canoe	ocean
	englander	greenland
	sweat	waste
	inapt	paint
	observe	verbose
	below	elbow
	derision	ironside
	domino	monoid
	dusty	study
	bedroom	boredom
	meteor	remote
*/
	public static void main(String[] args)
	{
		String s1=null;
		System.out.println("Enter a sentence to check Anagrams");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		String sr=removepunct1(s1);
		System.out.println(sr);
		callAnag(sr);
		sc.close();
	}
	public static String removepunct1(String word)
	{
		char[] data=word.toCharArray();
		String s1=word;
		for(char c:data)
		{
			int x=(int)c;
			if (x >= 33 && x <= 46) s1=s1.replace(c, ' ');
		}
		return s1;
	}
	public static String removepunct(String word)
	{
		if (word.charAt(0) >= 33 && word.charAt(0) <= 46) {
			if(word.length() == 1){
				return "";
			} else {
			return " "+ removepunct(word.substring(1));
			}
		} else {
			if(word.length() == 1){
				return "" + word.charAt(0);
			} else {
			return word.charAt(0) + removepunct(word.substring(1));
			}
		}
	}
	
	public static void callAnag(String str)
	{
		int h;
		String[] sar=str.split(" ");
		int n=sar.length;
	    for(int j=0;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(sar[j].length()==sar[k].length())
				{
					if(!sar[j].equals(sar[k]))
					{
					  Boolean y=isAnagram(sar[j],sar[k]);
					  if(y)
					  {
						System.out.println("\t"+sar[j]+" "+sar[k]);
					  }
					}
				}
			}
		}
	}
	public static boolean isAnagram(String word,String anagram)
	{
			char[] chars = word.toCharArray();
			//loop through each character in `word`
			for (char c: chars) 
			{
			  int index = anagram.indexOf(c);
				//if it exists in `anagram`, remove it using a combination of `substring` calls, else return false
				if (index != -1)
				{
				  anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
				}
				else
				{
					return false;
				}
			}
		   return anagram.isEmpty();
	}
}
