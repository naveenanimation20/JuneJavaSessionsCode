package javasessions;

public class Car {

	// instance class vars:

	String name;
	int price;
	String color;
	boolean isAutomatic;

	public static void main(String[] args) {

		// create the object of the class using new keyword:
		Car c1 = new Car();

		c1.name = "BMW";
		c1.price = 40;
		c1.color = "white";
		c1.isAutomatic = true;

		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + c1.isAutomatic);

		Car c2 = new Car();
		c2.name = "Audi";
		c2.isAutomatic = true;

		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.color);
		System.out.println(c2.isAutomatic);
		
		//no reference object
		new Car().name = "Honda";
		new Car().price = 20;
		new Car().color = "Red";
		new Car().isAutomatic = false;

		System.out.println(new Car().name = "Honda");
		
		//null reference object:
		
		Car t1 = new Car();
		t1 = null;
		//t1.name = "BMW 5";//NPE
		//System.out.println(t1.name);
		
		System.gc();//call GC manually - programatically
		
		Car t2 = null;
		t2.name = "Naveen";//NPE
		System.out.println(t2.name);
		

	}

}
