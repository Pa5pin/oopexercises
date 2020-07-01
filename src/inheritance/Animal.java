package inheritance;

public class Animal {
	
	public int numLegs;
	public boolean canFly;
	public String eats;
	
	public Animal() {}
	
	
	public Animal(int numLegs, boolean canFly, String eats) {
		super();
		this.numLegs = numLegs;
		this.canFly = canFly;
		this.eats = eats;
	}
	
	public void animalNoise() {
		System.out.println("Roooaaarrrrr");
	}
	
	public void runs() {
		System.out.println("I run very fast");
	}


	public int getNumLegs() {
		return numLegs;
	}


	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}


	public String getEats() {
		return eats;
	}


	public void setEats(String eats) {
		this.eats = eats;
	}
	

}
