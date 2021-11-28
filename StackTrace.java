package ch11java6thedition;

/**
 * This is Code Listing 11-7 which prints 
 * a stack trace of the errors thrown.
 * 
 * @author craig
 */
public class StackTrace {
	public static void main(String[]args) {
		System.out.println("Calling myMethod...");
		myMethod();
		System.out.println("Method main is done.");
	}	

	public static void myMethod() {
		System.out.println("Calling produceError...");
		produceError();
		System.out.println("myMethod is done.");
	}

	public static void produceError() {
		System.out.println("Inside produceError...");
		String str = "abc";
		
		// The following will produce an error
		System.out.println(str.charAt(3));
	}
}
