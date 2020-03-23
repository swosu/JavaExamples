package ch17Exercise14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

// https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_17/Exercise_17_14/Exercise_17_14.java
/*********************************************************************************
 * (Encrypt files) Encode the file by adding 5 to every byte in the file. Write a *
 * program that prompts the user to enter an input file name and an output file   *
 * name and saves the encrypted version of the input file to the output file.     *
 *********************************************************************************/

public class Ch17Exercise14 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Hello.");

		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an input file name and an output flie name
		System.out.print("Enter input flie name: ");
		//String inFile = input.next();
		String inFile = "Exercise17_02.dat";
		System.out.print("Enter output flie name: ");
		//String outFile = input.next();
		String outFile = "Exercise17_02_Encrypted.dat";

		try ( // Create two random access files
				RandomAccessFile source = new RandomAccessFile(inFile, "r");
				RandomAccessFile target = new RandomAccessFile(outFile, "rw");
				) {
			// Add 5 to every byte read from source file
			// then write it to the target file 
			int r = 0;
			source.seek(0); // Move the file pointer to the beginning
			while ((r = source.read()) != -1) {
				target.write(((byte)r) + 5);
			}
		}

		// read in file and print:
		FileInputStream testInput = new FileInputStream("Exercise17_02_Encrypted.dat");
		int value;
		System.out.println("Reading in: ");
		while((value = testInput.read()) != -1)
			System.out.print(value + ", ");

		System.out.println("Bye.");
		
		// files from Eclipse are written to: /JavaExamples/LiangCh17Exercises


		/*
		 * Hello.
		 * Our Number: 36, 73, 88, 15, 5, 81, 25, 79, 51, 65,
		 * Reading in:
		 * 36, 73, 88, 15, 5, 81, 25, 79, 51, 65, Bye.
		 */

		/*
		 * Hello.
		 * Enter input flie name: Enter output flie name: Reading in:
		 * 41, 78, 93, 20, 10, 86, 30, 84, 56, 70, Bye.
		 */

	}

}
