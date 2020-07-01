package garage;

public class Motorcycle extends Vehicle{
	
	public String colour;
	
	public Motorcycle(String make, String model,String colour) {
		super(make, model);
		this.colour = colour;
		
		
	}

	@Override
	public String toString() {
		return "Motorcycle [colour = " + colour + ", make = " + make + ", model = " + model + "]";
	}

	
	

}
