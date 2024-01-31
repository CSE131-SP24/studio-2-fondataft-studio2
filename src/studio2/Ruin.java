package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your starting amount:");
		int startAmount = in.nextInt(); 

		System.out.println("Please enter the win probability:");
		double winChance = in.nextDouble(); 

		System.out.println("Please enter the win limit:");
		int winLimit = in.nextInt(); 
		
		int play = 0;
		
		while (startAmount < winLimit && startAmount > 0){
		
		double winProb = (double) Math.random();
		if (winProb > winChance) {
			startAmount = startAmount + 1;
		}
		
		else {
			startAmount = startAmount - 1;
		}
		play = play +1;
		}
		
		int totalSimulations = play;
		System.out.println("Total simulations: " + totalSimulations);
		
		if (startAmount == 0) {
			System.out.println("The day ended in ruin.");
		}
		else {
			System.out.println("The day ended in success.");
		}

		
		
		
			
		
		 
		
		
	}

}
