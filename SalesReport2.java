package ch11java6thedition;
import java.io.*; 			// For the File class and FileNotFoundException
import java.util.*;			// For the Scanner class and InputMismatchException
import javax.swing.JOptionPane;	// For the JOptionPane class
/**
 * This is Code Listing 11-6, an improvement on the
 * last SalesReport class which was capable of throwing
 * exceptions. The new version attempts to recover from as
 * many of the exceptions as possible without halting the 
 * program.
 * 
 * @author craig
 */
public class SalesReport2 {
	public static void main (String[]args) {
		String fileName = "/home/craig/NetBeansProjects/Ch11java6thEdition/src/ch11java6thedition/SalesData.txt";	// File name
		int months = 0;			// Month counter
		double totalSales = 0.0;		// Total Sales
		double oneMonth;			// One month's sales
		double averageSales;			// Average monthly sales

		// Attempt to open the file by calling the openfile method
		Scanner inputFile = openFile(fileName);

		// If the openFile method returned null, then the
		// file was not found. Get a new file name.
		while(inputFile == null) {
			fileName = JOptionPane.showInputDialog("ERROR: " +
				fileName + " does not exist. Please enter a new file name.");
			inputFile = openFile(fileName);
		}

		// Now that the file has been found, it can be read from.
		// this leads to the possibility of an InputMismatchException.

		while(inputFile.hasNext()) {
			try {
					// Read a line
					oneMonth = inputFile.nextDouble();
					// Accumulate the total
					totalSales += oneMonth;
					// Increment the month counter
					months++;
			}

			catch (InputMismatchException e) {
				// Display an error message
				JOptionPane.showMessageDialog(null, "ERROR: " +
					fileName + " contains non-numeric data. "
					+ "\nThe invalid record will be skipped.");

				// Skip the invalid data
				inputFile.nextLine();
			}
	
		}
		// Close the file
		inputFile.close();

		// Process the data
		averageSales = totalSales / months;

		// Display the data
		JOptionPane.showMessageDialog(null, String.format("Total sales: $%,.2f"
			+ "\nAverage sales: $%,.2f"
			+ "\nNumber of months: %d", totalSales, averageSales, months));
		
		System.exit(0);
	}	

	/**
	 * The openFile method opens the specified file 
	 * and returns a reference to a Scanner object.
	 * @param fileName The name of the file to open.
	 * @return A Scanner reference, if the file exists, otherwise
	 * 	  null is returned.
	 */
	public static Scanner openFile(String fileName) {
		Scanner scan;

		// Attempt to open the file
		try {
			File file = new File(fileName);
			scan = new Scanner(file);

		}
		catch (FileNotFoundException e) {
			scan = null;
			JOptionPane.showMessageDialog(null, "The file "
				+ fileName + " was not found.");
		}

		return scan;
	}
}
