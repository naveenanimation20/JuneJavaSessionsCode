package javasessions;

public class EmployeeType {

	String name;
	int age;
	double salary;

	// constructor of the class:
	// const.. name is the same as the class name but function name can be anything
	// const... can not return anything but function may or may not return
	// const... no void keyword
	//const... will be called when you create the object but function will be called with object ref name

	public void test() {
		System.out.println("test method...");
	}

	//const... overloading
	public EmployeeType() {// 0 param
		System.out.println("default const....");
	}

	public EmployeeType(int a) {// 1 param
		System.out.println("one param..." + a);
	}
	
	public EmployeeType(int a, String b) {// 2 params
		System.out.println("two params...." + a+b);
	}

	public static void main(String[] args) {

		EmployeeType e1 = new EmployeeType(10, "tom");
		e1.test();
		

	}

}
