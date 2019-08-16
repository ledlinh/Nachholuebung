package chocolateFactory;

public class ChocolateMaker {

	private Chocolate milkChoc;
	private Chocolate mintDarkChoc;
	private Chocolate trufflMoussewhiteChoc;
	
	public ChocolateMaker() {
		milkChoc = new MilkChocolate();
		mintDarkChoc = new PeppermintChocolate(new DarkChocolate(70));
		trufflMoussewhiteChoc = new TruffleChocolate(new MousseChocolate(new WhiteChocolate()));
	}
	
	public void makeMilkChocolate() {
		makeChocolate(milkChoc);
	}
	
	public void makeMintDarkChocolate() {
		makeChocolate(mintDarkChoc);
		
	}
	
	public void makeTrufflMousseWhiteChocolate() {
		makeChocolate(trufflMoussewhiteChoc);
	}
	
	private void makeChocolate(Chocolate chocolate) {
		chocolate.preparecocoaBeans();
		chocolate.addIngredients();
		chocolate.kneadPaste();
		chocolate.tempering();
	}
	
}
