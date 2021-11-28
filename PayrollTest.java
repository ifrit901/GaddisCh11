package ch11java6thedition;

/**
 * 5. Payroll Class Exceptions. Programming Challenge 5 of chapter 6
 * required you to write a Payroll class that calculates an employee's 
 * payroll. Write exception classes for the following error conditions:
 * 
 * - An empty string is given for the employee's name.
 * - An invalid number is given for the employee's ID number.
 * If you implemented this field as a string, then an empty string
 * would be invalid. If you implemented this field as a numeric 
 * value, then a negative number or zero would be invalid.
 * - An invalid number is given for the number of hours worked.
 * This would be a negative number or a number greater than 84.
 * - An invalid number is given for the hourly pay rate. This would 
 * be a negative number or a number greater than 25. 
 * 
 * Modify the Payroll class so that it throws the appropriate exception
 * when any of these errors occurs. Demonstrate the exception classes
 * in a program.
 * 
 * @author craig
 * 7/22/21
 * 7:52am
 * At work with Carlos. Maria is on shift with Patrick Ward
 */
import java.util.Scanner;
public class PayrollTest {
	public static void main(String[]args) {
		String name;
		int employeeID;
		int numberOfHoursWorked;
		double payRate;
		Payroll payRoll;		

		Scanner input = new Scanner(System.in);

		// Get user input 
		System.out.println("Enter the employee's name:");
		name = input.nextLine();

		System.out.println("Enter the employee's ID number:");
		employeeID = input.nextInt();

		System.out.println("Enter the employee's number of hours worked:");
		numberOfHoursWorked = input.nextInt();

		System.out.println("Enter the employee's rate of pay per hour:");
		payRate = input.nextDouble();

		// Create a Payroll object for the employee that 
		// handles any exception errors in data entry.
		while(true) {
			try {
				payRoll = new Payroll(name, employeeID);
				break;
			}
			catch (EmptyString e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter a valid employee name:");
				name = input.nextLine();
			}
			catch (InvalidID e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter a valid employee ID:");
				employeeID = input.nextInt();
			}
		}
		
		// Test the other methods in the Payroll class
		// for exception functionality.
		while(true) {
			try {
				payRoll.setNumberOfHoursWorked(numberOfHoursWorked);
				break;
			}
			catch (InvalidNumberOfHoursWorked e) {
				System.out.println(e.getMessage());
				System.out.println("Enter the number of hours worked:");
				numberOfHoursWorked = input.nextInt();
			}
		}

		while(true) {
			try {
				payRoll.setPayRate(payRate);
				break;
			}
			catch (InvalidHourlyPayRate e) {
				System.out.println(e.getMessage());
				System.out.println("Enter the employee's pay rate");
				payRate = input.nextDouble();
			}
		}
	
		System.out.println();
		System.out.println("Since everything should have been entered " +
			 "\ncorrectly so far, this is the employee's \ntotal payroll info:");
		System.out.println(payRoll.toString());
	}
	
}
