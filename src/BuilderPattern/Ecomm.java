package BuilderPattern;

public class Ecomm {
	
	public Ecomm doLogin() {
		System.out.println("login to app");
		return this;
	}

	public Ecomm doLogin(String un, String pwd) {
		System.out.println("login to app:" + un + ":" + pwd);
		return this;
	}

	public Ecomm search() {
		System.out.println("search with all products");
		return this;
	}

	public Ecomm search(String name) {
		System.out.println("search with : " + name);
		return this;
	}

	public Ecomm addtoCart(String name) {
		System.out.println("add to cart: " + name);
		return this;
	}

	public Ecomm makePayment(String cc, int cvv) {
		System.out.println("make payment: " + cc + ":" + cvv);
		return this;
	}

	public Ecomm makePayment(String cc, int cvv, int otp) {
		System.out.println("make payment: " + cc + ":" + cvv + ":" + otp);
		return this;

	}

	public Ecomm makePayment(String upi) {
		System.out.println("make payment: " + upi);
		return this;

	}

	public Ecomm generateOrder() {
		System.out.println("order is done....your order id is: " + 12345);
		return this;
	}
	

	public Ecomm logout() {
		System.out.println("logout");
		return this;
	}

}
