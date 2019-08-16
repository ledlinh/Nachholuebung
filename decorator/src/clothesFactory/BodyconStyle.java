package clothesFactory;

public class BodyconStyle extends ClothesDecorator {

	public BodyconStyle(Clothes decoratedClothes, int upcharge) {
		super(decoratedClothes, upcharge);
	}
	
	@Override
	public void produce() {
		decoratedClothes.produce();
		fittedCut(decoratedClothes);
		System.out.println("There is an upcharge of " + getUpcharge()
		+ "$ for a bodycon piece.");
		increasePrice(upcharge);
	}

	private void fittedCut(Clothes decoratedClothes) {
		System.out.println("Cutting the clothes fitted to the body measurements...");
	}

}
