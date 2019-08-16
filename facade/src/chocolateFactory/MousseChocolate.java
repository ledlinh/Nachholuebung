package chocolateFactory;

public class MousseChocolate extends ChocolateDecorator {

	public MousseChocolate(Chocolate chocolate) {
		super(chocolate);
	}
	
	@Override
	public void addIngredients() {
		chocolate.addIngredients();
		addCream();
	}
	
	private void addCream() {
		System.out.println("Adding cream to soften the chocolate...");
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
