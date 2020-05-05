package Lab14_Rowland;

import java.util.Random;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		
		int random = randInt(3);
		
		switch (random) {
			case 0:
				return Roshambo.PAPER;
			case 1:
				return Roshambo.ROCK;
			case 2:
				return Roshambo.SCISSORS;
		}
		return null;
		
	}
	
	
	public static int randInt(int max) {

	    int rand = new Random().nextInt(max);
	    return rand;
	    
	}
	
	
	
	

}
