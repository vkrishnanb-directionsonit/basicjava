package edu.lessons.day52.stringbuilder;
class InsertDemo
{
	public static void main(String args[])
	{
		String firstString="I Tom and Jerry";
		StringBuffer stringbuffer = new StringBuffer(firstString);
		System.out.println("Before "+stringbuffer);
		System.out.println("Length "+stringbuffer.length());

		stringbuffer.insert(2, "like ");
		System.out.println("After Insert "+stringbuffer);
		System.out.println("Length "+stringbuffer.length());
	}
}