package edu.lessons.day60.oops.interfaces;

public abstract class CalculatorA implements ICalculator
{
	public CalculatorA()
	{
		System.out.println("Object Created ");
	}
	public int subtract(int v1,int v2)
	{
		return v1-v2;
	}
}
//If a class does not implement any or all the methods 
//of an interface then the class must be marked as abstract
//Abstract classes also can not be instantiated. 
//The Abstract class must also be inherited.