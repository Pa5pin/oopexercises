package garage;

public class Van extends Vehicle{
	
	public boolean isWhite;
	
	public Van(String make, String model, boolean isWhite) {
		super(make, model);
		this.isWhite = isWhite;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Van [isWhite = " + isWhite + ", make = " + make + ", model = " + model + "]";
	}

}
