package ch11java6thedition;
import java.io.*;
/**
 * This is the modified BankAccount2 class which
 * implements the serializable interface.
 * 
 * @author craig
 */
public class BankAccount2 implements Serializable{
	// The class's one lonely variable
	private double balance;	
	
	/**
	 * Standard constructor with 0 starting balance
	 */
	public BankAccount2() {
		balance = 0.0;
	}

	/**
	 * Constructor setting the balance to the value passed as
	 * an argument.
	 * @param startBalance 
	 */
	public BankAccount2(double startBalance) throws NegativeStartingBalance {
		if(startBalance < 0) {
			throw new NegativeStartingBalance(startBalance);
		}
		balance = startBalance;
	}

	/**
	 * Constructor setting the balance to the value passed
	 * as a String argument.
	 * @param str The balance passed as a String
	 */
	public BankAccount2(String str) {
		balance = Double.parseDouble(str);
	}

	/**
	 * The deposit method takes a double argument and sets
	 * the balance to balance += deposit.
	 * @param amount The amount of the deposit
	 */
	public void deposit(double amount) {
		balance += amount;		
	}

	/** 
	 * The second deposit method takes a String argument
	 * and adds the converted String to the current 
	 * balance.
	 * @param str The deposit in String form.
	 */
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	/**
	 * The first withdraw method subtracts a double 
	 * argument from the current balance.
	 * @param amount The amount withdrawn.
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * The second withdraw method converts a String 
	 * argument to a double and subtracts it from the
	 * current balance.
	 * @param str The withdrawn amount in String form.
	 */
	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}

	/**
	 * The getBalance method returns the value in balance.
	 * @return The account balance.
	 */
	public double getBalance() {
		return balance;
	}
	
}


