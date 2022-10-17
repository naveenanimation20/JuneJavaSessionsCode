package oop_Inheritance;

public class Car extends Vehicle {

	int speed = 100;
	static final int wheels = 4;

	// final:
	// to prevent method overridding -- method final
	// to prevent inheritance -- class final
	// to provide the constant data

	// private methods can not overridden

	void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}

	public static void billing() {
		System.out.println("car -- billing");
	}

}
