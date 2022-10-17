package DataConversion;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {

		System.out.println(args[0]);

		// 1. String to int:
		String x = "100";
		System.out.println(x + 20);

		// wrapper classes:
		// int --> Integer
		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);

//		String y = "100A";
//		System.out.println(y+20);
//		int j = Integer.parseInt(y);//NumberFormatException
//		System.out.println(j);

		// 2. String to double:
		String t = "12.33";
		System.out.println(t + 20);

		// double --> Double
		double t1 = Double.parseDouble(t);// 12.33
		System.out.println(t1 + 20);

		// 3. int to String:
		int pop = 100;
		System.out.println(pop + 20);

		int totalBill = pop + 50 - 10;
		System.out.println(totalBill);

		String amount = String.valueOf(totalBill);// "140"
		System.out.println(amount + 10);

		// double to String:
		double avg = 12.33;
		String newAvg = String.valueOf(avg);
		System.out.println(newAvg + 1000);

		// String to boolean:
		String headless = "false";
		boolean flag = Boolean.parseBoolean(headless);// true

		if (Boolean.parseBoolean(headless)) {
			System.out.println("run in headless mode");
		} else {
			System.out.println("run in normal mode");
		}

		// boolean to string:
		boolean test = true;
		String p = String.valueOf(test);
		System.out.println(p + 20);

		// split:
		String top = "java_python_ruby_dotnet";

		String arr[] = top.split("_");
		System.out.println(arr[0]);
		// System.out.println(arr[4]);//AIOB

		String foo = "xXtestingXxXseleniumxXXautomationXxXjava";
		String f[] = foo.split("xX");

		System.out.println(f[0]);

		System.out.println(f[1]);

		System.out.println(f[2]);

		System.out.println(f[3]);

		System.out.println(f[4]);

		// System.out.println(f[5]);

		String lol = "HelloJavaAutomationJavaTesting";
		String l[] = lol.split("Java");
		System.out.println(Arrays.toString(l));

		String empData = "Aarthi;sundar;aarthi@gmail.com;aarthi123;jan201990";
		String data[] = empData.split(";");
		for (String e : data) {
			System.out.println(e);
		}

		String lg = "hello selenium java";
		String lk[] = lg.split("\\s+");
		System.out.println(Arrays.toString(lk));

		char c[] = { 't', 'e', 's', 't' };
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(String.valueOf(c));

	}

}
