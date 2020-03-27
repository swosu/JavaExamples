package ch09Exercise05;

import java.util.GregorianCalendar;

public class Ch09Exercise05 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		/**(Use the GregorianCalendar class)*/ 
		/* Java API has the GregorianCalendar class
		 * in the java.util package, which you can use to obtain the year, month, and day of a
		 * date. The no-arg constructor constructs an instance for the current date, and the 
		 * methods 
		 * get(GregorianCalendar.YEAR) , 
		 * get(GregorianCalendar.MONTH) ,
		 * get(GregorianCalendar.DAY_OF_MONTH) 
		 * return the year, month, and day.
		 * Write a program to perform two tasks:
		 * 
		 * Display the current year, month, and day.
		 *
		 * The GregorianCalendar class has the setTimeInMillis(long) , which
		 * can be used to set a specified elapsed time since January 1, 1970. Set the value
		 *to 1234567898765L and display the year, month, and day.
		 */
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Current year: " + calendar.get(calendar.YEAR));
		System.out.println("Current month: " + calendar.get(calendar.MONTH));
		System.out.println("Current Day: " + calendar.get(calendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println("Current year: " + calendar.get(calendar.YEAR));
		System.out.println("Current month: " + calendar.get(calendar.MONTH));
		System.out.println("Current Day: " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Bye.");
	}

}
