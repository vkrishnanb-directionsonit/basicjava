package edu.lessons.day52.stringbuilder;
class ReverseDemo
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("abcdef");
		System.out.println("Before reverse: " +s);

		s.reverse();
		System.out.println("After reverse: " +s);
	}
}