package ch11java6thedition;

/**
 * This exception class catches errors in the 
 * numberOfHoursWorked field that may be
 * thrown by the Payroll class constructor or
 * methods.
 * 
 * @author craig
 */
public class InvalidNumberOfHoursWorked extends Exception {

	/**
	 * No argument constructor.
	 */
	public InvalidNumberOfHoursWorked() {
		super("Error: Number of hours worked must be "
			+ "greater than zero and less than 85.");
	}

	/**
	 * Constructor with invalid argument parameter.
	 * @param num The invalid number of hours entered 
	 * by the user.
	 */
	public InvalidNumberOfHoursWorked(int num) {
		super("Error: " + num + " is an invalid number of hours."
			+ "Number of hours worked must be "
			+ "greater than zero and less than 85.");
	}

}
