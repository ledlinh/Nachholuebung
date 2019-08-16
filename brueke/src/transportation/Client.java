package transportation;

public class Client {

	public static void main(String[] args) {
		Transportation ship = new WaterTransportation(new Ship());	
		Transportation car = new LandTransportation(new Car());
		Transportation motorcycle = new LandTransportation(new Motorcycle());
	
		ship.driveAToB(50);
		ship.driveBackward();
		ship.park();
		ship.getFuelUsed();
		System.out.println("\n");
		
		car.driveAToB(50);
		car.driveBackward();
		car.park();
		car.getFuelUsed();
		System.out.println("\n");
		
		motorcycle.driveAToB(50);
		motorcycle.driveBackward();
		motorcycle.park();
		motorcycle.getFuelUsed();
		System.out.println("\n");
				
	}

}
