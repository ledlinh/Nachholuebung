package clothesFactory;

public class Main {

	public static void main(String[] args) {
		Clothes skinnyJeans = new BodyconStyle(new Pants("Denim", 70), 30);
		Clothes oversizedTop = new OversizedStyle(new Top("cotton", 40), 20);
		Clothes redDress = new RedCloth(new Dresses("Synthetics", 50), 20);
		
		Clothes redBodyconDress = new BodyconStyle(redDress, 10);
		Clothes redOversizedTop = new RedCloth(oversizedTop, 30);
		
		System.out.println("Producing a pair of skinny jeans:");
		skinnyJeans.produce();
		skinnyJeans.sold();
		System.out.println("\n");
		
		System.out.println("Producing a red bodycon dress:");
		redBodyconDress.produce();
		redBodyconDress.sold();
		System.out.println("\n");
		
		System.out.println("Producing a red oversized top:");
		redOversizedTop.produce();
		redOversizedTop.sold();
		System.out.println("\n");	

	}

}
