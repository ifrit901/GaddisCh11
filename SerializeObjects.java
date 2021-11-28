package ch11java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This is Code Listing 11-17 which serializes 
 * the objects in an array of BankAccount2 objects.
 * 
 * @author craig
 */
public class SerializeObjects {
	public static void main(String[]args) throws IOException, NegativeStartingBalance {
		double balance;		// An account balance
		final int NUM_ITEMS = 3;		// The number of accounts

		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Create a BankAccount2 array
		BankAccount2 [] accounts = new BankAccount2[NUM_ITEMS];

		// Populate the array
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Enter the amount for account " + (i + 1));
			balance = input.nextDouble();
			accounts[i] = new BankAccount2(balance);
		}

		// Create the stream objects
		FileOutputStream outFile = new FileOutputStream("Objects.dat");
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outFile);

		// Write the serialized objects to the file
		for(int i = 0; i < accounts.length; i++) {
			objectOutputFile.writeObject(accounts[i]);
		}

		// Close the file
		objectOutputFile.close();

		System.out.println("The serialized objects have been written to the file.");
	}	
}
