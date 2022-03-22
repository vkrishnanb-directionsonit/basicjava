package edu.lessons.day7.accessmodifiersB;


public class TestSciCalc
{
public static void main(String args[])throws Exception
	{
		int x=100;
		int y=200;
		SciCalculator c1=new SciCalculator();
		int result=c1.add(x,y); //call to public method
		System.out.println(result);
		c1.display();
	}
}