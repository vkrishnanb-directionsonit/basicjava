package edu.lessons.day53.util.date;
import java.text.SimpleDateFormat;
import java.time.temporal.TemporalAdjusters;
//import org.joda.time.LocalDate;
//import org.joda.time.Years;

public class JodoTimeDemo {

	public static void main(String[] args) {
		usingJRETime();
	}
	public static void usingJodaTime()
	{
//		SimpleDateFormat f1=new SimpleDateFormat("yyyy-MMM-dd");
//		LocalDate birthdate = new LocalDate (1970, 1, 20);
//		LocalDate now = new LocalDate();
//		System.out.println("DOB "+birthdate);
//		System.out.println(f1.format(birthdate.toDate()));
//		System.out.println("now "+now);
//		Years age = Years.yearsBetween(birthdate, now);
//		System.out.println(age.getYears());
	}
	public static void usingJRETime()
	{
		java.time.LocalDate today = 
				java.time.LocalDate.of(2000, 8, 10);
		System.out.println(today);
		java.time.LocalDate payday = 
				today.with(TemporalAdjusters.lastDayOfMonth());//.minusDays(2);
		System.out.println(payday);
	}
}
