package chocolateFactory;

public abstract class ChocolateDecorator implements Chocolate {
	
	protected Chocolate chocolate;
	
	public ChocolateDecorator(Chocolate chocolate) {
		this.chocolate = chocolate;
	}


	@Override
	public void addIngredients() {
		System.out.println();
	}
	
}
