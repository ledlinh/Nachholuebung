package transportation;

public class WaterTransportation extends Transportation {

	public WaterTransportation(TransportationImpl transportation) {
		super(transportation);
	}

	@Override
	public void driveAToB(int distance) {
		System.out.println("Transportation on water to B");
		transportation.driveForward(distance);
		System.out.println("Destination reached.");
	}

	@Override
	public void driveBackward() {
		System.out.println("Transportation on water");
		transportation.driveBackward();	
	}

	@Override
	public void park() {
		System.out.println("Transportation on water");
		transportation.park();
		
	}

}
