package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		// take a browser value...ch/ff/ie/safari....
		// if the condition is matched...launch the browser
		// else print a mesg: please pass the right browser

		String browser = "opera";
		int timeOut = 20;
		boolean headless = true;
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			if (headless) {
				System.out.println("run browser in headless mode");
			}
			if (timeOut == 20) {
				System.out.println("please close the browser");
			}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("please pass the right browser:" + browser);
			//break;
		case "naveen":
			System.out.println("launch naveen");
			break;
		}
		

//		boolean flag = true;
//		double marks = 12.33;
//		switch (marks) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		// switch case : byte, short, int, long, double, float, char, String
		char b = 'a';
		switch (b) {
		case 'a':
			System.out.println("a");
		case 'e':
			System.out.println("e");
		case 'i':
			System.out.println("i");
		case 'o':
			System.out.println("o");
		case 'u':
			System.out.println("u");

		default:
			break;
		}

		// multiple environment: QA/DEV/UAT/STAGE/PROD
		// cross browser logic
		// locator:

		int total = 100;

//		switch (total) {
//		case 80:
//			System.out.println("grade a");
//			break;
//		case 80:
//			System.out.println("grade a");
//			break;
//
//		default:
//			break;
//		}

	}

}
