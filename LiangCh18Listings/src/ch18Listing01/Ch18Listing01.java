package ch18Listing01;

import java.util.Scanner;

public class Ch18Listing01 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a nonnegative integer: ");
		int n = input.nextInt();

		// Display factorial
		System.out.println("Factorial of " + n + " is " + factorial(n));

		System.out.println("Bye.");
	}

	private static long factorial(int n) {
		if (n == 0) // Base case
			return 1;
		else
			return n * factorial(n - 1); // Recursive call
	}

}
