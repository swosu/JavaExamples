package ch09Exercise03;

public class Ch09Exercise03 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		/**(Use the Date class)*/ 
		/*Write a program that creates a Date object, sets its elapsed
		 * time to 10000 , 100000 , 1000000 , 10000000 , 100000000 , 1000000000 ,
		 * 10000000000 , and 100000000000 , and displays the date and time using the
		 * toString() method, respectively.
		 */

		long ourTime = 1;

		for(int index = 1; index <= 12; index++)
		{
			java.util.Date date = new java.util.Date(ourTime);
			System.out.print("The elapsed time since Jan 1, 1970 is " +
					date.getTime() + " milliseconds: ");
			System.out.println(date.toString());
			ourTime = ourTime * 10;
		}
		System.out.println("Bye.");


	}

}
