package ch11java6thedition;
import java.io.*;
/**
 * This is Code Listing 11-18 which de-serializes 
 * the objects in Objects.dat.
 * 
 * @author craig
 */
public class DeserializeObjects {
	public static void main (String[]args) throws Exception {
		double balance;		// To hold a balance
		final int NUM_ITEMS = 3;		// Number of accounts

		// Create the stream objects
		FileInputStream inStream = new FileInputStream("Objects.dat");
		ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

		// Create a BankAccount2 array
		BankAccount2 [] accounts = new BankAccount2[NUM_ITEMS];

		// Read the objects from the file and put them in the array
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = (BankAccount2)objectInputFile.readObject();
		}

		// Close the file
		objectInputFile.close();

		// Dislplay the objects
		for(int i = 0; i < accounts.length; i++) {
			System.out.println("Account " + (i + 1) + ": " 
				+ accounts[i].getBalance());
		}
		
	}	
}
