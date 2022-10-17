package ExceptionHandling;

public class FinallyBlock {

	public static int getMarks(String stName) {
		System.out.println("getting marks for : " + stName);

		if (stName.equals("Tom")) {

			try {
				int i = 9 / 3;
				System.exit(1);//shutdown JVM
				System.out.println("hellooooooo");
				return 85;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming...");
				return 50;
			}

			finally {
				System.out.println("im in finally block");
				return 10;
			}

			// return 100;
		}

		else if (stName.equals("peter")) {
			return 90;
		}

		else if (stName.equals("gaurav")) {
			return 85;
		}

		else {
			System.out.println("st name is not found...");
			return -1;
		}

	}

	public static void main(String[] args) {

		int m = getMarks("Tom");
		System.out.println(m);

//		System.out.println("A");
//
//		try {
//			int i = 9 / 0;
//			System.out.println("hello exception");
//		}
//
//		catch (ArithmeticException e) {
//			// e.printStackTrace();
//			System.out.println("AE is coming...");
//		}
//
//		finally {
//			System.out.println("im in finally block");
//		}
		
		
		
		//use cases:
		//user1: Gurjeet
		//create a DB connection: un/pwd --- PASS
		
		//hit a SQL --- PASS
		
//		try {
//		//get the results --- FAIL -- Exception
//		}
//		catch() {
//			SQLEXCEPTION
//		}
		
//		finally {
//		//close the DB connection
//	}
		
		//store the results
		//print the results
		

		
		
		//user2: lokesh
				//create a DB connection: un/pwd --- PASS
				
				//hit a SQL --- PASS
				
//				try {
//				//get the results --- FAIL -- Exception
//				}
//				catch() {
//					SQLEXCEPTION
//				}
				//store the results
				//print the results
		
		
		
		//user3: geet
		//create a DB connection: un/pwd --- PASS
		
		//hit a SQL --- PASS
		
//		try {
//		//get the results --- FAIL -- Exception
//		}
//		catch() {
//			SQLEXCEPTION
//		}
		//store the results
		//print the results
		
		
		
		
		

	}

}
