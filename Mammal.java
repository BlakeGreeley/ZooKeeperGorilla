
public class Mammal {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level is: " + energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
