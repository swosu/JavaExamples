package ch10Listing09;

import java.math.BigInteger;

public class Ch10Listing09 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		long ourFactorial = 50;
		System.out.println(ourFactorial +"! is \n" + factorial(ourFactorial));
		
		// 1 = 1
		// 2! = 1 * 2 = 2
		// 3! = 1 * 2 * 3 = 6
		// 4! = 1 * 2 * 3 * 4 = 24
		// 5! = 1 * 2 * 3 * 4 * 5 = 120
		// ...
		// 50! = 
		// 30414093201713378043612608166064768844377641568960512000000000000

		System.out.println("Bye.");
	}

	public static BigInteger factorial(long stopIndex) {
		BigInteger result = BigInteger.ONE;
		for (int index = 1; index <= stopIndex; index++)
		{
			result = result.multiply(new BigInteger(index + ""));
		}
		return result;
	}

}
