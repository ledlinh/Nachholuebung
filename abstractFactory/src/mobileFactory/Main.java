package mobileFactory;

public class Main {
	public static void main(String [] args) {
		AbstractPhoneFactory nosyFactory = new NosyFactory();
		AbstractPhoneFactory sumsangFactory = new SumsangFactory();
		
		createPhone(nosyFactory);
		createPhone(sumsangFactory);
	}
	
	public static void createPhone(AbstractPhoneFactory factory) {
		Smartphone smartphone = factory.createSmartphone();
		FlipPhone flipPhone = factory.createFlipPhone();
		
		System.out.println(smartphone.getBrand() + " " +
		smartphone.getType() + " run with " + smartphone.getOS());
		System.out.println(flipPhone.getBrand() + " " +
		flipPhone.getType() + " has Touchscreen: " + flipPhone.hasTouchscreen());
		
	}
}
