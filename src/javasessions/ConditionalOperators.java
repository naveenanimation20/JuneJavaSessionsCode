package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		
		int i = 20;
		int j = 10;
		
		if(i >= j) {
			System.out.println("both are equal or i is gr than j");
		}
		else {
			System.out.println("both are not equal");
		}
		
		// > < >= <= ==
		
		if(10==20) {//Dead code
			System.out.println("hiiii");
		}
		else {
			System.out.println("bye");
		}
		
		//
		if(true) {
			System.out.println("Selenium");
		}
		else {//Dead code
			System.out.println("Cypress");
		}
	
		//
		boolean flag = false;
		if(flag) {
			System.out.println("Testing with Selenium");
		}
		else {
			System.out.println("Testing with cypress");
		}
		//
		//nested if
		int total = 92;
		if(total <= 100) {
			System.out.println("PASS");
				if(total >=90) {
					System.out.println("A Grade");
						if(total >= 95) {
							System.out.println("100% discount...");
						}
						else {
							System.out.println("70% discount....");
						}
				}
				else {
					System.out.println("B Grade");
				}
				
		}
		else {
			System.out.println("Invalid marks");
		}
		//
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser

		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch the chrome....");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch the firefox....");
		}
		if(browser.equals("ie")) {
			System.out.println("launch the ie....");
		}
		if(browser.equals("safari")) {
			System.out.println("launch the safari....");
		}
		else {
			System.out.println("please pass the right browser....."+ browser);
		}
		
		//if - else if:
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser
		
		String browserName = "opera";
		
		if(browserName.equals("chrome")) {
			System.out.println("launch the chrome....");
		}
		else if(browserName.equals("firefox")) {
			System.out.println("launch the firefox....");
		}
		else if(browserName.equals("safari")) {
			System.out.println("launch the safari....");
		}
		else if(browserName.equals("ie")) {
			System.out.println("launch the ie....");
		}
		else {
			System.out.println("please pass the right browser....."+ browserName);
		}
		
	}

}
