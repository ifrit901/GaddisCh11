package ch11java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author craig
 */
public class Reader {
	public static void main(String[]args) throws FileNotFoundException{
		String fileName = "/home/craig/NetBeansProjects/Ch11java6thEdition/src/ch11java6thedition/Ch11java6thEdition.java";
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		while(inputFile.hasNext()) {
			System.out.println(inputFile.nextLine());
		}
		inputFile.close();
	}	
}
