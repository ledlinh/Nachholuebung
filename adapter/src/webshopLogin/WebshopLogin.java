package webshopLogin;

public class WebshopLogin implements ILogin {
	
	@Override
	public boolean login(String mail, String password) {
		System.out.println("Logging in...");
		if (mail != "" && password != "") {
			System.out.println("Logged in.");
			System.out.println("\n");
			return true;
		}
		System.out.println("Login failed.");
		System.out.println("\n");
		return false;
	}
}