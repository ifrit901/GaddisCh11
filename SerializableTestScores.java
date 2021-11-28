package ch11java6thedition;
import java.io.Serializable;

/**
 * Programming challenge #9.
 * Modify the TestScores class that you created for Programming
 * challenge #1 to be serializable. Write a program that creates an
 * array of at least 5 TestScore objects and serializes them. Write
 * another program that de-serializes them. 
 * 
 * @author craig
 * 7/31/21
 * 13:01pm
 * at work, no more Maria 
 */
public class SerializableTestScores implements Serializable {
	
	private double [] scores;
	private double average;

	/**
	 * Constructor takes an array of doubles, assigns 
	 * them to a private array field.
	 * @param scores The array of double test scores.
	 * @throws InvalidTestScore 
	 */
	SerializableTestScores(double [] scores) throws InvalidTestScore{
		this.scores = new double [scores.length];
		for(int i = 0; i < scores.length; i++) {
			this.scores[i] = scores[i];
		}
		average = average(scores);
	}

	/**
	 * The average method returns the average of
	 * all the test scores in the scores array member.
	 * @param scores The array of test scores.
	 * @return The average of the test scores.
	 * @throws InvalidTestScore 
	 */
	public double average(double [] scores) throws InvalidTestScore{
		double average;
		double total = 0.0;

		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < 0 || scores[i] > 100) {
				/*
				throw new IllegalArgumentException("No "
					+ "numbers below 0 or above 100.");
				*/
				throw new InvalidTestScore(scores[i]);
			}
			total += scores[i];
		}
		average = total / scores.length;

		return average;
	}

	/**
	 * The getScore method returns an element
	 * of the scores array.
	 * @param e The subscript of the array element.
	 * @return The score array element.
	 */
	public double getScore(int e) {
		return scores[e];
	}

	/**
	 * The getAverage method returns the value
	 * in the average field.
	 * @return The average of the test scores.
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * The toString method returns a formatted version
	 * of the data in the scores array and their average.
	 * @return The SerializableTestScores object in string form.
	 */
	public String toString() {
		return "Test Score 1: " + getScore(0) + "\n" +
			"Test Score 2: " + getScore(1) + "\n" +
			"Test Score 3: " +  getScore(2) + "\n" + 
			"Test Score 4: " +  getScore(3) + "\n" + 
			"Test Score 5: " + getScore(4) + "\n" +
			"Average: " + getAverage(); 
	}

}
