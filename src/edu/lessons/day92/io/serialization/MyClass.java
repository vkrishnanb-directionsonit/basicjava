package edu.lessons.day92.io.serialization;
import java.io.Serializable;
// Myclass object is a member of Emp class
@SuppressWarnings("serial")
public class MyClass implements Serializable
{
	String s;
	int i;
	double d;
	public MyClass(String s, int i, double d)
	{
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString()
	{
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}