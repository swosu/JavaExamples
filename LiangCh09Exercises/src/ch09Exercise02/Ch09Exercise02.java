package ch09Exercise02;

public class Ch09Exercise02 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		/** (The Stock class)*/
		/*Following the example of the Circle class in Section 9.2,
		 * design a class named Stock that contains:
		 * A string data field named symbol for the stock’s symbol.
		 * A string data field named name for the stock’s name.
		 * A double data field named previousClosingPrice that stores the stock
		 * 	price for the previous day.
		 * A double data field named currentPrice that stores the stock price for the
		 * 	current time.
		 * A constructor that creates a stock with the specified symbol and name.
		 * A method named getChangePercent() that returns the percentage changed
		 * 	from previousClosingPrice to currentPrice .
		 * Draw the UML diagram for the class and then implement the class. 
		 * Write a test program that creates a Stock object with the stock symbol ORCL , the name
		 * Oracle Corporation , and the previous closing price of 34.5 . Set a new current
		 * price to 34.35 and display the price-change percentage.
		 */
		
		SimpleStock ourObject = new SimpleStock("ORCL","Oracle Corporation", 34.5);
		
		System.out.println("Our stock symbol: " + ourObject.getSymbol());
		System.out.println("Our stock name: " + ourObject.getName());
		System.out.println("Our stock previous closing price: " + ourObject.getClosingPrice());
		
		ourObject.setCurrentPrice(34.35);
		
		System.out.println("Our current price is: " + ourObject.getCurrentPrice());
		System.out.printf("Our price change percentage is: %.2f\n", ourObject.getPriceChangePercentage());
		//https://www.percentage-change-calculator.com/calculate.php
		
		System.out.println("Bye.");

	}

}
