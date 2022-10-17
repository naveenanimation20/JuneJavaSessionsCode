package javasessions;

public class Customers {

	String name;
	int age;
	String city;
	String phone;

	// Create customers with different combinations:
	// no default values types of customer
	//method: buss logic - feature
	//const: never define buss logic

	public Customers(String name) {
		this.name = name;
	}

	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Customers(String name, int age, String city, String phone) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

	public static void main(String[] args) {

		Customers c1 = new Customers("tom");
		System.out.println(c1.name);

		Customers c2 = new Customers("Gurjeet", 25);
		System.out.println(c2.name + " " + c2.age + " " + c2.city + " " + c2.phone);
		
		Customers c3 = new Customers("venkat", 29, "pune" , "9898989898");
		
		System.out.println(c3.name +  " " + c3.phone);

	}

}
