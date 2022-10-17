package StackMemory;

public class Testing {
	
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m3();
	}
	
	public void m3() {
		System.out.println("bye");
		//m1();
	}
	

	public static void main(String[] args) {
		
		Testing t = new Testing();
		t.m1();
		System.out.println("hello");
	}

}
