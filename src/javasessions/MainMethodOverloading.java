package javasessions;

public class MainMethodOverloading {

	// command line arguments
	public static void main(String[] a) {
		 System.out.println(a.length);//0
		 System.out.println(a[0]);//AIOB
		System.out.println("hi....I am main");
		
		
		MainMethodOverloading.main();
		MainMethodOverloading.main(10);

	}
	
	

	public static void main() {

		System.out.println("bye....");

	}

	public static void main(int i) {

		System.out.println("pop...."+i);

	}

}
