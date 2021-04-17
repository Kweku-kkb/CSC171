
//Name: Kweku Ofori
//NetID: kofori
//Assignment Number: 1
//Lab Section: MW 4:50pm
// I did not collaborate with anyone on this assignment

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Hello TA! My name is Kweku Ofori.");
		System.out.println("Welcome to Mags Delicious Pizza Calories Calculator");
		Scanner s = new Scanner(System.in);
		System.out.println("How many calories are in the pizza?");
		int cal = s.nextInt();
		
		System.out.println("How many people are sharing this pizza?");
		int num = s.nextInt();
		
		System.out.println("If " + num + " people share a pizza with "
		+ cal + " calories then everybody gets " + (cal/num) + " calories!");
		
	}
		
}
