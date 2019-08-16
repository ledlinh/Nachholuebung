package transportation;

public class Motorcycle extends TransportationImpl {

	public Motorcycle() {
		this.maxSpeed = 150;
		this.fuelConsume = 3;
	}
	
	@Override
	public void driveForward(int km) {
		System.out.println("Turning on the motorcycle's engine...");
		System.out.println("Maximum speed of the motorcycle: "
							+ maxSpeed + "km/h");
		System.out.println("Riding the motocycle with maximum speed "
							+ km + "km forward...");			
		this.drivenKm += km;
	}

	@Override
	public void driveBackward() {
		System.out.println("Riding the motorcycle backward...");			
	}

	@Override
	public void park() {
		System.out.println("Parking the motorcycle...");			
	}
	
}
