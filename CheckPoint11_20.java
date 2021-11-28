package ch11java6thedition;

/**
 * This is Check Point 11.20 - 11.25.
 * 
 * @author craig
 */
public class CheckPoint11_20 {
	public static void main(String[]args) {
		/**
		 * 11.20 What is the difference between a text file and a 
		 * binary file?
		 * 
		 * answer: A text file is a file in which the data has been formatted
		 * as text. A binary file stores data in binary format. Binary file format is 
		 * more efficient for the computer since there are less conversions to make
		 * for the data in the file to be used by the processor.
		 * 
		 * 11.21 What classes do you use to write output to a binary file? What 
		 * classes do you use to read from a binary file?
		 * 
		 * answer: To write to a binary file you use the FileOutputStream and
		 * DataOutputStream classes. To read from a binary file, you use 
		 * the FileInputStream and DataInputStream classes.
		 * 
		 * 11.22 What is the difference between sequential and random access?
		 * 
		 * answer: Sequential access is retrieving data one at a time from the 
		 * beginning to the end of a file. The retrieval can stop, but it must start 
		 * again from the point it left off, where the read position is. Random access
		 * can retrieve data from any point in the file by referencing the starting 
		 * point of the data.
		 * 
		 * 11.23 What class do you use to work with random access files?
		 * 
		 * answer: The RandomAccessFile class.
		 * 
		 * 11.24 What are the two modes that a random access file can be opened in?
		 * Explain the difference between them.
		 * 
		 * answer: A random access file can be opened in read mode or read/write mode.
		 * 
		 * 11.25 What must you do to a class in order to serialize objects
		 * of that class?
		 * 
		 * answer: You must make the class implement the Serializable interface.
		 * 
		 */
	}	
}
