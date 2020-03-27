package ch09Exercise06;

import java.util.Arrays;
import java.util.Random;

// code started from:
//https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_09/Exercise_09_06/Exercise_09_06.java
/*********************************************************************************
 * (Stopwatch) Design a class named StopWatch. The class contains:                *
 *                                                                                *
 * ■ Private data fields startTime and endTime with getter methods.               *
 * ■ A no-arg constructor that initializes startTime with the current time.       *
 * ■ A method named start() that resets the startTime to the current time.        *
 * ■ A method named stop() that sets the endTime to the current time.             *
 * ■ A method named getElapsedTime() that returns the elapsed time for the        *
 *   stopwatch in milliseconds.                                                   *
 *                                                                                *
 * Draw the UML diagram for the class and then implement the class. Write a test  *
 * program that measures the execution time of sorting 100,000 numbers using      *
 * selection sort.                                                                *
 *********************************************************************************/

public class Ch09Exercise06 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		// Create a StopWatch object
		StopWatch stopWatch = new StopWatch();

		// create array of 100,000 random numbers
		int size = 1000000;
		int[] originalArray = new int[size];
		int[] copy1 = new int[size];
		int[] copy2 = new int[size];
		int[] copy3 = new int[size];
		fillOriginalArray(originalArray);

		//System.out.println("Original Array");
		//printArray(originalArray);

		copyArray(originalArray, copy1);
		copyArray(originalArray, copy2);
		copyArray(originalArray, copy3);
		//System.out.println("Copy 1");
		//printArray(copy1);

		// Invoke the start method in StopWatch class
		stopWatch.start();

		// Sort array
		//selectionSort(copy1);

		// Invoke the stop method in StopWatch class
		stopWatch.stop();

		// Display the execution time
		System.out.println("The execution time of sorting 100,000 " +
				"numbers using selection sort: " + stopWatch.getElapsedTime() +
				" milliseconds");

		// built in sort
		stopWatch.start();
		Arrays.sort(copy2);
		stopWatch.stop();
		System.out.println("The execution time of sorting 100,000 " +
				"numbers using Arrays.sort: " + stopWatch.getElapsedTime() +
				" milliseconds");

		// built in parallel sort
		stopWatch.start();
		Arrays.parallelSort(copy3);
		stopWatch.stop();
		System.out.println("The execution time of sorting 100,000 " +
				"numbers using Arrays.parrallelSort: " + stopWatch.getElapsedTime() +
				" milliseconds");



		//System.out.println("Sorted Copy 1");
		//printArray(copy1);




		System.out.println("Bye.");
	}

	private static void selectionSort(int[] array) {
		for (int sortIndex = 0; sortIndex < array.length - 1; sortIndex++) {
			int min = array[sortIndex];
			//System.out.println("min: " + min);
			int minIndex = sortIndex;
			//System.out.println("min index: " + minIndex);

			for (int sortInnerIndex = sortIndex + 1; 
					sortInnerIndex < array.length; 
					sortInnerIndex++) {
				//System.out.println("sortInnerIndex: " + sortInnerIndex);
				if (array[sortInnerIndex] < min) {
					//System.out.println("We have a new minimum!");
					min = array[sortInnerIndex];
					minIndex = sortInnerIndex;
				}
			}

			//System.out.println("sortIndex: " + sortIndex);
			//System.out.println("minIndex: " + minIndex );
			if (sortIndex != minIndex) {
				array[minIndex] = array[sortIndex];
				array[sortIndex] = min;
				//printArray(array);
			}

		}

	}

	private static void copyArray(int[] originalArray, int[] copy1) {
		for (int copyIndex = 0; copyIndex < originalArray.length; copyIndex++) {
			copy1[copyIndex] = originalArray[copyIndex];
		}

	}

	private static void printArray(int[] originalArray) {
		for (int printIndex = 0; printIndex < originalArray.length; printIndex++) {
			System.out.print(originalArray[printIndex] + ", ");
		}
		System.out.println();
	}

	private static void fillOriginalArray(int[] originalArray) {
		Random ourRandom = new Random(1000);
		for (int fillIndex = 0; fillIndex < originalArray.length; fillIndex++) {
			originalArray[fillIndex] = ourRandom.nextInt(100);
		}


	}

}
