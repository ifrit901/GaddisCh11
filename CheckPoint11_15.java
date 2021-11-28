package ch11java6thedition;

/**
 * This is Check Point 11.15-11.19.
 * 
 * @author craig
 */
public class CheckPoint11_15 {
	/**
	 * 11.15 What does a throw statement do?
	 * 
	 * answer: A throw statement causes an exception object to 
	 * be created.
	 * 
	 * 11.16 What is the purpose of the argument that is passed to
	 * an exception object's constructor? What happens if you do 
	 * not pass an argument to the constructor?
	 * 
	 * answer: The argument that is passed to an exception object's 
	 * constructor allows a message to be retrieved from the 
	 * object's getMessage method. If you don't pass an argument 
	 * then the retrieved message will be null.
	 * 
	 * 11.17 What is the difference between a throw statement and 
	 * the throws clause?
	 * 
	 * answer: A throw statement creates an exception object. The 
	 * throws clause tells the compiler that a method is able to 
	 * throw an exception of some type.
	 * 
	 * 11.18 If a method has a throw statement, does it always have
	 * to have a throws clause in the header? 
	 * 
	 * answer: Not if it is an unchecked exception. 
	 * Only if the exception is checked.
	 * 
	 * 11.19 If you are writing a custom exception class, how can you make 
	 * sure it is checked? How can you make sure it is unchecked?
	 * 
	 * answer: You can make sure it is checked by extending it from 
	 * the Exception class. You can make sure it is unchecked by 
	 * extending it from the Error or Runtime classes.
	 */
}
