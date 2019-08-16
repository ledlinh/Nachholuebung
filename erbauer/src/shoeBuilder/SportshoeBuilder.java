package shoeBuilder;

public class SportshoeBuilder extends ShoeBuilder{

	@Override
	public Shoe buildShoe() {
		shoe = new Sportshoe();
		return shoe;
	}

	@Override
	public IBody buildBody() {
		body = new SportshoeBody();
		return body;
	}

	@Override
	public ISole buildSole() {
		sole = new SportshoeSole();
		return sole;
	}

	@Override
	public IShoelace buildShoelace() {
		shoelace = new SportshoeShoelace();
		return shoelace;
	}

	
}
