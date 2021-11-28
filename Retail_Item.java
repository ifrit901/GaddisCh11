package ch11java6thedition;

/**
 * This is the Retail_Item class from programming challenge #4.
 * It will be modified to catch exceptions for invalid price and inventory
 * quantity entries.
 * 
 * @author craig
 */
public class Retail_Item {
	// Class fields 
	private String description;
	private int numberOnHand;
	private double price;

	// Constructors
	public Retail_Item() {
		description = "";
		numberOnHand = 0;
		price = 0.0;
	}

	public Retail_Item(String desc, int num, double cost) throws NegativePrice, 
		NegativeUnitsOnHand{
		description = desc;
		numberOnHand = num;
		price = cost;
		if(price < 0.0) {
			throw new NegativePrice(price);
		}
		if(num < 0) {
			throw new NegativeUnitsOnHand(numberOnHand);
		}
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the numberOnHand
	 */
	public int getNumberOnHand() {
		return numberOnHand;
	}

	/**
	 * @param numberOnHand the numberOnHand to set
	 */
	public void setNumberOnHand(int numberOnHand) {
		this.numberOnHand = numberOnHand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Override the toString method for a tidy formatting 
	 * of the data
	 * @return The formatted object data
	 */
	@Override 
	public String toString() {
		return String.format(description + "\t\t"
		                    + numberOnHand + "\t\t" + price);
				    
	}
}
