package webshopLogin;

public class GoogleLoginAdapter implements ILogin{
	
	@Override
	public boolean login(String mail, String password) {
		GoogleLogin google = new GoogleLogin();
		google.setGoogleValidationRedirect("Webshop");
		GoogleUser user = google.startNewSession(mail, password);
		if (user != null) return true;
		return false;
	}
}
