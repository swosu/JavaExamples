package ch17Exercise15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

// https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_17/Exercise_17_15/Exercise_17_15.java

/*********************************************************************************
 * (Decrypt files) Suppose a file is encrypted using the scheme in Programming    *
 * Exercise 17.14. Write a program to decode an encrypted file. Your program      *
 * should prompt the user to enter an input file name for the encrypted file and  *
 * an output file name for the unencrypted version of the input file.             *
 *********************************************************************************/

public class Ch17Exercise15 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the input file for the encrypted file
		// and the output file name for the unencrypted version of the input file
		System.out.print("Enter the encrypted file name: ");
		//String inFile = input.next();
		String inFile = "Exercise17_02_Encrypted.dat";
		System.out.print("Enter the file name for the decrypted file: ");
		//String outFile = input.next();
		String outFile = "Exercise17_02_Encrypted_Cracked.dat";

		try ( // Create two random access files
				RandomAccessFile encrypted = new RandomAccessFile(inFile, "r");
				RandomAccessFile decrypted = new RandomAccessFile(outFile, "rw");
				) {
			// Subtract 5 from every byte in the encrypted file
			// the write to decrypted file
			int r;
			encrypted.seek(0); // Move the file pointer to beginning
			while ((r = encrypted.read()) != -1) {
				decrypted.write(((byte)r) - 5);
			}
		}

		// read in file and print:
		FileInputStream testInput = new FileInputStream("Exercise17_02_Encrypted_Cracked.dat");
		int value;
		System.out.println("Reading in: ");
		while((value = testInput.read()) != -1)
			System.out.print(value + ", ");

		// files from Eclipse are written to: /JavaExamples/LiangCh17Exercises

		// Results from 17.02
		/*
		 * Hello.
		 * Our Number: 36, 73, 88, 15, 5, 81, 25, 79, 51, 65,
		 * Reading in:
		 * 36, 73, 88, 15, 5, 81, 25, 79, 51, 65, Bye.
		 */

		// results from 17.14:
		/*
		 * Hello.
		 * Enter input flie name: Enter output flie name: Reading in:
		 * 41, 78, 93, 20, 10, 86, 30, 84, 56, 70, Bye.
		 */

		// Results from 17.15
		/*
		 * Enter the encrypted file name: Enter the file name for the decrypted file: Reading in:
		 * 36, 73, 88, 15, 5, 81, 25, 79, 51, 65, 
		 */

	}

}
