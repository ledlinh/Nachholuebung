package clothesFactory;

public abstract class ClothesDecorator implements Clothes {
	
	protected Clothes decoratedClothes;
	protected int upcharge;

	public ClothesDecorator(Clothes decoratedClothes, int upcharge) {
		this.decoratedClothes = decoratedClothes;
		this.upcharge = upcharge;
	}
	
	@Override
	public void produce() {
		decoratedClothes.produce();
	};
	
	@Override
	public void sold() {
		decoratedClothes.sold();
	}
	
	@Override
	public void increasePrice(int upcharge) {
		decoratedClothes.increasePrice(upcharge);
	}
	
	public int getUpcharge() {
		return upcharge;
	}	
	
}
