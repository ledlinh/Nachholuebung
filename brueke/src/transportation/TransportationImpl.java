package transportation;

public abstract class TransportationImpl {

	public int maxSpeed;
	public int fuelConsume;
	public int drivenKm = 0;
	
	public abstract void driveForward(int km);
	public abstract void driveBackward();
	public abstract void park();
	
	public double fuelUsed() {
		if (drivenKm > 0) return ((double)drivenKm*fuelConsume)/100;
		return 0;
	}
	
}
