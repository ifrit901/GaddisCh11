package ch11java6thedition;
import java.io.*;
/**
 * This is Code Listing 11-14 which reads data
 * from a binary file. 
 * 
 * @author craig
 */
public class ReadBinaryFile {
	public static void main(String[]args) throws IOException{
		int number;		// To hold a number read from file
		boolean endOfFile = false;	// Flag to catch end of file

		FileInputStream fstream = new FileInputStream("Numbers.dat");	
		DataInputStream inputFile = new DataInputStream(fstream);

		System.out.println("Reading from the file...");

		// Read from the file
		while(!endOfFile) {
			try {
				number = inputFile.readInt();
				System.out.print(number + " ");
			} 
			catch (EOFException e) {
				endOfFile = true;
			}	
		}
		System.out.println("\nEnd of file");
	}	
}
