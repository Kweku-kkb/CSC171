//Name: Kweku Ofori
//NetID: kofori
//Assignment Number: 2
//Lab Section: MW 4:50pm
// I did not collaborate with anyone on this assignment

import java.util.Scanner;
	
public class Lab2_2 {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner s =  new Scanner(System.in);
		int age = s.nextInt();
		if(age < 13) {
			System.out.println("You're just a kid!");
		}
		else if(age < 20) {
			System.out.println("You're a teenager!");
		}
		else if(age <= 30) {
			System.out.println("You're getting there...");
		}
		else if(age >= 30) {
			System.out.println("You must be tired.");
		}
	}
		
}
