package ch09Exercise07;

import java.util.GregorianCalendar;

public class SimpleAccount {
	
	private int id;
	private double accountBalance;
	private static double annualInterestRate = 0;
	private static double monthlyInterestRate = 0;
	java.util.Date date = new java.util.Date();
	private Object dateCreated;
	public SimpleAccount() {
		this.id = 0;
		this.accountBalance = 0;
		this.dateCreated = date;
	}

	public SimpleAccount(int creationID, double creationAccountBalance) {
		this.id = creationID;
		this.accountBalance = creationAccountBalance;
		this.dateCreated = date;
	}

	public SimpleAccount(int creationID, double creationAccountBalance, double openingOfferAPY) {
		this.id = creationID;
		this.accountBalance = creationAccountBalance;
		this.dateCreated = date;
		annualInterestRate = openingOfferAPY;
	}

	public int getID() {
		return this.id;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Object getDateCreated() {
		return this.dateCreated;
	}

	public void setID(int nextID) {
		this.id = nextID;
	}

	public void setAccountBalance(double nextAccountBalance) {
		this.accountBalance = nextAccountBalance;
	}

	public static void setAnnualInterestRate(double nextInterestRate) {
		annualInterestRate = nextInterestRate;
	}

	public static double getMonthlyInterestRate() {
		monthlyInterestRate = annualInterestRate/12.0;
		return monthlyInterestRate;
	}

	public double getMonthlyInterest() {
		return this.accountBalance * (monthlyInterestRate / 100);
	}

	public void withdraw(int ammountWithdrawn) {
		this.accountBalance = this.accountBalance - ammountWithdrawn;
	}

	public void deposit(int ammountDeposited) {
		this.accountBalance = this.accountBalance + ammountDeposited;		
	}

}
