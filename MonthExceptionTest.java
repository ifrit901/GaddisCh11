package ch11java6thedition;

/**
 * This program tests the modified Month class
 * to see if its corresponding exception classes work.
 * 
 * @author craig
 */
public class MonthExceptionTest {
	public static void main(String[]args) throws InvalidMonthName{
		// Create a Month object that forces an
		// InvalidMonthName exception to be thrown.
		try {
			Month month1 = new Month("Febtober");
			System.out.println("October is a valid month name.");
		}
		catch (InvalidMonthName e) {
			System.out.println(e.getMessage());
		}

		try {
			Month month2 = new Month();
			month2.setMonthNumber(13);
		}
		catch (InvalidMonthNumber e) {
			System.out.println(e.getMessage());
		}
	}	
}
