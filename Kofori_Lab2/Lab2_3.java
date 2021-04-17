//Name: Kweku Ofori
//NetID: kofori
//Assignment Number: 2
//Lab Section: MW 4:50pm
// I did not collaborate with anyone on this assignment

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
	System.out.println("Enter 1 if you want to discuss school or enter 2 if you want to discuss food:");
	Scanner s = new Scanner(System.in);
	int val = s.nextInt();
	if(val == 1) {
		System.out.println("Are you a CS major? Enter 1 for Yes or 2 for No");
		int num = s.nextInt();
		if (num == 1) {
			System.out.println("Awesome");
		}
		else if (num == 2 ) {
			System.out.println("Thanks for sharing!");
		}
	}
	else if(val == 2) {
		System.out.println("How many times did you eat pizza last week");
		int num = s.nextInt();
		if (num >= 5) {
			System.out.println("You need to eat better");
		}
		else if (num < 5) {
			System.out.println("OK.");
		}
		
	}

	}

}
