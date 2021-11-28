package ch11java6thedition;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * This program is to demonstrate writing 
 * strings to a binary file.
 * 
 * @author craig
 */
public class WriteStringFile {
	public static void main(String[]args) throws IOException {
		// To hold pet names
		String pet;

		// Create and open a file for writing pet names
		FileOutputStream fstream = new FileOutputStream("Pets.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		// Let the user know what's going on
		JOptionPane.showMessageDialog(null, "Enter 5 names of pets you know "
			+ "\nand I'll write them into a file.");
		
		for(int i = 0; i < 5; i++) {
			pet = JOptionPane.showInputDialog("Enter pet #" + i + ".");
			outputFile.writeUTF(pet);
		}

		JOptionPane.showMessageDialog(null, "The names have been writtn to a file.");
	}	
}
