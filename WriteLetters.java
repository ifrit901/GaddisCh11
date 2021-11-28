package ch11java6thedition;
import java.io.*;
/**
 * This is Code Listing 11-15 which uses a 
 * RandomAccessFile object to create a file
 * and fill it with the letters of the alphabet.
 * 
 * @author craig
 */
public class WriteLetters {
	public static void main(String[]args) throws IOException{
		RandomAccessFile randyFile = new RandomAccessFile("letters.dat", "rw");
		for(int i = 97; i < 123; i ++) {
			randyFile.writeChar(i);
		}
		randyFile.close();
	}	
}
