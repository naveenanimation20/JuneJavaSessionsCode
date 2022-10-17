package oop_encapsulation;

public class LoginPageConstructorThree {

	String username;
	String password;

	public LoginPageConstructorThree(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public LoginPageConstructorThree(String username) {
		this.username = username;

	}

	public String userName() {
		
		int interestRate = 0;
		
		if (username == "User21") {
			System.out.println(username + "  preferred customer");
			return "Eligible for "+interestRate+"% home loan";
		}
		if (username == "User22") {
			interestRate = 10;
			System.out.println(username + "  diamond customer");
			return "Eligible for "+interestRate+"% home loan";
		} else {
			System.out.println(username + "  Ordinary customer");
		}
		return "No offers for customer";

	}

	public static void main(String[] args) {

		LoginPageConstructorThree u1 = new LoginPageConstructorThree("User21", "User21");
		
		String r1 = u1.userName();
		System.out.println(r1);
	}

}
