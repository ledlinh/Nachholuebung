package clothesFactory;

public class Top extends ClothesPieces {

	
	public Top(String material, int price) {
		super(material, price);
	}

	@Override
	public void produce() {
		System.out.println("Type of clothes: Top.");
		System.out.println("Material: " + getMaterial());
		System.out.println("Original price: " + getPrice() + "$");
	}

	@Override
	public void sold() {
		System.out.println("The top is sold for " + getPrice() + "$.");
		
	}
}
