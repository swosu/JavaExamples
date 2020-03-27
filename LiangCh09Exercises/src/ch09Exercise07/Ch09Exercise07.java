package ch09Exercise07;
/** (The Account class)*/ 
/* Design a class named Account that contains:
 * A private int data field named id for the account (default 0 ).
 * A private double data field named balance for the account (default 0 ).
 * A private double data field named annualInterestRate that stores the cur-
 * 	rent interest rate (default 0 ). Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the
 * account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id , balance , and annualInterestRate .
 * The accessor method for dateCreated .
 * A method named getMonthlyInterestRate() that returns the monthly
 * interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the
 * account.
 * A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate . monthlyInterestRate
 * is annualInterestRate / 12 . Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was created.
 */ 
public class Ch09Exercise07 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		//Design a class named Account (I called mine SimpleAccount) that contains: 
		SimpleAccount ourAccount = new SimpleAccount();

		//A private int data field named id for the account (default 0 ).
		System.out.println("Account ID: " + ourAccount.getID());

		//A private double data field named balance for the account (default 0 ).
		System.out.printf("Account Balance: $%.2f\n", ourAccount.getAccountBalance());
		//help from: https://stackoverflow.com/questions/41027473/
		// java-how-do-i-use-printf-to-print-a-dollar-sign-and-a-double-with-2-decimals/41027925

		// A private double data field named annualInterestRate that stores the cur-
		// 		rent interest rate (default 0 ). Assume all accounts have the same interest rate.
		System.out.printf("Annual Interest Rate for all accounts: %.1f%%\n", SimpleAccount.getAnnualInterestRate());

		// A private Date data field named dateCreated that stores the date when the
		// 	account was created.
		System.out.println("Date created: " + ourAccount.getDateCreated());

		// A constructor that creates an account with the specified id and initial balance.
		SimpleAccount specialAccount = new SimpleAccount(47,1000000.00);
		System.out.printf("Special Account ID: %d\n", specialAccount.getID());
		System.out.printf("Special Account Balance: $%.2f\n", specialAccount.getAccountBalance());

		//The accessor and mutator methods for id , balance , and annualInterestRate .
		specialAccount.setID(42);
		System.out.printf("Special Account ID: %d\n", specialAccount.getID());

		specialAccount.setAccountBalance(specialAccount.getAccountBalance() * 10);
		System.out.printf("Special Account Balance: $%.2f\n", specialAccount.getAccountBalance());

		SimpleAccount.setAnnualInterestRate(5.4);
		System.out.printf("Annual Interest Rate for all accounts: %.1f%%\n", 
				SimpleAccount.getAnnualInterestRate());


		// A method named getMonthlyInterestRate() that returns the monthly interest rate.
		System.out.printf("Monthly Interest Rate for all accounts: %.1f%%\n", 
				SimpleAccount.getMonthlyInterestRate());

		specialAccount.setAccountBalance(100);
		System.out.printf("Special Account Balance: $%.2f\n", specialAccount.getAccountBalance());
		//A method named getMonthlyInterest() that returns the monthly interest.
		System.out.printf("Special Account monthly Interest: $%.2f\n", 
				specialAccount.getMonthlyInterest());

		// A method named withdraw that withdraws a specified amount from the account.
		specialAccount.setAccountBalance(1000);
		System.out.printf("Special Account Balance: $%.2f\n", specialAccount.getAccountBalance());
		specialAccount.withdraw(500);
		System.out.printf("Special Account Balance: $%.2f\n", specialAccount.getAccountBalance());

		//A method named deposit that deposits a specified amount to the account.
		specialAccount.setAccountBalance(2000);
		System.out.printf("Special Account Balance $2000: $%.2f\n", specialAccount.getAccountBalance());
		specialAccount.deposit(3000);
		System.out.printf("Special Account Balance after $3000 deposit: $%.2f\n", 
				specialAccount.getAccountBalance());

		// Write a test program that creates an Account object with an account ID of 1122,
		// 		a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
		// 		method to withdraw $2,500, use the deposit method to deposit $3,000, and print
		// 		the balance, the monthly interest, and the date when this account was created.
		SimpleAccount testAccount = new SimpleAccount(1122, 20000.00, 4.5);
		System.out.printf("Test Account ID: %d\n", testAccount.getID());
		System.out.printf("Test Account Balance should be $20000: $%.2f\n", 
				testAccount.getAccountBalance());

		System.out.printf("Annual Interest Rate for all accounts: %.1f%%\n", 
				SimpleAccount.getAnnualInterestRate());

		testAccount.withdraw(2500);
		System.out.printf("Test Account Balance should be 17500: $%.2f\n", 
				testAccount.getAccountBalance());

		testAccount.deposit(3000);
		System.out.printf("Test Account Balance after $3000 deposit: $%.2f\n", 
				testAccount.getAccountBalance());

		System.out.printf("Monthly Interest Rate for all accounts: %.1f%%\n", 
				SimpleAccount.getMonthlyInterestRate());

		System.out.printf("Test Account monthly Interest: $%.2f\n", 
				testAccount.getMonthlyInterest());

		System.out.println("Date created: " + testAccount.getDateCreated());


		System.out.println("Bye.");
	}

}
