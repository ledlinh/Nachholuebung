package chocolateFactory;

public interface Chocolate {
	
	public int getMeltingPoint();
	public int getCoolingPoint();
	public int getTemperingPoint();
	
	public default void preparecocoaBeans() {
		System.out.println("Roasting and grounding cocoa beans...");
		System.out.println("Separating the cocoa butter...");
		System.out.println("Collecting chocolate liquor...");
	}
	
	public void addIngredients();
	
	public default void kneadPaste() {
		System.out.println("Kneading the chocolate paste to eliminate grits...");
	}
	
	public default void tempering() {
		System.out.println("Tempering:");
		System.out.println("Heat the paste to the melting point of "
							+ getMeltingPoint() + " degrees C");
		System.out.println("Remove from the heat and stir until it reachs "
							+ getCoolingPoint() + " degrees C");
		System.out.println("Raise the temperature again to "
							+ getTemperingPoint() + " degrees");
	};
	
}
