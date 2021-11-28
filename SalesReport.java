package ch11java6thedition;
import java.util.*;			// For Scanner and InputMismatchException
import java.io.*;			// For File class and FileNotFoundException
import javax.swing.JOptionPane;	// For JOptionPane class
/**
 * This is Code Listing 11-5 which demonstrates
 * how multiple exceptions can be caught with
 * one try statement.
 * 
 * @author craig
 */
public class SalesReport {
	public static void main(String[]args) {
		String fileName = "SalesData.txt"; 	// For file name
		int months = 0;			// Month counter
		double oneMonth;			// One month's sales
		double totalSales = 0.0;		// Total sales
		double averageSales;			// Average sales

		try {
			// Open the file
			File file = new File(fileName);
			Scanner inputFile = new Scanner(file);
			
			// Process the contents of the file
			while(inputFile.hasNext()) {
				
				// Get a month's sales
				oneMonth = inputFile.nextDouble();

				// Accumulate the amount
				totalSales += oneMonth;

				// Increment the month counter
				months++;
				
			}

			// Close the file
			inputFile.close();

			// Calculate the average
			averageSales = totalSales / months;

			// Display the results
			JOptionPane.showMessageDialog(null, String.format("Total sales: $%,.2f\n" + 
						      "\nAverage sales per month: $%,.2f" + 
						      "\nNumber of months: %d", 
						        totalSales, averageSales, months));
		}
		catch (FileNotFoundException e) {
			// Thrown by the Scanner object if the 
			// file is not found
			JOptionPane.showMessageDialog(null, 
				"The file " + fileName + " was not found.");
		}
		catch (InputMismatchException e) {
			// Thrown by the Scanner class's nextDouble
			// method when a non-numeric value is found
			
		}

	}	
}
