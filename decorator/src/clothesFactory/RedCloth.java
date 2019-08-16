package clothesFactory;

public class RedCloth extends ClothesDecorator{

	public RedCloth(Clothes decoratedClothes, int upcharge) {
		super(decoratedClothes, upcharge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void produce() {
		decoratedClothes.produce();
		System.out.println("Material color: Red");
		getRedCloth(decoratedClothes);
		System.out.println("There is an upcharge of " + getUpcharge()
		+ "$ for a piece with red cloth.");
		increasePrice(upcharge);
		
	}
	
	public void getRedCloth(Clothes dcoratedClothes) {
		System.out.println("Choosing a red cloth...");
	}

}
