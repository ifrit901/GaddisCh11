package ch11java6thedition;

/**
 * This is Code Listing 11-4. This program forces the parseInt
 * method of the Integer wrapper class to throw an exception.
 * 
 * @author craig
 * 
 */
public class ParseIntError {
	public static void main(String[]args) {
		String str = "abcde";
		int number;

		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Conversion error: " + e.getMessage());
		}
			
	}	
}
