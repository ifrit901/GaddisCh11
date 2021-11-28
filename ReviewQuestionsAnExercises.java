package ch11java6thedition;

/**
 * These are the review questions and exercises 
 * for chapter 11.
 * 
 * @author craig
 */
public class ReviewQuestionsAnExercises {
	/*
	1. When an exception is generated, it is said to have been ________.
		a. built
		b. thrown
		c. caught
		d. killed

	answer: b. thrown. It has not been caught by a handler at this time.

	2. This is section of code that gracefully responds to exceptions.
		a. exception generator
		b. exception manipulator
		c. exception handler
		d. exception monitor

	answer: c. exception handler

	3. If your code does not handle an exception when it is thrown,
	    it is dealt by this.
		a. the default exception handler
		b. the operating system
		c. system debugger
		d. default exception generator

	answer: a. the default exception handler

	4. All exception classes inherit from this class.
		a. Error
		b. RuntimeException
		c. JavaException
		d. Throwable

	answer: d. Throwable

	5. FileNotFoundException inherits from __________. 
		a. Error
		b. IOException
		c. JavaException
		d. FileException

	answer: IOException

	6. You can think of this code as being "protected" because the application
	    will not halt if it thows an exception.
		a. try block
		b. catch block
		c. finally block
		d. protected block

	answer: a. try block

	7. This method can be used to retrieve the error message from 
	    an exception object.
		a. errorMessage
		b. errorString
		c. getError
		d. getMessage

	answer: getMessage

	8. The numeric wrapper classes "parse" methods all throw an exception
	    of this type.
		a. ParseException 
		b. NumberFormatException
		c. IOException
		d. BadNumberException

	answer: b. NumberFormatException

	9. This is one or more statements that are executed after the try block
	    has executed and after any catch blocks have executed if an exception
	    was thrown.
		a. try block
		b. catch block
		c. finally block
		d. protected block

	answer: c. finally block

	10. This is an internal list of all the methods that are executing. 
		a. invocation list
		b. call stack
		c. call list
		d. call trace

	answer: b. call stack

	11. This method may be called from any exception object, and it 
	      shows the chain of methods that were called when the exception
	      was thrown.
		a. printInvocationList
		b. printCallStack
		c. printStackTrace
		d. printCallList

	answer: c. printStackTrace

	12. These are exceptions that inherit from the Error class or the
	      RuntimeException class. 
		a. unrecoverable exceptions
		b. unchecked exceptions
		c. recoverable exceptions
		d. checked exceptions

	answer: b. unchecked exceptions

	13. All exceptions that do not inherit from the Error class or the 
	      RuntimeException class are _________.
		a. unrecoverabel exceptions
		b. unchecked exceptions
		c. recoverable exception
		d. checked exceptions

	answer: checked exceptions

	14. This informs the compiler of the exceptions that could get thrown 
	      from a method. 
		a. throws clause
		b. parameter list
		c. catch clause
		d. method return type

	answer: a. throws clause

	15. You use this statement to throw an exception manually
		a. try 
		b. generate
		c. throw
		d. System.exit(0)

	answer: throw

	16. This is the process of converting an object to a series of bytes
	      that represent the object's data.
		a. serialization
		b. deserialization
		c. dynamic conversion
		d. casting

	answer: a. serialization

	// True or False

	17. You are not required to catch exceptions that inherit from the
	      RuntimeException class. 

	answer: true

	18. When an exception is thrown by code inside a try block, all of 
	      the statements inside the try block are always executed.

	answer: false

	19. IOException serves as a superclass for exceptions that are related 
	      to programming errors, such as an out-of-bounds array subscript.

	answer: false

	20. You cannot have more than one catch clause per try statement.

	answer: false

	21. When an exception is thrown, the JVM searches the try statement's 
	      catch clauses from top to bottom and passes control of the program 
	      to the first catch clause with a parameter that is compatable with
	      the exception.

	answer: true

	22. Not including polymorphic references, a try statement may have only
	      one catch clause for each specific excption. 

	answer: true

	23. When in the same try statement you are handling multiple exceptions 
	      and some of the exceptions are related to each other through inheritance, 
	      you should handle the more general exception classes before the more
	      specialized exception classes.

	answer: true

	24. The throws clause causes an exception to be thrown.

	answer: true


	*/	
	public static void main (String[]args) {
		/*
		Find the error

		1. catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		try {
			File file = new File("MyFile.txt");
			Scanner inputFile = new Scanner(file);
		}

		// So in this example the try statement should come 
		// before the catch statement.

		2. // Assume inputFile represents a Scanner object
		try {
			inputFile = inputFile.nextInt();
		}
		finally {
			inputFile.close();
		}
		catch (InputMismatchException e){
			System.out.println(e.getMessage());	
		}

		// Again, in this example, the blocks are out of order.
		// The finally block should come after the catch block.

		3. try {
			number = Integer.parseInteger(str);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Bad number format.");
		}
		catch (NumberFormatException e) {
			System.out.println(str + " is not a number.");
		}
			
		// In this problem, each exception should be handled by
		// only one catch clause but it is not. A user entering a 
		// non-numerical string will be caught by all the catch
		// clauses, since IllegalArgument inherits from Exception
		// and NumberFormatException inherits from 
		// IllegalArgumentException.

		4. 

		*/
	}
}
