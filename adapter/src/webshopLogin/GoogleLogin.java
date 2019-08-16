package webshopLogin;

public class GoogleLogin {

	private String googleValidationRedirect;
	public GoogleUser googleUser;
	
	public GoogleLogin() {
		googleUser = new GoogleUser(); //die gefehlte Code
	}
	
	public GoogleUser startNewSession(String mail, String password) {
		System.out.println("Redirecting to Google...");
		if (validate(mail, password)) {
			System.out.println("Log in to Google succeed.");
			System.out.println("Returning to " + googleValidationRedirect
					+ "...");
			System.out.println("\n");
			return googleUser;
		}
		System.out.println("Redirecting failed.");
		System.out.println("\n");
		return null;
	}
	
	private boolean validate(String mail, String password) {
		if (mail.equals(googleUser.getMail())
			&& password.equals(googleUser.getPassword())) {
			return true;
		}
		return false;
	}

	public String getGoogleValidationRedirect() {
		return googleValidationRedirect;
	}

	public void setGoogleValidationRedirect(String googleValidationRedirect) {
		this.googleValidationRedirect = googleValidationRedirect;
	}

}
