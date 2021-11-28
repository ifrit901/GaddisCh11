package ch11java6thedition;
import java.io.*;
import java.util.ArrayList;


/**
 * 7. File Encryption Filter
 * File encryption is the science of writing the contents of a file 
 * in a secret code. Your encryption program should work like
 * a filter, reading the contents of a file, modifying the data into
 * a code, and then writing the contents of the coded contents
 * into a second file. The second file will be a version of the first
 * file, but written in a secret code. 
 * 
 * Although there are complex encryption techniques, you should 
 * come up with a simple one of your own. For example, you could
 * read the first file one character at a time, and add 10 to the 
 * character code of each character before it is written to the 
 * second file.
 * 
 * @author craig
 * 7/28/21
 * 5:19pm
 * at home with Maria
 */
import java.io.*;
public class FileEncryptionFilter {

	public static void writeFile(String fileName, String encryptedFile) throws IOException{

		DataInputStream ds = 
			new DataInputStream(new FileInputStream(fileName));

		DataOutputStream os = 
			new DataOutputStream(new FileOutputStream(encryptedFile));

		boolean endOfFile = false;
		int num;

		try {
			
			while(!endOfFile) {
				num = ds.readInt();
				num += 10;
				os.writeInt(num);
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(EOFException e) {
			endOfFile = true;
		}
		
		ds.close();	
		os.close();
	}

	public static void readFile(String fileName, ArrayList <Integer> array) throws IOException{
		boolean endOfFile = false;
		int i;

		DataInputStream dStream = 
			new DataInputStream(new FileInputStream(fileName));

		try {
			while(!endOfFile) {
				i = dStream.readInt();
				array.add(i);
			}
		}	
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (EOFException e) {
			endOfFile = true;
		}

		dStream.close();
	}	
}
