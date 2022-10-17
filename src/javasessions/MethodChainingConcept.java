package javasessions;

public class MethodChainingConcept {

	public int getTotalBill(int userCount, int code) {

		int tax = 100;
		int bill = 1000;
		int totalBill = (tax + bill) * userCount;

		return totalBill;

	}

	public void m1(int i) {
		m2(i);
	}

	public void m2(int k) {
		m3(k);
	}

	public void m3(int p) {
		System.out.println("bye: " + p); 
	}

	public static void main(String[] args) {
		MethodChainingConcept obj = new MethodChainingConcept();

		obj.m1(10);

//		int billAmount = obj.getTotalBill(10, 2);
//		System.out.println(billAmount);

	}

}
