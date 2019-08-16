package clothesFactory;

public abstract class ClothesPieces implements Clothes {

	protected String material;
	protected int price;
	
	public ClothesPieces(String material, int price) {
		this.material = material;
		this.price = price;
	}
	
	public abstract void produce();
	
	public abstract void sold();
	
	@Override
	public void increasePrice(int upcharge) {
		price += upcharge;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getPrice() {
		return price;
	}
}
