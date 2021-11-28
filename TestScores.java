package ch11java6thedition;
import java.lang.IllegalArgumentException;

/**
 * This is programming challenge #1.
 * Write a class named TestScores. The class constructor should accept
 * an array of test scores as an argument. The class should have a method
 * that returns the average of the test scores. If any test score in the array
 * is less than 0 or greater than 100, the class should throw an 
 * IllegalArgumentException. Demonstrate the class in a program. 
 * 
 * @author craig
 * 
 */
public class TestScores {
		
	double [] scores;

	TestScores(double [] scores) throws InvalidTestScore{
		this.scores = scores;
		average(scores);
	}

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

}
