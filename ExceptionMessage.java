package ch11java6thedition;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This is Code Listing 11-3 which retrieves the 
 * default error message. 
 * 
 * @author craig
 * 6/23/21
 * 9:05am
 * At work with Colin
 */
public class ExceptionMessage {
	public static void main(String[]args) {
		File file; 		// For file input
		Scanner inputFile;	// To read from file
		String fileName;	// To hold the file name

		// Get a file name from the user
		fileName = JOptionPane.showInputDialog("Enter a file name.");

		// Make a try-catch block
		try {
			file = new File(fileName);
			inputFile = new Scanner(file);
			JOptionPane.showMessageDialog(null, "The file was found.");
		} 
		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "Done");
		System.exit(0);
		
	}	
}
