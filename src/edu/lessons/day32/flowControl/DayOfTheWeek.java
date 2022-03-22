package edu.lessons.day32.flowControl;

/**
 * For a given date (gregorian calendar) the corresponding
 * day of the week is printed out.
 * 
 * @author 
 *
 */
public class DayOfTheWeek {

	/**
	 * Prints out the day of the week for a given day, month, and year.
	 */
	public static void main(String [] args) {
        // foundation of the federal republic of Germany was a monday 
		int day = 23;
		int month = 5;
		int year = 1949;

		
		int dayOfTheWeek = (year - 1900) * 365 + (year - 1900) / 4;
		if (year % 4 == 0 && month <= 2) {
			dayOfTheWeek--;
		}
		switch (month) {
		case 12: dayOfTheWeek += 30; // NO break!!! Fall through to all cases
		case 11: dayOfTheWeek += 31;
		case 10: dayOfTheWeek += 30;
		case 9: dayOfTheWeek += 31;
		case 8: dayOfTheWeek += 31;
		case 7: dayOfTheWeek += 30;
		case 6: dayOfTheWeek += 31;
		case 5: dayOfTheWeek += 30;
		case 4: dayOfTheWeek += 31;
		case 3: dayOfTheWeek += 28; 			
		case 2: dayOfTheWeek += 31;
	    }
	
		dayOfTheWeek = (day + dayOfTheWeek) % 7;
		
		switch (dayOfTheWeek) {
		case 0: System.out.println("Sunday");
			break;
		case 1: System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
			break;	
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		}
	}

}
