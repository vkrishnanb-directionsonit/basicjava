package edu.lessons.day51.strings;
import java.util.Scanner;
public class DemoECharArray 
{
	public static void m1()
	{
		char c1='a';		
		System.out.println("c1="+c1 + "ASCII "+(int)c1);
		char c2='A';
		System.out.println("c2="+c2 + "ASCII "+(int)c2);		
		
		int x=(int)c1;
		int y=(int)c2;
		System.out.println("c1="+c1 + " ASCII "+x);
		System.out.println("c2="+c2+ " ASCII "+y);
		
		char c3='z';
		char c4='Z';
		int x1=(int)c3;
		int y1=(int)c4;
		System.out.println("c3="+c3 + " ASCII "+x1);
		System.out.println("c4="+c4+ " ASCII "+y1);
		
		char c5='0';
		char c6='9';
		int x2=(int)c5;
		int y2=(int)c6;		
		System.out.println("c5="+c5 + " ASCII "+x2);
		System.out.println("c6="+c6+ " ASCII "+y2);
	}
	
	public static void m2ConvertStringToInteger() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		String s1=sc.next();
		char[] data=s1.toCharArray();
		int x=0;
		int mult=data.length-1;
		for(int i=0;i<data.length;i++)
		{
			x+=getNo(data[i])*getMultiplyr(mult);
			mult--;
		}
		System.out.println("Result is : "+x);
		sc.close();
	}
	private static int getNo(char c)//throws Exception
	{
		int no=c;
		if(no>47&&no<58) return no-48;
		else return 0;//throw new Exception("Char not a No");
	}
	private static int getMultiplyr(int no)
	{
		return(int) Math.pow(10, no);
	}
}
