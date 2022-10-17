package javasessions;

public class Ecomm {

	// Method Overloading: (static) compile Time Poly(many) + morphism(forms)
	// Within the same class, when you have methods with:
	// 1. the same name
	// 2. different number of parameters
	// 3. the different sequence of the parameters

	public void test() {// 0 param
		System.out.println("test method");
	}

	public int test(int i) {// 1 param

		return 10 + i;
	}

	public String test(String k) {// 1 param
		return "naveen";
	}

	public int test(int p, String k) {// 2 params
		
		return p+10;
	}

	public void test(String b, int a) {// 2 params

	}

	public void pop() {

	}

	//feature -- bussiness - PO ---> method
	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, int otp) {

	}

	public void login(String username, String password, String role) {

	}

	//
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, String color) {

	}

	public void search(String productName, String color, int price) {

	}

	//
	public void doPayment(String upi) {

	}

	public void doPayment(String CC, int cvv, int otp) {

	}

	public void doPayment(String paypalId, String pwd) {

	}

	// uber:
	public void booking(String stLocation, String endLocation) {

	}

	public void booking(String stLocation, String endLocation, String carType) {

	}

	public void booking(String stLocation, String endLocation, String carType, String couponCode) {

	}

	public static void main(String[] args) {

		Ecomm obj = new Ecomm();
		obj.test();
		int sum = obj.test(20);
		System.out.println(sum);

		obj.booking("whitefield", "JP nagar", "sedan", "naveen10");

	}

}
