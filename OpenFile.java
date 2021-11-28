package ch11java6thedition;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * This is code listing 11-2. It exemplifies a
 * FileNotFound exception.
 *
 * @author craig
 */
public class OpenFile {
	public static void main(String[]args) {
		File file;		// For file input
		Scanner inputFile;	// For more file input
		String fileName;	// To hold a file name

		// Get a file name from the user
		fileName = JOptionPane.showInputDialog("Enter a file name.");

		// try block
		try {
			file = new File(fileName);
			inputFile = new Scanner(file);
			JOptionPane.showMessageDialog(null, "The file was found.");
		}

		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "The file was not found.");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
		}

		JOptionPane.showMessageDialog(null, "Done.");
		System.exit(0);
	}
}
