/* Name: Kweku Ofori
 * NetID: kofori
 * Assignment Number: 3
 * Lab Section: MW 4:50pm
 * I did not collaborate with anyone on this assignment
*/
import java.util.Scanner;

public class Throwback {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mode you want by typing \nclassify \nor \nsimulate");
		String input = scan.next();
		String input1 = "classify";
		if(input1.equalsIgnoreCase(input)) {
			Classifying.classify();
		}
		
		String input2 = "simulate";
		if(input2.equalsIgnoreCase(input)) {
			Simulation.simulate();
		}
	}
}
