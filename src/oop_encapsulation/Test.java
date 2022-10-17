package oop_encapsulation;

public class Test {

	public static String capitalizeWord(String str) {
		
		if(str == null) {
			System.out.println("null value");
			return str;
		}
		
		if(str.length()==1) {
			return str.toUpperCase();
		}

		String words[] = str.split("\\s+");
		String result = "";

		for (String w : words) {
			String first = w.substring(0, 1).toUpperCase();// N
			String restString = w.substring(1);// aveen
			result = result + first + restString + " ";// Naveen
		}

		// System.out.println(result);
		return result.trim();

	}

	public static void main(String[] args) {

		String caps = capitalizeWord("naveen       automation       labs");// Naveen Automation Labs
		System.out.println(caps);

		caps = capitalizeWord("naveen");// Naveen
		System.out.println(caps);
		
		caps = capitalizeWord("n");// N
		System.out.println(caps);
		
		
		caps = capitalizeWord("n n      n n");// N N N N
		System.out.println(caps);
		
		caps = capitalizeWord("123");// 123
		System.out.println(caps);
		
		caps = capitalizeWord("123 test naveen automation");// 123
		System.out.println(caps);
		
	}

}
