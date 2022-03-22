package edu.lessons.day7.accessmodifiersC;

import java.util.Date;

public class Emp
{
/*	//fields
		public final int id;
		public String name; 
		//{name length must be > 2 char but < 15 char }
		//must have only alphabets
		public double salary;
		//salary Must be > 10000, 
		//Must be multiples of 500, Must be < 2500000
		public String City; 
		//city in Chennai, Madurai, Mumbai
		public final Date dob;
		//{Age Must be atleast 22 years old today 
		//but not more than 58 years }
		public static final String Country="India";
*/	
	//**
	private int eno;
	private String fname;
	public int getEno()
	{
		if(eno<=0)
		{
			System.out.println("Value for Emp No not Assigned");
		}
		return eno;
	}
	public void setEno(int intValue)
	{
		if(intValue<=0)
		{
			System.out.println("Value must be > Zero");
			return;
		}
		this.eno = intValue;
	}
	public String getFname()
	{
		if(fname==null || fname=="")
		{
			System.out.println("First Name not Assigned");
			return "";
		}
		return fname;
	}
	public void setFname(String str)
	{
		if(str==null || str=="")
		{
			System.out.println("First Name must not be Empty or Null");
			return ;
		}
		this.fname = str;
	}
	public String toString()
	{
		return "Eno="+eno+", Name="+fname;
	}
}