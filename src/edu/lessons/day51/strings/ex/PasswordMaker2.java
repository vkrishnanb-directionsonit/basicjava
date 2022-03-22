package edu.lessons.day51.strings.ex;


public class PasswordMaker2
{
	public static void main(String[] args)
	{
		if(null==args)
		{
			System.out.println("Arguments not provided");
			System.out.println("Provide Firstname Middlename Lastname age");
			return;
	   }
	   if(args.length<4)
		{
				System.out.println("Arguments must be as below");
				System.out.println("java PasswordMaker2  Firstname Middlename Lastname age");
			return;
		}
		String fName=args[0];
		String mName=args[1];
		String lName=args[2];
		int age=Integer.parseInt(args[3]);
		System.out.println(fName+","+mName+","+lName+","+age);
		String result=""+getMiddleChar(fName);
		result+=getMiddleChar(mName);
		result+=getMiddleChar(lName);
      result+=(age*100);
      System.out.println("Result "+result);
	}
	public static char getMiddleChar(String s)
	{
		int len=s.length();
		int m=len/2;
		return s.charAt(m);
	}
}
