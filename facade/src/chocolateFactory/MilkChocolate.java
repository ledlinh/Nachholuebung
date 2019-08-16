package chocolateFactory;

public class MilkChocolate implements Chocolate {

	@Override
	public void addIngredients() {
		System.out.println("Keeping the chocolate liquor below 40%");
		System.out.println("Adding milk powder, sugar, cocoa butter...");	
	}

	@Override
	public int getMeltingPoint() {
		return 47;
	}

	@Override
	public int getCoolingPoint() {
		// TODO Auto-generated method stub
		return 27;
	}

	@Override
	public int getTemperingPoint() {
		// TODO Auto-generated method stub
		return 30;
	}

}
