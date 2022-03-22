package edu.lessons.day4.innerClass;

//outer class 
public class Emp 
{
	//fields
	public final int id; // read only 
	public String name; 
	int salary;
	private String company="ABCD Ltd";
	protected Address address;
	//constructors
	public Emp()	{	id=1;	}
	public Emp(int id)
	{
		int x=100;
		this.salary=x;
		this.id=id;
	}
	//methods
	public void startWork()
	{
		if(address==null)address=new Address();
		address.x=500;
		System.out.println("Work Started "+address.x);
		
	}
	
//inner class
	public class Address
	{
		public String DoorNo;
		public String StreetName;
		public String City;
		public String Country;
		public double Pincode;
		private int x;
		public Address()
		{
			Emp.this.address=this;
		}
		public void print()
		{
			System.out.println(this.DoorNo+" "+this.City+" "+this.Country);
			System.out.println(" id="+Emp.this.id + 
					" Salary=" + Emp.this.salary +
					" Company=" + Emp.this.company);
		}
		public Emp getOuterObject()
		{
			return Emp.this;
		}
		//Non static inner class can not have static methods
//		 public static void show()
//        {
//        	System.out.println("USB. PRINT");
//        }
	}
}