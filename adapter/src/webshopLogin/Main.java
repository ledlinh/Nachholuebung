package webshopLogin;

public class Main {

	public static void main(String[] args) {	
		ILogin webshopLogin = new WebshopLogin();
		ILogin googleLogin = new GoogleLoginAdapter();
		
		webshopLogin.login("mail", "password");
		googleLogin.login("googleMail", "googlePW");

	}

}
