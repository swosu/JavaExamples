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
		System.out.println("Hello.");
		
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
		
		System.out.println("Bye.");

		// files from Eclipse are written to: /JavaExamples/LiangCh17Exercises

		/* From 17_02
		 * Created: 66, 32, 35, 27, 25, 25, 4, 96, 45, 80,
		 * Reading in: 66, 32, 35, 27, 25, 25, 4, 96, 45, 80, Bye.
		 */
		
		/* From 17_14
		 * read in: 71, 37, 40, 32, 30, 30, 9, 101, 50, 85,
		 */
		
		/* From 17_15
		 * read in:66, 32, 35, 27, 25, 25, 4, 96, 45, 80,
		 */

	}

}
