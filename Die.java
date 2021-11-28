package ch11java6thedition;
import java.util.Random;

/**
 * This is Code Listing 11-9 which demonstrates 
 * using a throws clause with an object's constructor.
 * 
 * @author craig
 */
public class Die {
	
	private final int MIN_SIDES = 4;
	private int sides;			// The number of sides
	private int value;			// The die's value

	
	/**
	 * The constructor performs an initial roll of the die.
	 * @param numSides The number of sides on this die.
	 */
	public Die(int numSides) {
		// Validate the number of sides
		if(numSides < MIN_SIDES) {
			throw new IllegalArgumentException(""
				+ "The die must have at least "
				+ MIN_SIDES + " sides.");
		}

		// Store the number of sides and roll
		sides = numSides;
		roll();
	}

	/**
	 * The roll method simulates the rolling of a die.
	 */
	public void roll() {

		Random randy = new Random();
		value = randy.nextInt(sides) + 1;

	}

	/**
	 * The getSides method returns the number of 
	 * sides on this die.
	 * @return The number of sides on the die.
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * The getValue method returns the int in the 
	 * value variable.
	 * @return The value of the die.
	 */
	public int getValue() {
		return value;
	}

}
