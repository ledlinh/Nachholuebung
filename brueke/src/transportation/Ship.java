package transportation;

public class Ship extends TransportationImpl {

	public Ship() {
		this.maxSpeed = 30;
		this.fuelConsume = 15;
	}
	
	@Override
	public void driveForward(int km) {
		System.out.println("Turning on the ship's engine...");
		System.out.println("Maximum speed of the ship: "
							+ maxSpeed + "km/h");
		System.out.println("Driving the ship with maximum speed " + 
							+ km + "km forward...");
		this.drivenKm += km;
	}

	@Override
	public void driveBackward() {
		System.out.println("Driving the ship backward...");
		
	}

	@Override
	public void park() {
		System.out.println("Docking the ship...");
		
	}


}
