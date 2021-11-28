package ch11java6thedition;

/**
 * The EmptyString class catches exceptions thrown
 * from the Payroll class when the user enters an empty 
 * string for the employee's name.
 * 
 * @author craig
 */
public class EmptyString extends Exception{
	
	/**
	 * Constructor with no arguments.
	 */
	public EmptyString() {
		super("Error: Empty string.");
	}

	/**
	 * Constructor with user input.
	 * @param name The empty string entered for the 
	 * employee's name.
	 */
	public EmptyString(String name) {
		super("Error: Empty string entered.");
	}

}
