package shoeBuilder;

public class Boot extends Shoe{
	
	@Override
	public String getDetails() {
		return "A pair of boots made of " + this.body.getMaterial()
				+ " with \n" + "Sole height: " + this.sole.getHeight()
				+ "cm and shoelace length: " + this.shoelace.getLength() + "cm";
	}
}
