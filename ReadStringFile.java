package ch11java6thedition;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author craig
 */
public class ReadStringFile {
	public static void main(String[]args) throws IOException {
		String petName;
		boolean endOfFile = false;
		DataInputStream inputStream = new DataInputStream(new FileInputStream("Pets.dat"));	
		while(!endOfFile) {
			try {
				petName = inputStream.readUTF();
				System.out.println(petName);
			}
			catch (EOFException e) {
				endOfFile = true;
			}
		}		
		
		JOptionPane.showMessageDialog(null, "Is that really all the pets you know??");
	}	
}
