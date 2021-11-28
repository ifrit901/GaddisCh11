package ch11java6thedition;
import java.io.*;
/**
 * This is the FileArray class corresponding to 
 * programming challenge #6.
 * 
 * Design a class that has a static method named writeArray. 
 * The method should take two arguments: the name of a 
 * file and a reference to an int array. The file should be opened 
 * as a binary file, the contents of the array should be written 
 * to the file, and then the file should be closed.
 * 
 * Write a second method in the class named readArray. The 
 * method should take two arguments: the name of a file and
 * a reference to an int array. The file should be opened, the 
 * data should be read from the file and stored in the array, 
 * then the file should be closed. Demonstrate both methods 
 * in a program. 
 * 
 * @author craig
 */
public class FileArray {

	public static void writeArray(String fileName, int [] array) throws IOException {
		try {
			DataOutputStream outputFile = 
				new DataOutputStream(new FileOutputStream(fileName));
				for(int i = 0; i < array.length; i++) {
					outputFile.writeInt(array[i]);
				}

			outputFile.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void readArray(String fileName, int [] array) throws IOException {
		int number; 		// A number from the file
		boolean endOfFile = false; 	// End of file flag
				
		try {
			DataInputStream dataStream =
				new DataInputStream(new FileInputStream(fileName));

			int i = 0;
			while(!endOfFile) {
				number = dataStream.readInt();
				array [i] = number;
				i++; 
			}

			dataStream.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (EOFException e) {
			endOfFile = true;
		}

	}	

}
