package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		
		String x = "hello";
		String y = "world";
		
		double d1 = 12.33;
		double d2 = 12.44;
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a+b);//helloworld100200
		
		System.out.println(a+b+x+y);//300helloworld
		
		System.out.println(x+y+(a+b));
		
		System.out.println("hello world naveen");
		System.out.println("the value of a : " + a);
		System.out.println("the value of b : " + b);
		System.out.println("the sum is: " + (a+b));
		
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		System.out.println(x+y+d1+d2);
		System.out.println(x+c1);
		System.out.println(x+y+(c1+c2));//helloworld195
		
		
		
		
	}

}
