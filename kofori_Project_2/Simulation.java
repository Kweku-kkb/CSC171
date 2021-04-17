/* Name: Kweku Ofori
 * NetID: kofori
 * Assignment Number: 3
 * Lab Section: MW 4:50pm
 * I did not collaborate with anyone on this assignment
*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Simulation {
	public static void simulate() {
		float sum1Score = 0; float sum2Score = 0; float sum3Score = 0; float sum4Score = 0; float sum5Score = 0; float sum6Score = 0;
		float fullHouseScore = 0; float smallStraightScore = 0; float largeStraightScore = 0; float threeOfKindScore = 0; float fourOfKindScore = 0; float fiveOfKindScore = 0;
		float sum1Frequency = 0; float sum2Frequency = 0; float sum3Frequency = 0; float sum4Frequency = 0; float sum5Frequency = 0; float sum6Frequency = 0;
		float threeOfKindFrequency = 0; float fourOfKindFrequency = 0; float fiveOfKindFrequency = 0; float largeStraightFrequency = 0; float smallStraightFrequency = 0; float fullHouseFrequency = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of times to run the simulation");
		int rolls = scan.nextInt();
		
		for(int k = 0; k < rolls; k++) {
			//Generating random dice 
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			int dice3 = rand.nextInt(6) + 1;
			int dice4 = rand.nextInt(6) + 1;
			int dice5 = rand.nextInt(6) + 1;
			
			//real random array
			int[] numbers = {dice1, dice2, dice3, dice4, dice5};
		    
			// sorting array is ascending order
			Arrays.parallelSort(numbers);
			
			// sum of n's
			boolean flag1 = true; boolean flag2 = true; boolean flag3 = true;
			boolean flag4 = true; boolean flag5 = true; boolean flag6 = true;
			for(int i = 1; i <= 6; i++) {
				for(int j = 0; j < numbers.length; j++)
					if(i == numbers[j]) {
						if(numbers[j] == 1) {
							sum1Score += 1;
							if (flag1 == true) {
								sum1Frequency += 1;
								flag1 = false;
							}
						}
						if(numbers[j] == 2) {
							sum2Score += 2;
							if (flag2 == true) {
								sum2Frequency += 1;
								flag2 = false;
							}
						}
						if(numbers[j] == 3) {
							sum3Score += 3;
							if (flag3 == true) {
								sum3Frequency += 1;
								flag3 = false;
							}
						}
						if(numbers[j] == 4) {
							sum4Score += 4;
							if (flag4 == true) {
								sum4Frequency += 1;
								flag4 = false;
							}
						}
						if(numbers[j] == 5) {
							sum5Score += 5;
							if (flag5 == true) {
								sum5Frequency += 1;
								flag5 = false;
							}
						}
						if(numbers[j] == 6) {
							sum6Score += 6;
							if (flag6 == true) {
								sum6Frequency += 1;
								flag6 = false;
							}
						}
					}
			}

			//rule2...3ofKind
			boolean flag3ofKind = true;
			//boolean flag3ofKindFrequency = true;
			for(int j = 0; j < numbers.length-2; j++ ) {
				if(numbers[j] == numbers[j+1] && numbers[j] == numbers[j+2]) {
					threeOfKindScore += Arrays.stream(numbers).sum();
					if(flag3ofKind == true) {
						threeOfKindFrequency += 1;
						flag3ofKind = false;
					}
				}
			}
			
			//rule2...4ofKind
			boolean flag4ofKind = true;
			for(int j = 0; j < 2; j++ ) {
				if((numbers[j] == numbers[j+1]) && (numbers[j] == numbers[j+2]) && (numbers[j] == numbers[j+3])) {
					fourOfKindScore += Arrays.stream(numbers).sum() + 10;
					if(flag4ofKind == true) {
						fourOfKindFrequency += 1;
						flag4ofKind = false;
					}
				}
			}
			
			//rule4...5ofKind
			if(numbers[0] == numbers[1] && numbers[0] == numbers[2] && numbers[0] == numbers[3] && numbers[0]== numbers[4] ) {
				fiveOfKindScore += Arrays.stream(numbers).sum() + 50;
				fiveOfKindFrequency += 1;
			}
			
			//rule5... small straight
			if(((numbers[0] == numbers[1]) && numbers[1] - numbers[2] == -1 && numbers[2] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)
					||((numbers[1] == numbers[2]) && numbers[0] - numbers[2] == -1 && numbers[2] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)
					||((numbers[2] == numbers[3]) && numbers[0] - numbers[1] == -1 && numbers[1] - numbers[3] == -1 && numbers[3] - numbers[4] == -1)) {
				smallStraightScore += 30;
				smallStraightFrequency += 1;
			}
			
			//rule6... large straight
			boolean flaglargeStraight = true;
			for(int j = 1; j < numbers.length; j++) {
				if(numbers[j]-numbers[j-1] != 1) {
					flaglargeStraight = false;
				}
			}
			if(flaglargeStraight == true) {
				largeStraightScore += 50;
				largeStraightFrequency += 1;
			}

			//rule7...full house
			if(((numbers[0] == numbers[1] && numbers[0] == numbers[2]) && (numbers[3] == numbers[4])) ||
					((numbers[0] == numbers[1]) && (numbers[2] == numbers[3] && numbers[2] == numbers[4]))) {
				fullHouseScore += 25;
				fullHouseFrequency += 1;
			}
		}
		
		// calculating averages
		float sum1Avg = sum1Score/rolls;
		float sum2Avg = sum2Score/rolls;
		float sum3Avg = sum3Score/rolls;
		float sum4Avg = sum4Score/rolls;
		float sum5Avg = sum5Score/rolls;
		float sum6Avg = sum6Score/rolls;
		float threeOfKindAvg = threeOfKindScore/rolls;
		float fourOfKindAvg = fourOfKindScore/rolls;
		float fiveOfKindAvg = fiveOfKindScore/rolls;
		float smallStraightAvg = smallStraightScore/rolls;
		float largeStraightAvg = largeStraightScore/rolls;
		float fullHouseAvg = fullHouseScore/rolls;
		
		//frequencies
		float totalFrequency = sum1Frequency + sum2Frequency + sum3Frequency + sum4Frequency + sum5Frequency + sum6Frequency + 
				threeOfKindFrequency + fourOfKindFrequency + fiveOfKindFrequency + smallStraightFrequency + largeStraightFrequency + fullHouseFrequency;
		float totalSum1frequency = (sum1Frequency/totalFrequency) * 100;
		float totalSum2frequency = (sum2Frequency/totalFrequency) * 100;
		float totalSum3frequency = (sum3Frequency/totalFrequency) * 100;
		float totalSum4frequency = (sum4Frequency/totalFrequency) * 100;
		float totalSum5frequency = (sum5Frequency/totalFrequency) * 100;
		float totalSum6frequency = (sum6Frequency/totalFrequency) * 100;
		float totalthreeOfKindFrequency = (threeOfKindFrequency/totalFrequency) * 100;
		float totalfourOfKindFrequency = (fourOfKindFrequency/totalFrequency) * 100;
		float totalfiveOfKindFrequency = (fiveOfKindFrequency/totalFrequency) * 100;
		float totalsmallStraightFrequency = (smallStraightFrequency/totalFrequency) * 100;
		float totallargeStraightFrequency = (largeStraightFrequency/totalFrequency) * 100;
		float totalfullHouseFrequency = (fullHouseFrequency/totalFrequency) * 100;
		
		ScreenClear.clear();
		//printing
		String s = "%";
		System.out.printf("Outcome         Frequency     Avg Score");
		System.out.printf("\n-------------   ---------     ---------");
		System.out.printf("\nsum1's          %.2f%s         %.2f",totalSum1frequency,s,sum1Avg);
		System.out.printf("\nsum2's          %.2f%s         %.2f",totalSum2frequency,s,sum2Avg);
		System.out.printf("\nsum3's          %.2f%s         %.2f",totalSum3frequency,s,sum3Avg);
		System.out.printf("\nsum4's          %.2f%s         %.2f",totalSum4frequency,s,sum4Avg);
		System.out.printf("\nsum5's          %.2f%s         %.2f",totalSum5frequency,s,sum5Avg);
		System.out.printf("\nsum6's          %.2f%s         %.2f",totalSum6frequency,s,sum6Avg);
		System.out.printf("\n3ofKind         %.2f%s         %.2f",totalthreeOfKindFrequency,s,threeOfKindAvg);
		System.out.printf("\n4ofKind         %.2f%s         %.2f",totalfourOfKindFrequency,s,fourOfKindAvg);
		System.out.printf("\n5ofKind         %.2f%s         %.2f",totalfiveOfKindFrequency,s,fiveOfKindAvg);
		System.out.printf("\nsmallStraight   %.2f%s         %.2f",totalsmallStraightFrequency,s,smallStraightAvg);
		System.out.printf("\nlargeStraight   %.2f%s         %.2f",totallargeStraightFrequency,s,largeStraightAvg);
		System.out.printf("\nfullHouse       %.2f%s         %.2f",totalfullHouseFrequency,s,fullHouseAvg);
	}
}
