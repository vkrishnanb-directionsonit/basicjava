package edu.lessons.day7.accessmodifiersA;
public class Calculator// public or default
{
	public Calculator()
	{
		System.out.println("Default Parent");
	}
    public int add(int x,int y)
    {
       return x+y;
    }
    protected int multiply(int x,int y)
	{
	        return x*y;
    }
    private int divide(int x,int y)
	{
	        return x/y;
    }
    //default / friend
    int substract(int x,int y)
    {
		return x-y;
	}
	public int echo(int v1,int v2)
	{
		return divide(v1,v2);
	}
}
