package ch11java6thedition;
import java.io.*;
import java.util.Scanner;

/**
 * This program de-serializes the SerializableTestScores
 * objects created in the TestScoresSerializes program.
 * 
 * @author craig
 */
public class DeserializableTestScores {
	public static void main(String[]args) throws Exception, InvalidTestScore{

		String fileName;
		ObjectInputStream inputStream; 
		SerializableTestScores sTs;
		Scanner input = new Scanner(System.in);

		// Get file name from the user.
		System.out.println("Enter the file name with the test "
			+ "score objects to be de-serialized:");
		fileName = input.nextLine();

		inputStream = 
			new ObjectInputStream(new FileInputStream(fileName)); 	

		sTs = (SerializableTestScores) inputStream.readObject();

		System.out.println(sTs.toString());	
		inputStream.close();
		
	}	
}
