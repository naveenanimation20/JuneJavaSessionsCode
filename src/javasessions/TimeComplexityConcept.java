package javasessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		//BIG O - TC
		
		int i = 1;
		//O(1)
		int p = 2;
		int total = i+p;
		System.out.println(total);
		
		//O(N) --> N = 1 --> O(1) -- constant time....
		
		//for loop:
		
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
		}
		
		//1 + n + n + n ==> 1+3n ==> 3n+1 -- linear equation
		//3n + 1 ==> 3n --> O(n) 
		
		//
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
			System.out.println("hi");
			System.out.println("bye");

		}
		//1+n+n+n+n+n ==> 5n+1 ==> 5n ==> O(n)
		
		
		//two for loops:
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
		}
		
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
		}
		
		for(int k = 1; k<=10; k++) {
			System.out.println(k);
				if(10==20) {
					System.out.println("bye...");
				}
		}
		
		//3n + 3n ==> 6n ==> O(n)
		
		//nested loops:
//		for() {
//			for() {
//				for() {
//					
//				}
//			}
//		}
		
  
				
	}

}
