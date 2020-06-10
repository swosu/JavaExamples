import java.util.LinkedList;

public class Week1FixtureDivideAndConquerSorting {
	public static void main(String[] args) {
		/*Divide and Conquer can be useful for many problems. 
		 * One common application is sorting, 
		 * which takes place frequently in programming. 
		 * For this assignment, students are asked to examine Merge sort 
		 * and Quick sort. Research the algorithms 
		 * and make a prediction about which algorithm will perform better. 
		 * Research memory requirements, the number of operations 
		 * (time complexity), and algorithm complexity 
		 * (how hard it is to program). 
		 * Implement both algorithms in code. 
		 * You may use the language of your choice. 
		 * Create a fixture to use both algorithms on 
		 * the same data set multiple times. 
		 * Time how long it takes for each algorithm 
		 * to complete the sorting task on average. 
		 * Please use an input set large enough to provide data 
		 * suggesting a clear winner. 
		 */

		TestFixture fixture = new TestFixture();
		System.out.println("Time in milliseconds");
		System.out.println("Array size, \t merge sort, \t quick sort");
		for(int repeatCount = 1; repeatCount < 3; repeatCount++)
		{
			fixture.setArraySize(50);
			System.out.print(fixture.getArraySize() + "\t");

			// Make array to sort
			int[] startingArray = new int[fixture.getArraySize()];
			fixture.fillArray(startingArray);
			//System.out.println("Starting Array");
			//fixture.printArray(startingArray);
			LinkedList<Integer> startingList=new LinkedList<Integer>();
			fixture.copyStartingArrayToStartingList(startingArray,startingList);

			// Make a copy for Merge Sort
			int[] mergeSortArrayCopy = new int[fixture.getArraySize()];
			fixture.copyArray(startingArray, mergeSortArrayCopy);
			//fixture.printArray(mergeSortArrayCopy);

			// Make a copy for Quick Sort
			int[] quickSortArrayCopy = new int[fixture.getArraySize()];
			fixture.copyArray(startingArray, quickSortArrayCopy);
			//fixture.printArray(quickSortArrayCopy);

			// sort with merge sort
			long startTime = System.currentTimeMillis();
			fixture.mergeSortTheArray(mergeSortArrayCopy);
			long endTime = System.currentTimeMillis();
			System.out.print((endTime - startTime) + "\t");
			//fixture.printArray(mergeSortArrayCopy);

			// sort with quick sort
			startTime = System.currentTimeMillis();
			fixture.quickSort(quickSortArrayCopy);
			endTime = System.currentTimeMillis();
			System.out.println((endTime - startTime) + "\t");
			//fixture.printArray(quickSortArrayCopy);
		}
	}
}
