package edu.lessons.day52.stringbuilder;
class ReplaceDemo
{
	public static void main(String args[])
	{
		StringBuffer stringbuffer = new StringBuffer("This is a test.");
		System.out.println("Before replace: " + stringbuffer);
		System.out.println("Length "+stringbuffer.length());

		stringbuffer.replace(5, 7, "was");
		System.out.println("After replace: " + stringbuffer);
		System.out.println("Length "+stringbuffer.length());

	}
}