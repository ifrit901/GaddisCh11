package ch11java6thedition;

/**
 * This is a custom exception class for the TestScores class.
 * 
 * @author craig
 */
public class InvalidTestScore extends Exception{
	
	public InvalidTestScore(double score) {
		super("ERROR: Invalid test score");
	}

}
