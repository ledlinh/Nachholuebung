package transportation;

public class LandTransportation extends Transportation {

	public LandTransportation(TransportationImpl transportation) {
		super(transportation);
	}

	@Override
	public void driveAToB(int distance) {
		System.out.println("Transportation on land to B");
		transportation.driveForward(distance);
		System.out.println("Destination reached.");
	}

	@Override
	public void driveBackward() {
		System.out.println("Transportation on land.");
		transportation.driveBackward();
	}

	@Override
	public void park() {
		System.out.println("Transportation on land.");
		transportation.park();
	}

}
