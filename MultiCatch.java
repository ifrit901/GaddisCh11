package ch11java6thedition;
import java.io.*;			// For the File class and FileNotFoundException
import java.util.*;			// For the Scanner and InputMismatchException

/**
 * This is Code Listing 11-8 which demonstrates 
 * a single catch clause that handles multiple
 * exceptions.
 * 
 * @author craig
 */
public class MultiCatch {
	public static void main(String[]args) {
		int number;	// To hold a number from a file

		try {

			// Open the file
			File file = new File("/home/craig/NetBeansProjects/Ch11java6thEdition/src/ch11java6thedition/Numbers.txt");
			Scanner inputFile = new Scanner(file);

			// Process the contents of the file
			while (inputFile.hasNext()) {
				number = inputFile.nextInt();

				System.out.println(number);
			}
			
			// Close the file
			inputFile.close();
		}

		catch (FileNotFoundException | InputMismatchException e) {
			// Display an error message
			System.out.println("Error processing the file.");
		}

	}			
}
