package transportation;

public class Car extends TransportationImpl {

	public Car() {
		this.maxSpeed = 200;
		this.fuelConsume = 8;
	}
	
	@Override
	public void driveForward(int km) {
		System.out.println("Turning on the car's engine...");
		System.out.println("Maximum speed of the car: "
							+ maxSpeed + "km/h");
		System.out.println("Driving the car with maximum speed "
							+ km + "km forward...");
		this.drivenKm += km;
	}

	@Override
	public void driveBackward() {
		System.out.println("Driving the car backward...");			
	}

	@Override
	public void park() {
		System.out.println("Parking the car...");			
	}

}
