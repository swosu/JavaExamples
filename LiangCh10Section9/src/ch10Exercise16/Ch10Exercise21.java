package ch10Exercise16;

import java.math.BigInteger;

public class Ch10Exercise21 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		/** (Divisible by 5 or 6 )*/ 
		/* Find the first ten numbers greater than Long.MAX_VALUE that are
		 * divisible by 5 or 6 . 
		 */


		int numbersToFind = 10;
		int divisor1 = 5;
		int divisor2 = 6;

		findOurEvenlyDivisibleNumbers(divisor1, divisor2, numbersToFind);

		System.out.println("Bye.");
	}

	private static void findOurEvenlyDivisibleNumbers(int divisor1, int divisor2, int numbersToFind) {
		System.out.println("Hello from inside the method!");

		//int startingNumber = 1;
		BigInteger startingNumber = new BigInteger(Long.MAX_VALUE + "");

		//int offset = 1;
		int intOffset = 1;	
		
		//int currentValue = 0;
		int numberOfFindings = 0;
		boolean keepRunning = true;
		boolean firstNumberHit = false;
		boolean secondNumberHit = false;
		while(keepRunning)
		{
			BigInteger offset = new BigInteger(intOffset + "");
			//System.out.println("Offset: " + offset);
			BigInteger currentValue = startingNumber.add(offset);

			//if(0 == (currentValue % divisor1))
			if(BigInteger.ZERO.equals(currentValue.mod(new BigInteger(divisor1 + ""))))
			{
				firstNumberHit = true;
			}
			else
			{
				firstNumberHit = false;
			}

			//if(0 == (currentValue % divisor2))
			if(BigInteger.ZERO.equals(currentValue.mod(new BigInteger(divisor2 + ""))))
			{
				secondNumberHit = true;
			}
			else
			{//System.out.println("Offset: " + offset);
				secondNumberHit = false;
			}

			if(firstNumberHit && secondNumberHit)
			{
				System.out.println(currentValue);
				numberOfFindings++;
			}

			intOffset++;
			//System.out.println("Our int offset: " + intOffset);
			
			if(numberOfFindings >= numbersToFind)
			{
				keepRunning = false;
			}
		}
	}
}

/* 
Hello.
Hello from inside the method!
9223372036854775830
9223372036854775860
9223372036854775890
9223372036854775920
9223372036854775950
9223372036854775980
9223372036854776010
9223372036854776040
9223372036854776070
9223372036854776100
Bye.
*/