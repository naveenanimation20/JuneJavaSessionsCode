package oop_abstract;

public class LoginPage extends Page {

	//hidden - default
	
	public LoginPage() {
		System.out.println("LP - default const....");
	}
	
	public LoginPage(int i) {
		super(i);
		System.out.println("LP - const...."+i);
	}
	
	@Override
	public void title() {
		System.out.println("Login Page Title");
	}

	@Override
	public void url() {
		System.out.println("Login Page url");

	}

	public void resetPwd() {
		System.out.println("lp -- reset pwd");
	}

	public void doLogin(String un, String pwd) {
		System.out.println("lp - : " + un + ":" + pwd);
	}

}
