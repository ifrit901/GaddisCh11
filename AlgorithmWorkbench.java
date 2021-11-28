package ch11java6thedition;
import java.io.*;

/**
 * This is Chapter 11 Algorithm Workbench.
 * 
 * @author craig
 */
public class AlgorithmWorkbench {
	public static void main(String[]args) throws Exception{
		/*
		1. Look at the following program and tell what it will output 
		    when run.
		*/
		int number;
		String str;

		try {
			str = "xyz";
			number = Integer.parseInt(str);
			System.out.println("A");
		}
		catch (NumberFormatException e) {
			System.out.println("B");
		}
		catch (IllegalArgumentException e) {
			System.out.println("C");
		}

		System.out.println("D");

		/*
		This code will output: 
				"B"
				"D"
		It will not print "A" since that code occurs after the 
		exception is thrown. The NumberFormatException 
		is the first catch clause that has a parameter that 
		fits the exception thrown, so it will handle the exception
		and print "B". The last catch clause will be skipped and 
		control of the program will pass to the last print line 
		statement.
		*/

		/*
		2. Look at the following program and tell what it will 
		    output when run. 
		*/
		int number2;
		String str2;

		try {
			str2 = "xyz";
			number2 = Integer.parseInt(str2);
			System.out.println("A");
		}
		catch (NumberFormatException e) {
			System.out.println("B");
		}
		catch (IllegalArgumentException e) {
			System.out.println("C");
		}
		finally {
			System.out.println("D");
		}
		
		System.out.println("E");

		/*
		This code will print:
				"B"
				"D"
				"E"
		*/

		/*
		3. Write a method that searches a numeric array for a 
		    specified value. The method should return the subscript
		    of the element containing the value if it is found in the 
		    array. If the value is not found, the method should throw
		    an exception of the Exception class with the error message:
		    "Element not found".
		*/
		// Array for #3
		int [] array = {1, 2, 3, 4, 5};
		System.out.println(returnSubscript(4, array));

		/*
		4. Write a statement that throws an IllegalArgumentException
		    with the error message, "Argument cannot be negative."
		*/
		// throw new IllegalArgumentException("Argument cannot be negative.");

		/*
		5. Write an exception class that can be thrown when a negative number
		    is passed to a method.
		*/

		/*
		6. Write a statement that throws an instance of the exception class 
		    that you wrote in #5.
		*/
		try {
			negativeNumberTest(-1);
		}
		catch (ExceptionClass e) {
			System.out.println(e.getMessage());	
		}	

		/*
		7. The method 'getValueFromFile' is public and returns an int. It 
		    accepts no arguments. The method is capable of throwing an
		    IOException and a FileNotFoundException. Write the header for 
		    this method. (See below)
		*/

		/*
		8. Write a try statement that calls the getValueFromFile method
		    from #7. Be sure to handle all the exceptions that the method
		    can throw.
		*/
		/*
		try {
			getValueFromFile();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException g) {
			System.out.println(g.getMessage());
		}
		*/	

		/*
		9. Write a statement that creates an object that can be used to
		    write binary data to the file Configuration.dat.
		*/
		FileOutputStream outputStream = new FileOutputStream("Configuration.dat");
		DataOutputStream dataStream = new DataOutputStream(outputStream);

		/*
		10. Write a statement that opens the file Customers.dat as a 
		      random access file for both reading and writing.
		*/
		RandomAccessFile randomFile = new RandomAccessFile("Configuration.dat", "rw");
		
		/*
		11. Assume that the reference variable 'r' refers to a serializable object.
		     Write code that serializes the object to the file "ObjectData.dat".
		*/
		FileOutputStream objectStream = new FileOutputStream("ObjectData.dat");
		ObjectOutputStream objectFile = new ObjectOutputStream(objectStream);
		
		/**
		 * Short answer
		 */

		/*
		1. What is meant when it is said that an exception is thrown?

		answer: When an exception is thrown, an an exception object 
		is created due to an unforseen error. It is either handled by 
		code and the program proceeds or it will halt the program.

		2. What does it mean to catch an exception?

		answer: An exception is caught when a try statement detects an 
		error and generates an exception object. The try statement attempts
		to pass the object to a catch clause that has a parameter variable
		with a type that is compatable with the exception object. If it finds 
		one, the code inside that clause is executed and the program 
		continues at the point after all the catch clauses. If not, a default
		exception error message is generated and the program is halted.

		3. What happens when an exeption is thrown, but the try statement
		    does not have a catch clause that is capable of catching it?

		answer: A default error message is generated along with the stack
		trace of methods involved with the error and the program is halted. 

		4. What is the purpose of a 'finally' clause? 

		answer: A finally clause is an optional portion of a try/catch situation that 
		executes after any catch clauses have or haven't executed. 

		5. Where does execution resume after an exeption has been thrown 
		    and caught?

		answer: It resumes at the point just after the list of catch clauses or at
		a 'finally' clause.

		6. When multiple exceptions are caught in the same try statement
		    and some of them are related through inheritance, does the order
		    in which they are listed matter?
		
		answer: Yes. The exeption will be handled by the first catch clause in
		the list with a parameter type that matches the type of object that is thrown.
		This includes polymorphic types that are related through inheritance. 
		So, the more specific exception cases should be handled before more
		general exception cases. Otherwise, an error will occur because the 
		compiler will think you are trying to handle the same exception more
		than once. 

		7. What type of objects can be thrown? 

		answer: All types of objects that inherit from the Throwable class.

		8. When are you required to have a throws clause in a method header?

		answer: If the code in a method can potentially throw a "checked exception"
		then it must have a throws clause of the type that can be thrown or a 
		more general class related to it through inheritance. 

		9. What is the difference between a checked exception and an unchecked 
		    exception? 

		answer: A checked exception is one that can be handled in the program 
		by catch clauses. They inherit from the Exception class.
		An unchecked exception is a serious error that should 
		not be handled by the program. They inherit from the Error class. 

		10. What is the difference between a throw statement and a throws clause?

		answer: A throw statement is code that creates an exception object and
		attempts to pass it to a catch clause. A throws clause occurs in a method 
		header and informs the compiler that the method may throw an exception
		of the type specified in the clause.

		11. What is the difference between a binary file and a text file?

		answer: A binary file stores data in raw binary format. They are generally
		more efficient to work with because the data undergoes less conversions
		when being processed. A text file stores data in text format. 

		12. What is the difference between a sequential access file and a random
		access file?

		answer: A sequential access file has to read through a file from the beginning
		to where the desired data is to be retrieved/processed from. A random 
		access file can jump to where the desired data is from anywhere in the file.

		13. What happens when you serialize an object? What happens when you 
		de-serialize an object?

		answer: When you serialize an object, it is converted into a series of bytes 
		that contain its data. When you de-serialize and object, the serialized object's 
		bytes are read and reconstructed into objects. 


		
		*/
	}
	
	// Method for #3.
	public static int returnSubscript(int i, int [] array) throws Exception {
		int number = i;
		boolean found = false;
		
		for(int p = 0; p < array.length; p++) {
			if (array[p] == number) {
				number = p;
				found = true;
			}
		}
		if(!found) {
			throw new Exception("Element not found"); 
		}
		else {
			return number;

		}

	}
	public static int negativeNumberTest(int i) throws ExceptionClass{
		if (i < 0) {
			throw new ExceptionClass(i);
		}
		return i;
	} 	

	// For #7
	public static int getValueFromFile() throws IOException, FileNotFoundException{
		int i = 3;
		return i;
	}

}
// For # 5
class ExceptionClass extends Exception{
	
	public ExceptionClass(int i) {
		super ("Error: negative numbers not allowed.");
	}
}