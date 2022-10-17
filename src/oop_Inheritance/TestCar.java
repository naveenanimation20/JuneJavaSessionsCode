package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		final int i = 10;//constant data
		
		final int days = 7;
		//days = 10;
		System.out.println(10 * days);//70 USD
		
		
		

		BMW b = new BMW();

		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual
		b.engine();// overridden
		System.out.println(b.speed);
		
		System.out.println(Car.wheels);
		
		System.out.println(BMW.wheels);
		

		//
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		

		Vehicle v4 = new Vehicle();
		v4.engine();

		// child class object can be referred by parent class ref variable
		// top/up casting:
		Car c1 = new BMW();
		c1.start();// BMW
		c1.stop();
		c1.refuel();
		c1.engine();
		

		Vehicle v1 = new BMW();
		v1.engine();

		Vehicle v2 = new Car();
		v2.engine();

		// Down casting:
		// parent class object can be referred by child class ref variable
		 //BMW b1 = (BMW)new Car();//ClassCastException

		// BMW b2 = (BMW)new Vehicle();//ClassCastException

	}

}
