package edu.lessons.day51.strings.ex;

public class CourseSpliter
{
	public static void main(String[] args)
	{
		if(null==args || args.length<1)
		{
			System.out.println("Arguments not provided");
			System.out.println("java CourseSpliter ABC 123 : Course Description");
			return;
	   }
		String course=args[0];
		String[] data=course.split(":");
		String[] data1=data[0].split(" ");
		System.out.println("Course Name: "+data1[0]);
		System.out.println("Course Number: "+data1[1]);
		System.out.println("Course Description: "+data[1]);

	}
}
