package ch11java6thedition;

/**
 * Custom exception class for programming 
 * challenge #10.
 * 
 * @author craig
 */
public class InvalidShift extends Exception {

	/**
	 * Constructor with no arguments.
	 */
	public InvalidShift() {
		super("Invalid Shift entry.");
	}	

	/**
	 * Constructor with user entered data.
	 * @param shift The user entered shift data.
	 */
	public InvalidShift(int shift) {
		super(shift + " is an Invalid Shift entry.");
	}

}
