package javasessions;

public class LoginPage {

	String username;
	String password;

	// hidden/default const....
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username: " + un);
		System.out.println("enter password: " + pwd);
		System.out.println("click on login button");
		System.out.println("user is logged in successfully....");
	}

	public static void main(String[] args) {

		LoginPage user1 = new LoginPage("admin", "admin123");
		user1.doLogin(user1.username, user1.password);

		LoginPage user2 = new LoginPage("seller", "seller123");
		user2.doLogin(user2.username, user2.password);

	}

}
