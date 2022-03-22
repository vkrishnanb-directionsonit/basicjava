package edu.lessons.day4.classNmethods;

public class Phone
{
	private double phoneno;
	private String model;
	private String plan;
	private String type;
	private int memory;
	
    public Phone(double no)
    {
    	phoneno=no;
    	model="General";
    	plan="Basic";
    	type="Basic";
    	memory=2;
    }
    public Phone(double no,String m1)
    {
    	phoneno=no;
    	model=m1;
    	plan="Basic";
    	type="Basic";
    	memory=2;
    }
    public Phone(double no,String m1,String p1)
    {
    	phoneno=no;
    	model=m1;
    	plan=p1;
    	type="Basic";
    	memory=2;
    }
	
	public void makeacall(double no)
	{
		System.out.println("make a call to"+no);
	}
	public void receiveacall(double no)
	{
		System.out.println("receiving a call from "+no);
	}
	public void sendsms(double no,String msg)
	{
		System.out.println("the message "+msg +" sent to "+no);
	}
	public void receivemsg(double no,String msg)
	{
		System.out.print("Received Message " +msg);
		System.out.println("From no:"+no);
	}
	public void addcontact(double no,String name)
	{
		System.out.print("Contact "+name +" With no:"+no);
		System.out.println("Added to AddressBook");
	}
	public void findcontact(double no)
	{
		System.out.println("contact no:"+no);
	}
	public void removecontact(double no)
	{
		System.out.print("contact no:"+no);
		System.out.println(" removed");
	}
	public void echo()
	{
		System.out.print("No:"+phoneno);
		System.out.print("Model "+model);
		System.out.print("Plan"+plan);
		System.out.print("Type:"+type);
		System.out.print("Memmory:"+memory);
	}
}


