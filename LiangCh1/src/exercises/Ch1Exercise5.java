package exercises;

public class Ch1Exercise5 {

	public static void main(String[] args) {
		/*
		 * Write a program that displays the result of
		 *   9.5 * 4.5 - 2.5 * 3
		 *	_____________________
		 *        45.5 - 3.5
		 */
		double topPart1 = 9.5 * 4.5;
		double topPart2 = 2.5 * 3;
		
		double totalTop = topPart1 - topPart2;
		
		double bottomPart = 45.5 - 3.5;
		
		double answer = totalTop / bottomPart;
		
		System.out.println("The answer is: " + answer);

	}

}
