package shoeBuilder;

public class Main {

	public static void main(String[] args) {
		ShoeDirector director = new ShoeDirector();
		ShoeBuilder bootBuilder = new BootBuilder();
		ShoeBuilder sportshoeBuilder = new SportshoeBuilder();
		
		Shoe boot = director.buildShoe(bootBuilder);
		Shoe sportshoe = director.buildShoe(sportshoeBuilder);
		
		System.out.println(boot.getDetails());
		System.out.println();
		System.out.println(sportshoe.getDetails());
	}

}
