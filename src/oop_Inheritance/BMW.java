package oop_Inheritance;

public class BMW extends Car {

	int speed = 200;
	static int wheels = 2;

	// Method Overriding: Poly + Morphism (RunTime/Dynamic)
	// when you have a method in parent class and the same method is in child class:
	// 1. with the same method name
	// 2. same number of parameters with the same sequence
	// 3. same return type

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	// Method Hiding:
	public static void billing() {
		System.out.println("BMW -- billing");
	}

}
