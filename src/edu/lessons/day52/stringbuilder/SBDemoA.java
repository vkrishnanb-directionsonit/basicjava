package edu.lessons.day52.stringbuilder;

class SBDemoA
{
	public static void main(String args[])
	{
		usingStringBuffer();
	}
	public static void usingStringBuffer()
	{
		String firstString="Hello how are you today. Is the weather hot or cold.";
		StringBuffer stringbuffer = new StringBuffer();
		System.out.println("length = " + stringbuffer.length());
		System.out.println("capacity = " + stringbuffer.capacity());	
		
		stringbuffer.ensureCapacity(250);
		System.out.println("length = " + stringbuffer.length());
		System.out.println("capacity = " + stringbuffer.capacity());	
		
		stringbuffer.append(firstString);
		System.out.println("buffer = " + stringbuffer);
		System.out.println("length = " + stringbuffer.length()); 
		System.out.println("capacity = " + stringbuffer.capacity());	
//		
		firstString="Wish it rains this week";
		stringbuffer.append(firstString);
		System.out.println("buffer = " + stringbuffer);
		System.out.println("length = " + stringbuffer.length());
		System.out.println("capacity = " + stringbuffer.capacity());
////		
		stringbuffer.trimToSize();//reduce capacity to length
		System.out.println("\tlength = " + stringbuffer.length());
		System.out.println("\tcapacity = " + stringbuffer.capacity());
//	
	}
	
	public static void checkTimeTakenByStringBuffer()
	{
		String s1="Hello";
		StringBuffer sb = new StringBuffer ( s1);
		sb.ensureCapacity(5888894);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		System.out.println("Started: ");
		long start, end;
		start = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i++)	
			sb.append(i);
		
		//s1=sb.toString();
		
       end = System.currentTimeMillis(); // get ending time
       System.out.println("Elapsed time: " + (end-start));
       System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
       //System.out.println(sb.toString());
		
	}

	
}