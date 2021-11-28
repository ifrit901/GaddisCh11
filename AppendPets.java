package ch11java6thedition;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * This program lets you add more names 
 * to "Pets.dat".
 * 
 * @author craig
 */
public class AppendPets {
	public static void main(String[]args) throws IOException{
		String pet;		// To hold pet names
		boolean isEmpty = false;

		// Open "Pets.dat" and add names to it
		DataOutputStream outputFile = 
			new DataOutputStream(new FileOutputStream("Pets.dat", true));

		while(!isEmpty) {
			pet = JOptionPane.showInputDialog("Enter a new pet name.");
			if(pet.equals("")) {
				isEmpty = true;
			}
			outputFile.writeUTF(pet);
		}
		JOptionPane.showMessageDialog(null, "Thanks for adding some pet names :)");
	}	
}
