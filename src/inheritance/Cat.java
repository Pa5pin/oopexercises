package inheritance;

public class Cat extends Animal {
	
	public Cat() {
		
	}
	
	public Cat(int numLegs, boolean canFly, String eats) {
		super(numLegs, canFly, eats);
		this.numClaws = 4;
	}

	public Cat(int numLegs, boolean canFly, String eats, int numClaws) {
		super(numLegs, canFly, eats);
		this.numClaws = numClaws;
		
	}
	


	private int numClaws;

	
	public void animalNoise() {
		System.out.println("meoowww");
	}
	
	public void runs() {
		System.out.println("I run quite fast");
	}

	public int getNumClaws() {
		return numClaws;
	}

	public void setNumClaws(int numClaws) {
		this.numClaws = numClaws;
	}

	@Override
	public String toString() {
		return "Cat [numClaws=" + numClaws + ", numLegs=" + numLegs + ", canFly=" + canFly + ", eats=" + eats
				+ ", getNumClaws()=" + getNumClaws() + ", getNumLegs()=" + getNumLegs() + ", isCanFly()=" + isCanFly()
				+ ", getEats()=" + getEats() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
