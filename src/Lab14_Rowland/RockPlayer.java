package Lab14_Rowland;

public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
