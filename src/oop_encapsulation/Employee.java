package oop_encapsulation;

public class Employee {

	// class vars:
	private String name;
	private int age;
	private boolean isPerm;

	// const:
	public Employee(String name, int age, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.isPerm = isPerm;
	}

	// getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
