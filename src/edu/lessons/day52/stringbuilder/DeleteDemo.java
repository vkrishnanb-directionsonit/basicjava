package edu.lessons.day52.stringbuilder;

class DeleteDemo
{
	public static void main(String args[])
	{
		String s1="This is a test to check String Buffer..";
		StringBuffer stringbuffer = new StringBuffer(s1);
		System.out.println("Before delete: " + stringbuffer);
		System.out.println("Length "+stringbuffer.length());
		System.out.println("Capacity "+stringbuffer.capacity());
		
		stringbuffer.delete(4, 7);//from index 4 to 7 - 3 char
		System.out.println("After delete: " + stringbuffer);
		System.out.println("Length "+stringbuffer.length());
		System.out.println("Capacity "+stringbuffer.capacity());
		
		stringbuffer.deleteCharAt(0);
		System.out.println("After deleteCharAt: " + stringbuffer);
		System.out.println("Length "+stringbuffer.length());
		System.out.println("Capacity "+stringbuffer.capacity());
		
	}
}