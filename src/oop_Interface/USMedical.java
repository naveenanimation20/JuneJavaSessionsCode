package oop_Interface;

public interface USMedical extends WHO {
	
	int min_fee = 10;
	//vars are static and final by default

	// abstract method : having no method body: method prototype/ only method
	// declaration
	// can not create the object of Interface
	// 100% abstraction

	public void pediaServices();

	public void physioServices();

	public void OrthoServices();

	public void emergencyServices();

	public void dentalServices();

	public void dentalServices(int dentists);

	public int dentalServices(int dentists, String dentalMachine);

	// after JDK 1.8

	// two major changes:
	// 1. can have a static method with method body
	public static void medicalTraining() {
		System.out.println("US medical training");
	}

	//2. can have a default method
	default void donation() {
		System.out.println("US medical donation");
	}
	
	
	
}
