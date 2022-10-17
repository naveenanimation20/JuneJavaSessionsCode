package javasessions;

public class Customer {

	String name;
	int age;
	static String compName = "Amazon";

	public void sendMail() {
		System.out.println("send mail");
		Customer.getInfo();
	}

	public static int getInfo() {
		System.out.println("get info");
		int i = 10;
		int j = 20;
		return 100;
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "Priyanka";
		c.age = 25;
		
		//Customer.compName = "IBM";

		System.out.println(c.name + " " + c.age + " " + Customer.compName);
		System.out.println(compName);

		// how to access static methods:
		// 1. using class name:
		int a = Customer.getInfo();
		System.out.println(a);//100
		// 2. calling directly:
		getInfo();
		// 3. using object ref?
		c.getInfo();

		// how to access non static vars and methods: we have to create the object
		c.sendMail();

	}

}
