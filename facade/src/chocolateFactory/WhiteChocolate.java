package chocolateFactory;

public class WhiteChocolate implements Chocolate{

	@Override
	public void addIngredients() {
		System.out.println("Only use the cocoa butter but not the chocolate liquor");
		System.out.println("Adding milk powder, sugar...");
		
	}

	@Override
	public int getMeltingPoint() {
		return 45;
	}

	@Override
	public int getCoolingPoint() {
		return 26;
	}

	@Override
	public int getTemperingPoint() {
		return 28;
	}

}
