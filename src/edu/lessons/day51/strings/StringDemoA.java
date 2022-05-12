package edu.lessons.day51.strings;
public class StringDemoA
{
	public static void stringCreation()
	{
		String s1=new String();
		System.out.println("s1=new String()=> "+s1);
		char data1[]={'a', 'b', 'c', 'd', 'e', 'f'};
		String s2=new String(data1);
		System.out.println("s2=new String(data1)=> "+s2);
		String s3=new String(data1,2,3); 
		System.out.println("s3=new String(data1,2,3)=> "+s3);		
		String s4=new String (s2);
		System.out.println("s4=new String (s2)=> "+s4);
		byte ascii[]={65,66,67,68,69};
		String s5=new String(ascii);
		System.out.println("s5=new String(ascii)=> "+s5);//ABCDE
	}
	
	public static void multipleStringwithSameValue()
	{
		int x=100;
		int y=100;
		int z=100;
		int i=100;		
		String s1="Hello";
		String s2="Hello";
		String s3="Hello";
		String s4="Hello";		
		System.out.println(s1+"***"+s2);
		s1="Welcome";
		System.out.println(s1+"***"+s2);
		s3="Welcome";
		String s6="Hello";		
		String s5=new String("Hello");
		System.out.println(s5);
	}
	
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1="Hello";
		}
		
		String s2="Hello";
		for(int i=0;i<10;i++)
		{
			s2 ="Hello";
		}
		for(int i=0;i<10;i++)
		{
			s2 +=i+" "; // 0 1 2 3 4 5 6 ..9
			System.out.println(s2);
		}
	}
	
	public static void stringToCharArray()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString="";
		try {
			firstString = scanner.nextLine();			
		} finally {
			scanner.close();
		}
//		int stringlength=firstString.length();
//		System.out.println("Length "+stringlength);
		char[] data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length "+dataarraylength);
		for(int x=0;x<dataarraylength;x++)
		      System.out.print(data[x]+" "+(int)data[x]);
	}
}
