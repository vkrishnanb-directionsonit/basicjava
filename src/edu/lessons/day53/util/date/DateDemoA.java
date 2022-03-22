package edu.lessons.day53.util.date;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class DateDemoA 
{
	public static void test()
	{	
		displayDOB();
	}	
	public static void displayCurrentDate()
	{
		Calendar cal = Calendar.getInstance();// factory method
		Date date = cal.getTime();
		try
		{
			System.out.println(date);
			SimpleDateFormat f1=new SimpleDateFormat("yyyy-MMM-dd");
		    System.out.println(f1.format(date));
		    SimpleDateFormat f2=new SimpleDateFormat("EEEE",Locale.ENGLISH);
		    System.out.println(f2.format(date));
		} catch (Exception e1) 
		{
		    e1.printStackTrace();
		}
	}
	
	public static void displayDOB()
	{
		Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your DOB:(yyyy-mm-dd) ");
		String dob= sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dob.substring(0, 4));
		int month = Integer.parseInt(dob.substring(5, 7))-1;
		int day = Integer.parseInt(dob.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
		Calendar date = new GregorianCalendar(year,month,day);
		Date d1=date.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println("DOB "+f1.format(d1));
	}
	
	public static void displayDOBA()
	{
		Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your Year Of Birth:(yyyy)");
		int year =sc.nextInt();sc.nextLine();
		System.out.println("Enter your Month Of Birth :(mm) ");
		int month =sc.nextInt()-1;sc.nextLine();
		System.out.println("Enter your Date Of Birth:(dd) ");
		int day =sc.nextInt();sc.nextLine();
		System.out.println(year+"-"+month+"-"+day);
		Calendar dobCalendar = new GregorianCalendar(year,month,day);
		Date d1=dobCalendar.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("DOB "+f1.format(d1));
		sc.close();
	}
	
	public static void displayAge()
	{
		SimpleDateFormat f1=new SimpleDateFormat("yy-MM-dd");
		Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your DOB:(yyyy-mm-dd) ");
		String stdob= sc.nextLine();
		sc.close();
		int dobyear = Integer.parseInt(stdob.substring(0, 4));
		int dobmonth = Integer.parseInt(stdob.substring(5, 7))-1;
		int dobday = Integer.parseInt(stdob.substring(8,10));
		Calendar dobCalendar = 
				new GregorianCalendar(dobyear,dobmonth,dobday);
		System.out.println("DOB "+f1.format(dobCalendar.getTime()));
		//
		Calendar currentCalendar = Calendar.getInstance();
		int years=currentCalendar.get(Calendar.YEAR)-
				dobCalendar.get(Calendar.YEAR);
		System.out.println("Age Years "+years);
		int months=currentCalendar.get(Calendar.MONTH)-
				dobCalendar.get(Calendar.MONTH);
		System.out.println("Age months "+months);
		int days=currentCalendar.get(Calendar.DATE)-
				dobCalendar.get(Calendar.DATE);
		System.out.println("Age days "+days);
		Calendar ageCalender=new GregorianCalendar(years,months,days);
		System.out.println("Age "+f1.format(ageCalender.getTime()));
	}
}
