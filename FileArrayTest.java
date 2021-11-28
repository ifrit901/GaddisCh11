package ch11java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This program tests the FileArray class.
 * 
 * @author craig
 */
public class FileArrayTest extends FileArray{
	public static void main(String[]args) throws IOException{

		int [] fileArray = {1, 2, 3, 4, 5};
		int [] fileArray2 = new int [fileArray.length];
		String fileName;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name of the file to be written"
			+ " to and read from: ");	

		fileName = input.nextLine();

		writeArray(fileName, fileArray);
		readArray(fileName, fileArray2);
		
		for(int p = 0; p < fileArray2.length; p++) {
			System.out.print(fileArray2[p] + " ");	
		}
	}	
}
