package edu.lessons.day53.util.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Retirement {
	public static void main(String[] args)
	{
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");		
		Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your Year Of Birth:(yyyy)");
		int year =sc.nextInt();
		System.out.println("Enter your Month Of Birth :(mm) ");
		int month =sc.nextInt()-1;
		System.out.println("Enter your Date Of Birth:(dd) ");
		int day =sc.nextInt();
		sc.close();
		Calendar date = new GregorianCalendar(year,month,day);
		Date d1=date.getTime();
		System.out.println("DOB "+dt1.format(d1));
		date.add(Calendar.YEAR,60);//adding 60 years to DOB
		date.add(Calendar.MONTH, 1); //adding 1 month to DOB
		date.set(Calendar.DAY_OF_MONTH, 1);  //1st day of Month
		date.add(Calendar.DATE, -1);  //last day of the previous month
		System.out.println("Retirement Date "+dt1.format(date.getTime()));
	}
	
}
