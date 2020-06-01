
public class Week1FixtureDivideAndConquerSorting {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
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
		fixture.setArraySize(5);
		
		// TODO Make array to sort
		int[] startingArray = new int[fixture.getArraySize()];
		fixture.fillArray(startingArray);
		fixture.printArray(startingArray);
		
		// TODO Make a copy for Merge Sort
		
		// TODO Make a copy for Quick Sort

	}

}
