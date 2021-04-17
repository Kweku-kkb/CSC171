/* Name: Kweku Ofori
 * NetID: kofori
 * Assignment Number: 3
 * Lab Section: MW 4:50pm
 * I did not collaborate with anyone on this assignment
*/
import java.io.IOException;

public class ScreenClear {
	public static void clear() {
		clrscr();
	}
	public static void clrscr() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
