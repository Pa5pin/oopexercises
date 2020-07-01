package garage;

public class Car extends Vehicle{
	
	

	public int numWheels;

	public Car(String make, String model, int numWheels) {
		super(make, model);
		this.numWheels = numWheels;
		
		
	}

	@Override
	public String toString() {
		return "Car [numWheels = " + numWheels + ", make = " + make + ", model = " + model + "]";
	}

	
	
	

	
	

}
