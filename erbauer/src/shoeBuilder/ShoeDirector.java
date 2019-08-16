package shoeBuilder;

public class ShoeDirector {

	public Shoe buildShoe(ShoeBuilder builder) {
		
		Shoe shoe = builder.buildShoe();
		shoe.setBody(builder.buildBody());
		shoe.setSole(builder.buildSole());
		shoe.setShoelace(builder.buildShoelace());
		
		return shoe;
	}
}
