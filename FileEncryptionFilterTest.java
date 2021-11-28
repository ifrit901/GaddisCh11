package ch11java6thedition;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 * This program tests the FileEncryptionFilter 
 * class from programming challenge #7.
 * 
 * @author craig
 */
public class FileEncryptionFilterTest extends FileEncryptionFilter{
	public static void main(String[]args) throws IOException{
		String fileName;
		ArrayList<Integer>fileArray = new ArrayList<>();
		int num;
		int i = 0;
		boolean endOfFile = false;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Get the file name 
		System.out.println("Enter the data file to be read from:");
		fileName = input.nextLine();

		// Transfer the encrypted data to a new file
		writeFile(fileName, "EncryptedFile.dat");	

		// Read and display the encrypted data
		readFile("EncryptedFile.dat", fileArray);

		for(int number : fileArray) {
			System.out.print(number + " ");
		}
	}	
}
