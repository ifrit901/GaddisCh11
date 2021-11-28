package ch11java6thedition;

/**
 * This is Code Listing 11-10 which shows how 
 * the modified constructor in the Die class works.
 * 
 * @author craig
 */
public class DieException {
	public static void main (String[]args) {

		final int DIE_SIDES = 1;	// Creates an error with the class

		// Create an instance of the Die class
		Die die = new Die(DIE_SIDES);

		System.out.println("Initial value of the die: ");
		System.out.println(die.getValue());

	}	
}
