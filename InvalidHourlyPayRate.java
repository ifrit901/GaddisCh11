package ch11java6thedition;

/**
 * This exception class catches exceptions for
 * invalid entries into the hourlyPayRate field
 * in the Payroll class. 
 * 
 * @author craig
 */
public class InvalidHourlyPayRate extends Exception{

	/**
	 * No argument constructor.
	 */
	public InvalidHourlyPayRate() {
		super("Error: Invalid hourly pay rate.");
	}

	/**
	 * Constructor with invalid user entered argument.
	 * @param payRate 
	 */
	public InvalidHourlyPayRate(double payRate) {
		super("Error: " + payRate + " is an invalid hourly pay rate.");
	}

}
