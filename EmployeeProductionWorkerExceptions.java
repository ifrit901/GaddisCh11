package ch11java6thedition;
import java.util.Scanner;


/**
 * This program demos the modified Employee 
 * and ProductionWorker classes to include 
 * exceptions for invalid user input. It corresponds
 * to programming challenge #10.
 * 
 * • Employee name
 * • Employee number in the format XXX–L, where each X is a digit within the range 0–9
 *    and the L is a letter within the range A–M.
 * • Hire date
 * 
 * Write one or more constructors and the appropriate accessor and mutator methods for the class.
 * Next, write a class named ProductionWorker that extends the Employee class. The
 * ProductionWorker class should have fields to hold the following information:
 * 
 * • Shift (an integer)
 * • Hourly pay rate (a double )
 * 
 * The workday is divided into two shifts: day and night. The shift field will be an integer value
 * representing the shift that the employee works. The day shift is shift 1 and the night shift is
 * shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
 * the class. Demonstrate the classes by writing a program that uses a ProductionWorker object. 
 * 
 * @author craig
 * 8/2/21
 * 12:02pm 
 * at home with Sean playing Dark Souls III
 */
public class EmployeeProductionWorkerExceptions {
	public static void main(String[]args) 
		throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate{

		String name;
		String employeeNumber;
		String hireDate;

		Scanner input = new Scanner(System.in);

		// Boolean for loop
		boolean throwsException = false;

		// Create a valid EmployeeException object with no thrown exceptions
		EmployeeException employee = 
			new EmployeeException("Sean", "123-B", "8/15/21");

		System.out.println(employee.toString());

		// Create an EmployeeException object that throws an exception
		try {
			EmployeeException employee2 = 
				new EmployeeException("Sean", "45h-M", "8/15/21");

			System.out.println(employee2.toString());
		}
		catch (InvalidEmployeeNumber e) {
			System.out.println(e.getMessage());
		}

		// Create a ProductionWorkerException object that is valid
		ProductionWorkerException pwe = 
			new ProductionWorkerException("Sean", "123-F", "8/15/21", 1, 21.0);
		System.out.println("\n" + pwe.toString());

		// Create an ProductionWorkerException object that 
		// throws an exception

		try {
			ProductionWorkerException pwe2 = 
			new ProductionWorkerException("Sean", "123-F", "8/15/21", 2, -21.0);
		}
		catch (InvalidShift e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidEmployeeNumber e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		}
				
		/*
		while(!throwsException) {
			System.out.println("Enter the information for another employee:");
			System.out.println("Name: ");
			name = input.nextLine();
		
			System.out.println("Employee number: ");
			employeeNumber = input.nextLine();
		
			System.out.println("Hire date: ");
			hireDate = input.nextLine();

			try {
				EmployeeException employee3 =
				new EmployeeException(name, employeeNumber, hireDate);
				System.out.println(employee3.toString());
				throwsException = true;
			}
			catch (InvalidEmployeeNumber e) {
				System.out.println(e.getMessage());
			}
		}
		*/
		System.out.println("Thanks for your participation!");
	}	
}
