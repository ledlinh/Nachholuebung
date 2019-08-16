package mobileFactory;

public class NosyFlipPhone implements FlipPhone {

	@Override
	public String getBrand() {
		return "Nosy";
	}
	
	@Override
	public String getType() {
		return "Flip phone";
	}

	@Override
	public boolean hasTouchscreen() {
		return false;
	}
}
