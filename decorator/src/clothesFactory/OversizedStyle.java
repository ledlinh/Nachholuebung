package clothesFactory;

public class OversizedStyle extends ClothesDecorator {

	public OversizedStyle(Clothes decoratedClothes, int upcharge) {
		super(decoratedClothes, upcharge);
	}

	@Override
	public void produce() {
		decoratedClothes.produce();
		looseCut(decoratedClothes);
		System.out.println("There is an upcharge of " + getUpcharge()
		+ "$ for an oversized piece.");
		increasePrice(upcharge);
	}
	
	private void looseCut(Clothes decoratedclothes) {
		System.out.println("Cutting the clothes bigger than the body measurements...");
	}

}
