package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		String str = "Hi this is my java code";//String literals
		//String sy = new String("tom");
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(22));
		System.out.println(str.charAt(str.length()-1));
		//System.out.println(str.charAt(23));//StringIndexOutOfBoundsException
		//System.out.println(str.charAt(str.length()));

		//System.out.println(str.charAt(-1));
		
		System.out.println(str.indexOf('H'));

		System.out.println(str.indexOf('i'));//1 -- 1st occurrence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); //-- 2nd occurrence of i

		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("ruby"));
		
		String mesg = "admin welcome";//8, -1
		if(mesg.indexOf("admin") >= 0) {
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect");
		}
		
		
		String s = "    hello    world   ";
		System.out.println(s.trim());
		
		String data = "    name is admin     ";
		String browser = "chrome ";
		if(browser.trim().equals("chrome")) {
			
		}
		
		String t = "hello       world";
		System.out.println(t.replace(" ", ""));
		
		String dob = "01-01-1990";//01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//
		String h = "hi this is my java code and i am so happy";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		String i = "12   3";
		
		//String comp:
		String m1 = "chrome";
		String m2 = "Chrome";
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equalsIgnoreCase(m2));
		
		//System.out.println(m1 == m2);
		
		//
		String main = "welcome to     testing     world testing naveen testing";
		System.out.println(main.contains("testing"));
		
		System.out.println(main.replaceAll("\\s+", " "));
		System.out.println(main.replaceAll("testing", "java"));
		
	}

}
