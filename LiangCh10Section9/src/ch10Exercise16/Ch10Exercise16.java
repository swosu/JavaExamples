package ch10Exercise16;

import java.math.BigInteger;

public class Ch10Exercise16 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		/** (Divisible by 2 or 3 )*/ 
		/* Find the first ten numbers with 50 decimal digits that are
		 * divisible by 2 or 3 . 
		 */

		// first
		/* Find the first ten numbers that are
		 * divisible by 2 or 3 . 
		 */
		int numbersToFind = 10;
		int divisor1 = 2;
		int divisor2 = 3;

		findOurEvenlyDivisibleNumbers(divisor1, divisor2, numbersToFind);

		System.out.println("Bye.");
	}

	private static void findOurEvenlyDivisibleNumbers(int divisor1, int divisor2, int numbersToFind) {
		System.out.println("Hello from inside the method!");

		//int startingNumber = 1;
		BigInteger startingNumber = new BigInteger("10000000000000000000000000000000000000000000000000");

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

//10000 00000 00000 00000 00000 00000 00000 00000 00000 00002
/*
 * Hello.
Hello from inside the method!
10000000000000000000000000000000000000000000000002
10000000000000000000000000000000000000000000000008
10000000000000000000000000000000000000000000000014
10000000000000000000000000000000000000000000000020
10000000000000000000000000000000000000000000000026
10000000000000000000000000000000000000000000000032
10000000000000000000000000000000000000000000000038
10000000000000000000000000000000000000000000000044
10000000000000000000000000000000000000000000000050
10000000000000000000000000000000000000000000000056
Bye.
 */ 
