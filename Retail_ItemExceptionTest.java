package ch11java6thedition;

/**
 * This program tests the custom exception classes
 * with Retail_Item objects. This is for programming 
 * challenge #3. 
 * 
 * @author craig
 */
public class Retail_ItemExceptionTest {
	public static void main(String[]args) throws Exception{

		// Create a Retail_Item object that forces a 
		// NegativePrice exception and one that forces
		// a NegativeUnitsOnHand exception.
		try {
			Retail_Item item1 = new Retail_Item("Brush", 4, -4.00);
		}
		catch (NegativePrice e){
			System.out.println(e.getMessage());
		}
		try {
			Retail_Item item2 = new Retail_Item("Comb", -6, 4.00);
		}
		catch (NegativeUnitsOnHand p) {
			System.out.println(p.getMessage());
		}
		
	}	
}
