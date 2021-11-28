package ch11java6thedition;

/**
 * This exception class validates that the 
 * appropriate name of a month has been entered.
 * 
 * @author craig
 */
public class InvalidMonthName extends Exception{
	
	public InvalidMonthName(String name) {
		super("Error: " + name + " is not a valid month name.");
	}

}
