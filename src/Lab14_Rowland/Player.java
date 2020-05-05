package Lab14_Rowland;

public abstract class Player {
	
	private String name;
	
	public abstract Roshambo generateRoshambo();

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
