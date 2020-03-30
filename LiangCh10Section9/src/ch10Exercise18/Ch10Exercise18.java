package ch10Exercise18;

import java.math.BigInteger;

public class Ch10Exercise18 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		/**(Large prime numbers)*/ 
		/* Write a program that finds five prime numbers larger
		 * than Long.MAX_VALUE . 
		 */
		
		// 

		// write a program to find five prime numbers
		int primesToFind = 5;
		int startingValue = 1111;
		System.out.println("Run for ints.");
		findPrimes(startingValue, primesToFind);

		int primesToFindBigInt = 5;
		//BigInteger startingValueBigInt =new BigInteger("1111");
		BigInteger startingValueBigInt =new BigInteger(Long.MAX_VALUE + "");
		System.out.println("Run for Big ints.");
		findPrimesBigInt(startingValueBigInt, primesToFindBigInt);
		
		// looking for Integer.MAX_VALUE
		// first prime: 2147483647 at about 3 minutes 
		// (3.5 minutes with the added divide by 2)
		// (3.5 minutes without the added divide by 2)

		System.out.println("Bye.");
	}

	private static void findPrimesBigInt(BigInteger startingValueBigInt, int primesToFindBigInt) {
		boolean keepGoing = true;
		int primesFound = 0;
		boolean isPrime = false;
		long offset = 0;
		while(keepGoing)
		{
			BigInteger workingValue = startingValueBigInt.add(new BigInteger(offset + ""));
			//System.out.println("Starting value: " + workingValue);
			isPrime = true;
			for(BigInteger checkValue = new BigInteger("2"); 
					checkValue.compareTo(workingValue) < 0; 
					checkValue = checkValue.add(BigInteger.ONE))
			{
				//System.out.println("Check value" + checkValue);
				if(BigInteger.ZERO.equals(workingValue.mod(checkValue)))
				{
					isPrime = false;
				}

			}


			if(isPrime) 
			{
				primesFound++;
				System.out.printf("We found a prime: %d\n", workingValue);
			}

			if(primesFound >= primesToFindBigInt) 
			{
				keepGoing = false;
			}
			
			offset++;
		}
	}

	private static void findPrimes(int startingValue, int primesToFind) {

		int workingValue = startingValue;
		int offset = 1;
		boolean keepGoing = true;
		int primesFound = 0;
		boolean isPrime = false;
		while(keepGoing)
		{
			isPrime = true;
			for(int checkValue = 2; checkValue < (int)(Math.ceil((double)workingValue/2.0)); checkValue++)
			{
				if(0 == (workingValue%checkValue))
				{
					isPrime = false;
				}

			}
			if(isPrime) 
			{
				primesFound++;
				System.out.printf("We found a prime: %d\n", workingValue);
			}

			if(primesFound >= primesToFind) 
			{
				keepGoing = false;
			}

			workingValue++;

		}
	}
}
