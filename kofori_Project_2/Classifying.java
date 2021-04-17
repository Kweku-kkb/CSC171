import java.util.Arrays; 
import java.util.Scanner;

public class Classifying {
	public static void classify(){
		//initializing an array
		Scanner user  = new Scanner(System.in);
		System.out.println("Enter any five numbers from 1 to 6 separated by a space");
		String input = user.nextLine();
		String[] numberString = input.split(" ");
		int bestScore  = 0;
		int score = 0;
		String bestScoreStr = "";
		int size = 5;
		int[] numbers = new int[size];
		for(int i = 0; i < size; i++) {
			numbers[i] = Integer.parseInt(numberString[i]);
		}
		Arrays.parallelSort(numbers);
		
		// need to find a way to print array without commas and brackets
		String formattedNumbers = "";
		for(int i = 0; i < numbers.length; i++) {
			formattedNumbers += Integer.toString(numbers[i]) + " ";
		}
		ScreenClear.clear();

		//rule1..sum of n's
		int index = 0;
		for(int i = 0; i < numbers.length; i++) {
			int sum = 0; 
			for(int j = i; j < numbers.length; j++)
				if(numbers[i] == numbers[j]) 
					sum += numbers[j];			
			if(sum > score) {
				score = sum;
				index = numbers[i];
			}
				
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is sum" + index + "'s with score " + bestScore;
		}
		
		//rule2...3ofKind
		for(int j = 0; j < numbers.length-2; j++ ) {
			if(numbers[j] == numbers[j+1] && numbers[j] == numbers[j+2]) {
				score = Arrays.stream(numbers).sum();
			}
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is 3ofKind with score "+ bestScore;
		}
		
		//rule3...4ofKind
		for(int j = 0; j < 2; j++ ) {
			if((numbers[j] == numbers[j+1]) && (numbers[j] == numbers[j+2]) && (numbers[j] == numbers[j+3])) {
				score = Arrays.stream(numbers).sum() + 10;
			}
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is 4ofKind with score "+ bestScore;
		}
	
		//rule4...5ofKind
		if(numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[0] == numbers[3] && numbers[0]== numbers[4] ) {
			score = Arrays.stream(numbers).sum() + 50;
		}
		if(score > bestScore) {
			bestScore = score;
		bestScoreStr = formattedNumbers + "best is 5ofKind with score "+ bestScore;
		}

		//rule5... small straight
		if(((numbers[0] == numbers[1]) && numbers[1] - numbers[2] == -1 && numbers[2] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)
				||((numbers[1] == numbers[2]) && numbers[0] - numbers[2] == -1 && numbers[2] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)
				||((numbers[2] == numbers[3]) && numbers[0] - numbers[1] == -1 && numbers[1] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)) {
			score = 30;
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is smallStraight with score " + bestScore;
		}
		
		//rule6... large straight
		boolean flag = true;
		for(int j = 1; j < numbers.length; j++) {
			if(numbers[j]-numbers[j-1] != 1) {
				flag = false;
			}
		}
		if(flag == true) {
		score = 50;
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is largeStraight with score " + bestScore;
		}
	
		//rule7...full house
		if(((numbers[0] == numbers[1] && numbers[0] == numbers[2]) && (numbers[3] == numbers[4])) ||
				((numbers[0] == numbers[1]) && (numbers[2] == numbers[3] && numbers[2] == numbers[4]))) {
			score = 25;
		}
		if(score > bestScore) {
			bestScore = score;
			bestScoreStr = formattedNumbers + "best is fullHouse with score " + bestScore;
		}
		System.out.println(bestScoreStr);
	}
}
