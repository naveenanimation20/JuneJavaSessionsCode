package StringManipulation;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder("hello");
		sb.append("selenium");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		sb1.append("testing");
		System.out.println(sb1);
		
		String x = "hello";
		x.concat("world");//helloworld
		System.out.println(x);
		
	}

}
