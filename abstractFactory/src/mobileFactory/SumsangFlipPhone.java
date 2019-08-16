package mobileFactory;

public class SumsangFlipPhone implements FlipPhone {
	
	@Override
	public String getBrand() {
		return "Sumsang";
	}
	
	@Override
	public String getType() {
		return "Flip Phone";
	}
	
	@Override
	public boolean hasTouchscreen() {
		return true;
	}
}
