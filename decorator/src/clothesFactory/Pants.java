package clothesFactory;

public class Pants extends ClothesPieces {

	public Pants(String material, int price) {
		super(material, price);
	}

	@Override
	public void produce() {
		System.out.println("Type of clothes: Pants.");
		System.out.println("Material: " + getMaterial());
		System.out.println("Original price: " + getPrice() + "$");
		
	}

	@Override
	public void sold() {
		System.out.println("The pants is sold for " + getPrice() + "$.");
		
	}
	
}
