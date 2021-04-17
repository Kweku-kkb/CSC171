//Name: Kweku Ofori
//NetID: kofori
//Assignment Number: 1
//Lab Section: MW 4:50pm
// I did not collaborate with anyone on this assignment

import java.util.Scanner;
	
public class Lab2_1 {
	public static void main(String[] args) {
		int secret =  1712020;
		System.out.println("Enter a number:");
		Scanner p = new Scanner(System.in);
		int num = p.nextInt();
		if (num == secret)
			System.out.println("You're a winner!");
		else if (num < secret)
			System.out.println("Try something bigger");				
		else if (num > secret)
			System.out.println("Try something smaller");
		}	
}