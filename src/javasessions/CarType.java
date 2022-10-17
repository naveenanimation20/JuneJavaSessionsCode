package javasessions;

public class CarType {

	String name;
	int price;
	String plateNumber;
	static int wheels = 4;
	
	

	public static void main(String[] args) {
		
		int i = 10;//local var
		
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.plateNumber = "KA052222";
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.plateNumber = "KA053212";
		
		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 20;
		c3.plateNumber = "KA059090";
		
		//how to access static vars:
		//1. use the class name:
		System.out.println(CarType.wheels);
		
		//2. direct access:
		System.out.println(wheels);
		
		//3. can I static vars using object ref? - Not recommended--warning
		System.out.println(c1.wheels);
		
		
	}

}
