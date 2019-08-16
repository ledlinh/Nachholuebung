package mobileFactory;

public class SumsangFactory implements AbstractPhoneFactory {
	
	@Override
	public Smartphone createSmartphone() {
		return new SumsangSmartphone();
	}
	
	public FlipPhone createFlipPhone() {
		return new SumsangFlipPhone();
	}
}
