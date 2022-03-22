package edu.lessons.day53.util.date.ex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Retirement {
	public static void main(String[] args)
	{
		SimpleDateFormat dt1 = new SimpleDateFormat("MMM-dd-yyyy");		
		Scanner sc= new java.util.Scanner(System.in);

		System.out.println("Enter your DOB:(yyyy/mm/dd) ");
		String dob= sc.next();
		while(!isDate(dob))
		{
			System.out.println("Enter your DOB:(yyyymmdd) [Q to quit]");
			 dob= sc.next();
			 if(dob.charAt(0)=='Q') return;
		}
		sc.close();
		int year = Integer.parseInt(dob.substring(0, 4));
		int month = Integer.parseInt(dob.substring(4, 6))-1;
		int day = Integer.parseInt(dob.substring(6,8));
		Calendar date = new GregorianCalendar(year,month,day);
		Date d1=date.getTime();
		System.out.println("DOB "+dt1.format(d1));
		
		date.add(Calendar.YEAR,60);//adding 65 years to DOB
		date.add(Calendar.MONTH, 1); //adding 1 month to DOB
		date.set(Calendar.DAY_OF_MONTH, 1);  //1st day of Month
		date.add(Calendar.DATE, -1);  //last day of the previous month
		System.out.println("Retirement Date "+dt1.format(date.getTime()));
	}
	public static boolean isDate(String s1)
	{
		boolean flag=false;
		char[] data=s1.toCharArray();
		for(char c : data)
		{
			int x=(int)c;
			if(x<47||x>57)
			{
				System.out.println("Please enter DOB in numerical form like 19950312(yyyymmdd)");
				flag=false;
				break;
			}
			else
			{
				if(s1.length() < 8 ||s1.length() > 8)
				{
					System.out.println("DOB must have 8 nos, Please enter DOB in the format YYYYMMDD...");
					break;
				}
				int year = Integer.parseInt(s1.substring(0, 4));
				if(year<1955 || year>2015)
				{
					System.out.println(year +" Invalid Year, Year must be between 1954 .. 2014");
					break;
				}
				int month = Integer.parseInt(s1.substring(4, 6));
				if(month<1 || month>12)
				{
					System.out.println(month+" Invalid Month, Month must be between 01 .. 12 ");
					break;
				}
				int day = Integer.parseInt(s1.substring(6,8));
				if(day<1 || day>31)
				{
					System.out.println(day+" Invalid day, Day must be between 01 .. 31 ");
					break;
				}
				flag=true;
			}
		}
		return flag;
	}
}
