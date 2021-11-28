package ch11java6thedition;
import java.util.Scanner;
/**
 * This program tests the TestScores class.
 * 
 * @author craig
 * 7/19/21
 * 4:57pm at home with Maria, about to pick up Sean 
 * from Band Camp.
 */
public class TestScoresTest {
	public static void main(String[]args) {
		double [] scores = new double [5];
		String answer = "n";

		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		for(int i = 5; i > 0; i--) {

			if(i == 1) {
				System.out.println("Enter 1 more score");
				scores[i -1] = input.nextInt();
			} else {
				System.out.println("Enter " + i + " more scores");
				scores[i -1] = input.nextInt();
			}
		}
		// Create a TestScores object
		try {
			TestScores testScores = new TestScores(scores);
			System.out.println("All done! The average of the test scores is " 
			            + testScores.average(scores));

		}
		catch (InvalidTestScore e) {
			System.out.println(e.getMessage());	
		}

	}	
}
