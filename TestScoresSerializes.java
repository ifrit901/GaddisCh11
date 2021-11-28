package ch11java6thedition;
import java.io.*;

/**
 * This program tests the serializability of the 
 * SerializableTestScores class in programming
 * challenge #9.
 * 
 * @author craig
 */
public class TestScoresSerializes {
	public static void main(String[]args) throws IOException, InvalidTestScore{
		
		// Create an array of 5 SerializableTestScores objects 
		// to be serialized. 
		double [] scores = {51, 45, 56, 67, 67};

		// Create a SerializableTestScores object
		SerializableTestScores testScores = 
			new SerializableTestScores(scores); 

		try {
			ObjectOutputStream os = 
			new ObjectOutputStream(new FileOutputStream("Scores.dat"));	
			os.writeObject(testScores);
			os.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}	
}
