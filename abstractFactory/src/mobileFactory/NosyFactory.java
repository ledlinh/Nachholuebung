package mobileFactory;

public class NosyFactory implements AbstractPhoneFactory {
	
	@Override
	public Smartphone createSmartphone() {
		return new NosySmartphone();
	}

	@Override
	public FlipPhone createFlipPhone() {
		return new NosyFlipPhone();
	}
	
}
