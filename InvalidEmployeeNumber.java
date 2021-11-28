package ch11java6thedition;

/**
 * Custom exception class for programming
 * challenge #10.
 * 
 * @author craig
 */
public class InvalidEmployeeNumber extends Exception {
	
	/**
	 * Constructor with no arguments.
	 */
	public InvalidEmployeeNumber() {
		super("Invalid Employee Number.");
	}	

	/**
	 * Constructor with more detailed user 
	 * feedback.
	 * 
	 * @param number The user entered employee number.
	 */
	public InvalidEmployeeNumber(String number) {
		super(number + " is an Invalid Employee Number.");
	}


}
