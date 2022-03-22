package edu.lessons.day4.innerClass;

import edu.lessons.day4.innerClass.Emp.Address;

public class EmpChild extends Emp {
	public void startWork()
	{
		if(address==null)address=new Address();
		//address.x=500;
		//System.out.println("Work Started "+address.x);
		System.out.println("Work Started by Child");
		
	}
}
