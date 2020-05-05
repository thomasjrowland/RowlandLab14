package Lab14_Rowland;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scnr;

	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		System.out.println();
		System.out.print("Rock, paper, or scissors? (R/P/S): ");
		String input = scnr.nextLine().toLowerCase();
		if (input.startsWith("r")) {
			return Roshambo.ROCK;
		} else if (input.startsWith("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}

}