package edu.lessons.day4.classes;

public class MyClass 
{
	Long var;
	// (1) Not a constructor, this is a method
	public void MyClass(long param) 
	{ 
		var = param; 
		System.out.println("Inside Method "+var);
	} 
	
}