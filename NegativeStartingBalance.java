package ch11java6thedition;

/**
 * This is Code Listing 11-11 which demonstrates a 
 * custom exception class.
 * 
 * @author craig
 */
public class NegativeStartingBalance extends Exception {

	/**
	 * This constructor uses  a generic error message.
	 */
	public NegativeStartingBalance() {
		super("Error: negative starting balance.");		
	}

	/**
	 * This constructor specifies the bad starting balance in the 
	 * error message.
	 * @param amount The bad starting balance.
	 */
	public NegativeStartingBalance(double amount) {
		super("Error: Negative starting balance $" + amount);	
	}
		
}
