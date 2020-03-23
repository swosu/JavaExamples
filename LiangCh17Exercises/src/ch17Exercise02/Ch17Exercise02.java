package ch17Exercise02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// https://github.com/jsquared21/Intro-to-Java-Programming/tree/master/Exercise_17/Exercise_17_02

/*********************************************************************************
 * (Create a binary data file) Write a program to create a file named             *
 * Exercise17_02.dat if it does not exist. Append new data to it if it already    *
 * exists. Write 100 integers created randomly into the file using binary I/O.    *
 *********************************************************************************/


public class Ch17Exercise02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Hello.");
		int ourNumber;


		try (
				// Create an output stream to the file
				// Append new data if file already exists
				FileOutputStream output = 
				new FileOutputStream("Exercise17_02.dat", true);
				) {
			// Output 100 integers created randomly into the file
			System.out.print("Our Number: ");
			for (int i = 0; i < 10; i++)
			{
				ourNumber = (int)(1 + Math.random() * 100);
				System.out.print(ourNumber + ", ");
				output.write(ourNumber);
			}
			System.out.println();
		}
		
		// read in file and print:
		FileInputStream input = new FileInputStream("Exercise17_02.dat");
		int value;
		System.out.println("Reading in: ");
		while((value = input.read()) != -1)
			System.out.print(value + ", ");
		
		/* From 17_02
		 * Created: 66, 32, 35, 27, 25, 25, 4, 96, 45, 80,
		 * Reading in: 66, 32, 35, 27, 25, 25, 4, 96, 45, 80, Bye.
		 */

		System.out.println("Bye.");
	}

}
