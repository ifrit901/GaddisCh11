package ch11java6thedition;

/**
 * The InvalidID class catches exceptions thrown
 * by the Payroll class if an employee ID number
 * is entered as an empty string or a negative number.
 * 
 * @author craig
 */
public class InvalidID extends Exception{
	
	/**
	 * No argument constructor.
	 */
	public InvalidID() {
		super("Error: Invalid ID entered.");
	}

	/**
	 * Constructor with invalid input argument.
	 * @param num 
	 */
	public InvalidID(int num) {
		super("Error: " + num + " is an invalid employee ID.");
	}
}
