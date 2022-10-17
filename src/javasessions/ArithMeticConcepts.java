package javasessions;

public class ArithMeticConcepts {

	public static void main(String[] args) {

		
		System.out.println(10/2);
		System.out.println(9/2);//4
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(8/3);
		System.out.println(9.0/2.0);
		
		//System.out.println(9/0);//ArithmeticException: / by zero
		
		System.out.println(9.0/0);//Infinity
		
		System.out.println(0/9);//0
		
		System.out.println(9/0.0);//Infinity
		
		//System.out.println(0/0);//ArithmeticException
		
		System.out.println(0.0/0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(0/0.0);//NaN
		
		System.out.println(9/9);
		System.out.println(100.2/0);//Infinity
		//System.out.println(100/0);//AE
		
		System.out.println(9 % 3);
		System.out.println(9 % 2);
		System.out.println(11 % 2);
		System.out.println(17 % 3);
		System.out.println(100 / 2 + "hello");
		String c = "hello";
		String d = "world";
		System.out.println(c+" "+d);
		System.out.println(c + ' ' + d);
		
		short s = 65;
		char cc = (char) s;
		
	}

}
