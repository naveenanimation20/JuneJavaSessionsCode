package oop_encapsulation;

public class TestEmp {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		
//		e1.setName("Tom");
//		e1.setAge(20);
//		e1.setPerm(true);
//		
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.isPerm());
//		System.out.println(e1.getAge());

		// CRUD

		Employee e1 = new Employee("tom", 20, true);// POST - create

		// GET - retrieve
		System.out.println(e1.getName());
		System.out.println(e1.isPerm());
		System.out.println(e1.getAge());

		e1.setAge(25);// PUT - update

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.isPerm());
		System.out.println(e1.getAge());

		e1.setPerm(false);

		// GET
		System.out.println(e1.getName());
		System.out.println(e1.isPerm());
		System.out.println(e1.getAge());

	}

}
