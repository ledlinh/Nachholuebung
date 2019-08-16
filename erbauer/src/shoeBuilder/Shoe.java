package shoeBuilder;

public abstract class Shoe {

	protected IBody body;
	protected ISole sole;
	protected IShoelace shoelace;
	
	public IBody getBody() {
		return body;
	}
	public void setBody(IBody body) {
		this.body = body;
	}
	public ISole getSole() {
		return sole;
	}
	public void setSole(ISole sole) {
		this.sole = sole;
	}
	public IShoelace getShoelace() {
		return shoelace;
	}
	public void setShoelace(IShoelace shoelace) {
		this.shoelace = shoelace;
	}
	
	public abstract String getDetails();
		
}
