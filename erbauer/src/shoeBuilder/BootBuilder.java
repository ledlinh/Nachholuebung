package shoeBuilder;

public class BootBuilder extends ShoeBuilder{


	@Override
	public Shoe buildShoe() {
		shoe = new Boot();
		return shoe;
	}
	
	@Override
	public IBody buildBody() {
		body = new BootBody();
		return body;
	}

	@Override
	public ISole buildSole() {
		sole = new BootSole();
		return sole;
	}

	@Override
	public IShoelace buildShoelace() {
		shoelace = new BootShoelace();
		return shoelace;
	}

}
