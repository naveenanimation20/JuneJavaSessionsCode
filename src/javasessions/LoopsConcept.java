package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10:
		// 1. while loop:
		int i = 1;
		while (i <= 10) {
			System.out.println(i);// 1 2 3 4 5 6789 10
			i++;
			// ++i;
			// i=i+1;
		}
		// 0 to 10: 0 2 4 6 8 10 -- even numbers
		// 1 3 5 7 9 -- odd
		int e = 0;
		while (e <= 10) {
			System.out.println(e);// 0 2 4 6 8 10
			e = e + 2;
		}

		System.out.println("-----------");
		// infinite loop:
		while (true) {
			System.out.println(".....welcome to Taj hotel....");
			break;
		}

		System.out.println("-----------");

		// 1 to 100:
		// multiplication of 5--> print hi...
		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			if (k % 5 == 0) {
				System.out.println("hi...");
			}
			if (k == 50) {
				System.out.println("half century....");
				// break;
			}
			if (k == 100) {
				System.out.println("century....");
				// break;
			}
			k++;
		}

		// use cases of while:
		// when number of iterations are not fixed:
		// page loading time
		// number of web elements on the page--10, 20, 40, 5
		// web table - pagination--> 1 2 3 4 5 6 7...next

		System.out.println("------");

		// 2. for loop:
		// 1 to 10:
		for (int t = 1; t <= 10; t++) {
			System.out.println(t);
			if (t == 5) {
				break;
			}
		}

		//
//		for(;;) {
//			System.out.println("bye");
//			//break;
//		}

		for (byte b = 1; b <= 10; b++) {
			System.out.println(b);
		}

		for (double d = 1.0; d < 10.0; d++) {
			System.out.println(d);// 1.0
		}
		// a to z:
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + ":" + (int) c);
		}

		// use cases of for:
		// when number of iterations are fixed:
		// 5 elements --fixed

		System.out.println("--------------");
		// do-while:
		//use cases: 
		//1 2 3 4 5 6....10
		
		
		//1 to 10:
		int p = 1;
		do {
			//p++;
			System.out.println(p);
			p++;
		} 
		while (p<=10);
		
		System.out.println("--------------");

		//10 to 1:
		int rowCount = 10;
		while(rowCount>0) {
			System.out.println(rowCount);
			rowCount--;
		}
	
		//
		//I am batman 1
		//I am batman 5
		
		for(int x=1; x<=5; x++) {
			System.out.println("I am batman "+x);
		}

		
		byte b3 = 065;//octal number - 0 to 7 only
		System.out.println(b3);
		
		//065 --> 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		int b4 = 076565;
		System.out.println(b4);
		
		//A-Z:
		for(char c1='A'; c1<='Z'; c1++) {
			System.out.println((int)c1+ ":" + c1);//65:A
		}
		
//
//		for(byte q = 119; q<=127; q++) {
//			System.out.println(q);//119 120 123 124 125 126 127+ 1 = -45+1 = -44
//		}
		
		byte nn = 120;
		byte mm = 20;
		int kk = nn+mm;
		System.out.println(kk);
		
		
		// 1 to 100: multiplication of 7 --> print "hi"
		
		System.out.println(9 % 2);
		
		for(int t=1; t<=100; t++) {
			System.out.println(t);
				if(t % 7 ==0) {
					System.out.println("....hi....");
				}
		}
		
		
		
	}

}
