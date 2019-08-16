package chocolateFactory;

public class DarkChocolate implements Chocolate {

	protected int cocoaPercentage;
	
	public DarkChocolate(int cocoaPercent) {
		this.cocoaPercentage = cocoaPercent;
	}
	
	@Override
	public void addIngredients() {
		System.out.println("Keeping the chocolate liquor content "
				+ cocoaPercentage + "%");
		System.out.println("Adding milk powder, sugar, cocoa butter...");
	}

	@Override
	public int getMeltingPoint() {
		return 49;
	}

	@Override
	public int getCoolingPoint() {
		return 29;
	}

	@Override
	public int getTemperingPoint() {
		return 32;
	}
	
}
