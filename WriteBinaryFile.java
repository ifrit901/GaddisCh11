package ch11java6thedition;
import java.io.*;
/**
 * This is Code Listing 11-13 which opens a binary
 * file and writes the contents of an int array to 
 * the file.
 * 
 * @author craig
 */
public class WriteBinaryFile {
	public static void main(String[]args) throws IOException {
		// This array will be written to the file
		int [] numbers = {2, 4, 6, 8, 10, 12, 14};

		// Create the binary output objects
		FileOutputStream fstream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);

		System.out.println("Writing numbers to the file...");

		// Write the elements of the array to the file
		for(int i = 0; i < numbers.length; i++) {
			outputFile.writeInt(numbers[i]);
		}

		System.out.println("Done.");

		outputFile.close();
	}	
}
