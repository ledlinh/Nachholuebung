package chocolateFactory;

public class TruffleChocolate extends ChocolateDecorator {

	public TruffleChocolate(Chocolate chocolate) {
		super(chocolate);
	}
	
	public void addIngredients() {
		chocolate.addIngredients();
		addTruffle();
		
	}
	
	private void addTruffle() {
		System.out.println("Adding truffle... ");
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
