package ch11java6thedition;

/**
 * This is Code Listing 11-12 which tests the custom
 * exceptions in NegativeStartingBalance.
 * 
 * @author craig
 */
public class AccountTest {
	public static void main(String[]args) {

		// Force a NegativeStartingBalance exception.
		try {
			BankAccount account = new BankAccount(-100.0); 
		}
		catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		}
	}	
}
