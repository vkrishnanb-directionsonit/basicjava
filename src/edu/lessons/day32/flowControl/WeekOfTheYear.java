package edu.lessons.day32.flowControl;
public class WeekOfTheYear {
	 public static void main(String[] args) {
	  
	   java.util.Scanner s = new java.util.Scanner(System.in);
	   System.out.println("Enter day");
	   int day = s.nextInt();
	   System.out.println("Enter Month");
	   int month = s.nextInt();
	   System.out.println("Enter Year");
	   int year = s.nextInt();
	   s.close();
	   int dayofTheYear=day;
	   float weekOfTheYear =0;
	    if (year % 4 == 0 && month > 2) 
	    {
	    	dayofTheYear++;
	    }
	    switch (month) 
	    {
		    case 12: dayofTheYear += 30;
		    case 11: dayofTheYear += 31; 
		    case 10: dayofTheYear += 30;
		    case 9:  dayofTheYear += 31;
		    case 8:  dayofTheYear += 31;
		    case 7:  dayofTheYear += 30;
		    case 6:  dayofTheYear += 31;
		    case 5:  dayofTheYear += 30;
		    case 4:  dayofTheYear += 31;
		    case 3:  dayofTheYear += 28;
		    case 2:  dayofTheYear += 31;    
       }
	    System.out.println("day Of the Year is "+dayofTheYear);
	    weekOfTheYear=(float)dayofTheYear/7;
	    System.out.println("Week Of the Year is "+Math.round(weekOfTheYear));
	}
}