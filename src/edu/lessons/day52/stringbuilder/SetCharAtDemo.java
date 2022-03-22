package edu.lessons.day52.stringbuilder;
class SetCharAtDemo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("buffer before = " + sb);
		char c1=sb.charAt(1);
		System.out.println("charAt(1) = " + c1);
		sb.setCharAt(1, 'i'); // replace 'e' with 'i'
		c1=sb.charAt(1);
		System.out.println("charAt(1) after setCharAt= " + sb.charAt(1));
		System.out.println("buffer after setCharAt= " + sb);
		System.out.println("length = " + sb.length());
		sb.setLength(2);
		System.out.println("length = " + sb.length());
		System.out.println("buffer after = " + sb);
	}
}