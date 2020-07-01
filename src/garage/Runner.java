package garage;

public class Runner {

	public static void main(String[] args) {
		
		GarageRunner garage = new GarageRunner();
		
		garage.addVehicle(new Car("ford", "focus", 4));
		garage.addVehicle(new Motorcycle("Suzuki", "1050XT", "Black"));
		garage.addVehicle(new Van("Mercedes", "Sprinter", true));

	}

}
