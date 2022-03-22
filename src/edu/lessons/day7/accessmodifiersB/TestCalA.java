package edu.lessons.day7.accessmodifiersB;

import edu.lessons.day7.accessmodifiersA.Calculator;

public class TestCalA
{
	public static void main(String args[])throws Exception
	{
		int x=100;
		int y=200;
		Calculator c1=new Calculator();
		int result=c1.add(x,y); //call to public method
		System.out.println("Public method "+result);
		
		//illegal calls -- different package
		//result=c1.multiply(x,y);//call to protected method
		//System.out.println("Protected Method "+result);
		//result=c1.substract(x,y);//call to default / friend method
		//System.out.println("Default Method "+result);
		//result=c1.divide(x,y);//call to private method
	}
}