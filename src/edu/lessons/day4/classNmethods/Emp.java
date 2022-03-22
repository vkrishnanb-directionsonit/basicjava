package edu.lessons.day4.classNmethods;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Emp 
{
	//fields
	public final int id; // read only 
	public String name; 
	
	public double salary;
	public String city; 
	public final Date dob;//read only
	public static final String Country="India";//constant
	public static String Company;
	//constructors
	public Emp()
	{
		id=1;
		dob=new GregorianCalendar().getTime();
	}
	public Emp(int v1)
	{
		id=v1;
		dob=new GregorianCalendar().getTime();
	}
	public Emp(int v1, String s1,double d1,String c1,Date d2)
	{
		id=v1; 
		name =s1;
		salary =d1; 
		city=c1;
		dob=d2;
	}
	//methods
	public int getAge()
	{
		Calendar date = new GregorianCalendar();
		System.out.print(date);
		return Calendar.DATE; 
	}
	public void startWork()
	{
		System.out.print("Work Started");
	}
	protected void finalizer()
	{
		System.out.print("Finalizer");
	}
//inner class
	public class Address
	{
		public String DoorNo;
		public String StreetName;
		public String City;
		public String Country;
		public double Pincode;
		public void print()
		{
			System.out.println(DoorNo+" "+City+" "+Country);
		}
	}
}
