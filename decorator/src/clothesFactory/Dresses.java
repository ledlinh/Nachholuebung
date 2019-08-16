package clothesFactory;

public class Dresses extends ClothesPieces {

	public Dresses(String material, int price) {
		super(material, price);
	}

	@Override
	public void produce() {
		System.out.println("Type of clothes: Dress.");
		System.out.println("Material: " + getMaterial());
		System.out.println("Original price: " + getPrice() + "$");
	}

	@Override
	public void sold() {
		System.out.println("The dress is sold for " + getPrice() + "$.");
	}
		
}