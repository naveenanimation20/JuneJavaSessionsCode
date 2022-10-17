package javasessions;

public class StaticMethodOverloading {

	public static void printLogo(int i) {
		
		printLogo(i, 20);

	}

	public static void printLogo(int a, int b) {
		System.out.println(a+b);
	}

	public static String printLogo(String name) {
		return name + " logo";
	}

	public static void main(String args[]) {

		
//		String n = StaticMethodOverloading.printLogo("NAL");
//		System.out.println(n);
		
		
		StaticMethodOverloading.printLogo(50);
	}

}
