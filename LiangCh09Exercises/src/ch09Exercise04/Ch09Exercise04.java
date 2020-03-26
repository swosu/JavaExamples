package ch09Exercise04;

import java.util.Random;

public class Ch09Exercise04 {

	public static void main(String[] args) {
		/**(Use the Random class)*/
		/*Write a program that creates a Random object with seed
		 * 1000 and displays the first 50 random integers between 0 and 100 using the
		 * nextInt(100) method.
		 */ 
		System.out.println("Hello.");

		Random random1 = new Random(1000);
		System.out.println("From random1: ");
		for (int i = 0; i < 50; i++)
		{
			System.out.print(random1.nextInt(100) + " ");
			if(i>0 && i%25 == 0) {
				System.out.println();
			}
		}

		Random random2 = new Random(1000);
		System.out.println("\nFrom random2: ");
		for (int i = 0; i < 50; i++)
		{
			System.out.print(random2.nextInt(100) + " ");
			if(i>0 && i%25 == 0) {
				System.out.println();
			}
		}

		Random random3 = new Random(1000);
		System.out.println("\nFrom random3: ");
		for (int i = 0; i < 50; i++)
		{
			System.out.print(random3.nextInt(100) + " ");
			if(i>0 && i%25 == 0) {
				System.out.println();
			}
		}


		System.out.println("\nBye.");

	}

}
