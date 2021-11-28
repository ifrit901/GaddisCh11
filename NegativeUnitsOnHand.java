package ch11java6thedition;

/**
 * This class catches exceptions for negative entries
 * in the numberOnHand field of a Retail_Item object.
 * 
 * @author craig
 */
public class NegativeUnitsOnHand extends Exception{
	
	public NegativeUnitsOnHand() {
		super("Error: Units on hand cannot be negative.");
	}

	public NegativeUnitsOnHand(int units) {
		super("Error: " + units + " units listed, Units on hand "
			+ "cannot be negative.");
	}

}
