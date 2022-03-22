package edu.lessons.day60.oops.interfaces;
public class CalculatorB implements ICalculator 
{
	@Override
	public int add(int v1, int v2) 
	{
		return v1+v2;
	}
	
	@Override
	public int multiply(int v1, int v2) 
	{
		return v1*v2;
	}
	@Override
	public int divide(int v1, int v2) 
	{
		return v1/v2;
	}
}
