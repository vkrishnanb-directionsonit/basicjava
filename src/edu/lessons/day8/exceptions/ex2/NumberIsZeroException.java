package edu.lessons.day8.exceptions.ex2;
//custom Exception
public class NumberIsZeroException extends Exception
{
	public NumberIsZeroException()
	{
		super("Number must be Greater than Zero!!!");
	}
	public NumberIsZeroException(String msg)
	{
		super(msg);
	}
	public NumberIsZeroException(String msg,Throwable cause)
	{
		super(msg,cause);
	}
}