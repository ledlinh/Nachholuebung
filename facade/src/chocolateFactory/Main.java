package chocolateFactory;

public class Main {

	public static void main(String[] args) {
		 ChocolateMaker chocolateMaker = new ChocolateMaker();
		 
		 System.out.println("Making classic milk chocolate:");
		 chocolateMaker.makeMilkChocolate();
		 System.out.println("\n");
		 
		 System.out.println("Making dark peppermint chocolate:");
		 chocolateMaker.makeMintDarkChocolate();
		 System.out.println("\n");
		 
		 System.out.println("Making white mousse chocolate with truffle infused:");
		 chocolateMaker.makeTrufflMousseWhiteChocolate();

	}

}
