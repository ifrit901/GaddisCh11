package ch11java6thedition;

/**
 * This exception class catches negative price entries
 * on Retail_Item class objects.
 * 
 * @author craig
 * 7/21/21
 * 6:43am at work with Carlos
 */
public class NegativePrice extends Exception {
	
	/**
	 * Constructor with a generic error message.
	 */
	public NegativePrice() {
		super("Error: Price entered was negative.");
	}

	/**
	 * Constructor with detailed error message.
	 * @param amount The price of the item.
	 */
	public NegativePrice(double amount) {
		super("Error: Price entered was negative. ($" + amount + ")");
	}

}
