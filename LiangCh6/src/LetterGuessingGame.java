public class LetterGuessingGame {
	public static void main(String[] args) {
		testGuessingGame();
		
		if((int)(Math.random()*26+65)!=(int)(Math.random()*26+65)){
			System.out.println("You were correct.");
		} else {
			System.out.println("That was not a match.");
		}
	}

	private static void testGuessingGame() {
		// 1. computer guess a letter
		int computerGuess = guessUpperCaseNumber();
		System.out.println("Computer Guess: " + (char)computerGuess);
		// 2. user guess a number
		int userGuess = guessUpperCaseNumber();
		System.out.println("USer Guess: " + (char)userGuess);
		// 3. compare the answer
		boolean match = compareLetters(computerGuess, userGuess);
		// 4. give result
		if(match){
			System.out.println("You were correct.");
		} else {
			System.out.println("That was not a match.");
		}
	}

	private static boolean compareLetters(int computerGuess, int userGuess) {
		boolean sameGuess = true;
		if(computerGuess != userGuess)
			sameGuess = false;
		return sameGuess;
	}

	private static int guessUpperCaseNumber() {
		return (int)(Math.random()*26+65);
	}
}
