package transportation;

public abstract class Transportation {

	protected TransportationImpl transportation;
	
	public Transportation(TransportationImpl transportation) {
		this.transportation = transportation;
	}
	
	public abstract void driveAToB(int distance);
	
	public abstract void driveBackward();
	
	public abstract void park();
	
	public void getFuelUsed() {
		System.out.println("Used " + transportation.fuelUsed() + "l gas.");
	}
}
