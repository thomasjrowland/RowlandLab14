package Lab14_Rowland;

import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Player player1 = createHumanPlayer();
		Player player2 = selectOpponent();
		
		int p1Score = 0;
		int p2Score = 0;
		int ties = 0;
		
		
		do {
			Roshambo hand1 = player1.generateRoshambo();
			Roshambo hand2 = player2.generateRoshambo();
		
			System.out.println();
			System.out.println(player1.getName() + " played " + hand1);
			System.out.println(player2.getName() + " played " + hand2);
			System.out.println();
		
			if (hand1 == Roshambo.PAPER &&  hand2 == Roshambo.PAPER) {
				System.out.println("TIE!");	
				ties++;
			} else if (hand1 == Roshambo.ROCK &&  hand2 == Roshambo.ROCK) {
				System.out.println("TIE!");
				ties++;
			} else if (hand1 == Roshambo.SCISSORS &&  hand2 == Roshambo.SCISSORS) {
				System.out.println("TIE!");
				ties++;
			} else if (hand1 == Roshambo.ROCK &&  hand2 == Roshambo.PAPER) {
				p2Score++;
				System.out.println(player2.getName() + " WINS!");
			} else if (hand1 == Roshambo.PAPER &&  hand2 == Roshambo.SCISSORS) {
				p2Score++;
				System.out.println(player2.getName() + " WINS!");
			} else if (hand1 == Roshambo.SCISSORS &&  hand2 == Roshambo.ROCK) {
				p2Score++;
				System.out.println(player2.getName() + " WINS!");
			} else if (hand1 == Roshambo.ROCK &&  hand2 == Roshambo.SCISSORS) {
				p1Score++;
				System.out.println(player1.getName() + " WINS!");
			} else if (hand1 == Roshambo.PAPER &&  hand2 == Roshambo.ROCK) {
				p1Score++;
				System.out.println(player1.getName() + " WINS!");
			} else if (hand1 == Roshambo.SCISSORS &&  hand2 == Roshambo.PAPER) {
				p1Score++;
				System.out.println(player1.getName() + " WINS!");
			} 
		
		} while (Validator.getYesNo(scnr, "\nAgain? " ));
		
		System.out.println();
		System.out.println("FINAL SCORES:");
		System.out.println(player1.getName() + ":\t" + p1Score);
		System.out.println(player2.getName() + ":\t" + p2Score);
		System.out.println("Ties:\t" + ties);		
	
	}
	
	private static Player selectOpponent() {
		System.out.println("Would you like to face Rocky or Randy?");
		String input = scnr.nextLine().toLowerCase();
		if (input.startsWith("ro")) {
			return new RockPlayer("Rocky");
		} else if (input.startsWith("ra")) {
			return new RandomPlayer("Randy");
		} else {
			System.out.println("That's not a valid opponent!");
			selectOpponent();
		}
		System.out.println("There's no opponent!");
		return null;
	}
	
	private static HumanPlayer createHumanPlayer() {
		// Pick name
		System.out.print("What's your name? ");
		String name = scnr.nextLine();
		// Create player
		return new HumanPlayer(name, scnr);
	}
}