package ch11java6thedition;

/**
 * This exception class checks for a valid month
 * number entry for the Month class constructor.
 * 
 * @author craig
 * 7/21/21
 * 8:17am
 * At work with Carlos
 */
public class InvalidMonthNumber extends Exception{
	
	public InvalidMonthNumber(int month) {
		super("Error: Month number must be between 1-12.");
	}

}
