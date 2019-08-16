package chocolateFactory;

public class PeppermintChocolate extends ChocolateDecorator {

	public PeppermintChocolate(Chocolate chocolate) {
		super(chocolate);
	}
	
	@Override
	public void addIngredients() {
		chocolate.addIngredients();
		addMint();
	}
	
	private void addMint() {
		System.out.println("Adding peppermint flavour...");
	}

	@Override
	public int getMeltingPoint() {
		return chocolate.getMeltingPoint();
	}

	@Override
	public int getCoolingPoint() {
		return chocolate.getCoolingPoint();
	}

	@Override
	public int getTemperingPoint() {
		return chocolate.getTemperingPoint();
	}

}
