package SuperKeyword;

public class BMW extends Car {

	int minSpeed = 200;

	public BMW() {
		//super(10);//first statement
		super();
		System.out.println("BMW default const....");
	}

	@Override
	public void getMileage() {
		super.getMileage();
		System.out.println("BMW mileage is 18");
		
	}

	public void displaySpeed() {
		System.out.println("BMW speed: " + minSpeed);//200
		System.out.println("Car speed: " + super.minSpeed);//100
	}

}
