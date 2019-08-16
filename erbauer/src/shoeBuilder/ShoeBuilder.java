package shoeBuilder;

public abstract class ShoeBuilder {
	
	protected Shoe shoe;
	protected IBody body;
	protected ISole sole;
	protected IShoelace shoelace;

	public abstract Shoe buildShoe();
	public abstract IBody buildBody();
	public abstract ISole buildSole();
	public abstract IShoelace buildShoelace();
}
