package ExceptionHandling;

public class ThrowsKeyword {

	public static void addToCart() {
		System.out.println("adding to cart");
		doPayment();
	}

	public static void generteOrderId(int num) throws ArithmeticException {
		System.out.println("generteOrderId");
		int i = 9 / num;
	}

	public static void doPayment() {
		System.out.println("doPayment");

		try {
			generteOrderId(0);
		} catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		addToCart();

		System.out.println("bye");

	}

}
