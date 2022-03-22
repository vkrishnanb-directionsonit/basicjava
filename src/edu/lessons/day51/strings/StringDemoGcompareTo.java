package edu.lessons.day51.strings;
public class StringDemoGcompareTo
{
	public static void main(String args[])
	{
		m1();
	 }
	public static void m1()
	{
        String s2="hello";
        String s3=new String("Hello");
        int x=s2.compareTo(s3);
		  System.out.println("compareTo "+x);
		  // not equal to Zero

		 x=s2.compareToIgnoreCase(s3);
		 System.out.println("compareToIgnoreCase "+x);
		 // equal to Zero
		 
		 String s4=new String("hello");
		 boolean flag=s2.equals(s4);
		 System.out.println("equals "+flag);// true
		 flag=(s2==s4);
		 System.out.println("=="+flag); // false
	}
	public static void m2()
	{
		String s1="Hello";
		String s2="Hello";
		String s3="Hello";
		String s4="Hello";
		String s5="Hello";
		String s6=new String("Hello");
		String s7=new String("Hello");
		String s8=s1+"";
		System.out.println(s1+""+s6);
		boolean flag=s1.equals(s6);
		System.out.println("s1.equals(s6) "+flag);
		flag=(s1==s6);
		System.out.println("s1==s6 "+flag);
	}

}
