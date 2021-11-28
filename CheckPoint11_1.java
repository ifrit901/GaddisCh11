package ch11java6thedition;

/**
 * This is CheckPoint 11.1 - 11.14.
 * 
 * @author craig
 */
public class CheckPoint11_1 {
	/**
	 * 1. Briefly describe what an exception is.
	 * 
	 * answer: An exception is an object that is generated when 
	 * a program encounters an unexpected error or problem.
	 * 
	 * 2. What does it mean to "throw" an exception? 
	 * 
	 * answer: When an exception is "thrown", an object of the 
	 * exception type is created and passed(thrown) to the runtime.
	 * 
	 * 3. If an exception is thrown and the program does not handle
	 * it, what happens?
	 * 
	 * answer: The default exception handler prints an error message
	 * and the program is halted.
	 * 
	 * 4. Other than the Object class, what is the superclass for all 
	 * exceptions?
	 * 
	 * answer: The superclass for all exceptions is Throwable.
	 * 
	 * 5. What is the difference between exceptions that inherit from 
	 * the Error class and exceptions that inherit from the Exception class?
	 * 
	 * answer: Exceptions thrown from the Error class are for serious 
	 * problems like an error in the JVM or running out of memory. 
	 * Exceptions from the Exception class are thrown due to problems
	 * with a program's code or with a file that has data problems or 
	 * does not exist.
	 * 
	 * 6. What is the difference between a try block and a catch block?
	 * 
	 * answer: A try block is a block of code that tries to accomplish a 
	 * task that may throw an exception. A catch block contains code 
	 * that attempts to handle problems that may arise in the try block.
	 * 
	 * 7. After the catch block has handled the exception, where does 
	 * program execution resume? 
	 * 
	 * answer: After the exception has been handled, the program resumes
	 * with the next statement after the try/catch construct.
	 * 
	 * 8. How do you retrieve an error message from an exception? 
	 * 
	 * answer: You do this by calling the getMessage() method on the 
	 * exception object's variable name.
	 * 
	 * 9. If multiple exceptions can be thrown by code in a try block, 
	 * how does the JVM know which catch clause to pass control of
	 * the program to?
	 * 
	 * answer: The JVM searches the catch clauses for one with a parameter
	 *  that matches the type of exception that was thrown.
	 * 
	 * 10. When does the code in the finally block execute?
	 * 
	 * answer: After the code in the try block and any catch clauses that 
	 * may have executed. The finally block is optional and executes 
	 * regardless of whether any catch clauses executed. 
	 * 
	 * 11. What is the call stack? What is a stack trace?
	 * 
	 * answer: The call stack is the order of processing control established 
	 * by the order of method calls. If a method is called, it's at the top of 
	 * the stack. If that method calls another method, the second method
	 * becomes the top of the stack and is removed when done executing.
	 * A stack trace is a printout of the method calls in a call stack.
	 * 
	 * 12. A program's main method calls method A, which calls method B. None 
	 * of these methods performs any exception handling. The code in
	 * method B throws an exception. Describe what happens. 
	 * 
	 * answer: Method B does not handle the exception so it passes responsibility
	 * for handling it to the method that called it, method A. Method A also 
	 * does not handle it so it passes handling responsibility to the method 
	 * that called it, the main method. The main method also doesn't handle it 
	 * so the default exception handler is called. 
	 * 
	 * 13. What are the differences between a checked and unchecked exception?
	 * 
	 * answer: Unchecked exceptions are those that inherit from the Error or 
	 * RuntimeException classes. These are serious errors that should not 
	 * be handled in the program. All other exceptions are checked and should 
	 * be handled or have a throws clause listed in the method header.
	 * 
	 * 14. When are you required to have a throws clause in the method header?
	 * 
	 * answer: When a method contains code capable of throwing an exception
	 * that is not handled by a try/catch block.
	 * 
	 * 
	 * 
	 * 
	 */	
}
