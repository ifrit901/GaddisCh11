package ch11java6thedition;

/**
 * Custom exception class for programming 
 * challenge #10. 
 * 
 * @author craig
 */
public class InvalidPayRate extends Exception {

	/**
	 * No-argument constructor.
	 */
	public InvalidPayRate() {
		super("Invalid Pay Rate.");
	}
	
	/**
	 * Constructor with user entered pay rate data.
	 * @param payRate The pay rate entered by user.
	 */
	public InvalidPayRate(double payRate) {
		super(String.format("$%,.2f", payRate) + " is an Invalid Pay Rate.");
	}
}
