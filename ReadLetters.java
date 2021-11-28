package ch11java6thedition;
import java.io.*;
import java.util.Random;
/**
 *
 * @author craig
 */
public class ReadLetters {
	public static void main(String[]args) throws IOException{
		char letter;
		boolean endOfFile = false;
		
		RandomAccessFile randyFile = new RandomAccessFile("letters.dat", "r");

		System.out.println("First, we will write the letters in order in lines of 5.");
		while(!endOfFile) {
			try {
				for(int i = 0; i < 5; i++) {
					letter = randyFile.readChar();
					System.out.print(letter + ", ");
				}
				System.out.println();
			}
			catch (EOFException e) {
				endOfFile = true;
			}
		}

		System.out.println("\nNext, we will read letters from random positions in the file.\n");

		// Return the file pointer to the beginning of the file
		randyFile.seek(0);

		Random randy = new Random();
		
		try {
			for (int i = 1; i < 50; i++) {
				/*
				Generate a random number fo tell the file pointer
				what byte location to go to. There are 26 letters
				in the alphabet, so the number's range should be
				1 - 26. The default range of the Random class with
				argument 'n' is  0 - (n -1), so It's really like 0 - 25.
				Also, the binary file is a list of chars which occupy
				two bytes each, so the number should actually be
				1 - 52 (or 0 - 51 since the pointer starts at zero).
				*/
				int position = randy.nextInt(51);
				System.out.print("(" + position + ")");
				if(position % 2 != 0) {
					position += 1;
				}
			
				// Position the file pointer at a random location 
				// within the file.
				randyFile.seek(position);
				letter = randyFile.readChar();
				System.out.print(letter + ", ");
				if(i % 10 == 0) {
					System.out.println();
				}
			}	
		}

		catch (EOFException e) {
			System.out.println("The end of the file has been reached.");
		}

		randyFile.close();
		System.out.println("\nDone reading letters.");

	}	
}
