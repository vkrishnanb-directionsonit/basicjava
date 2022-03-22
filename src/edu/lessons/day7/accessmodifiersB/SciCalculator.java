package edu.lessons.day7.accessmodifiersB;

import edu.lessons.day7.accessmodifiersA.Calculator;

//child class from another package
public class SciCalculator extends Calculator
{
	public void display()
	{
		int x=100;
		int y=200;
		System.out.println("Sample C. Display");
		int result=super.multiply(x,y);//call to protected method
		System.out.println("multiply "+result);
		this.multiply(x, y);
		//  illegal from another package
		/*result=super.substract(x,y);//call to default / friend method
		System.out.println("substract "+result);
		result=super.divide(x,y);// call to private method
		System.out.println(result);*/
		//this.substract(x,y);//can not inherit default methods from different package
	}
}