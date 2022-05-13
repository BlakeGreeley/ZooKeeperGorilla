
public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("throwing now");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("That filled me up!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("That tree was high, but fun to climb.");
		energyLevel -= 10;
	}
}
