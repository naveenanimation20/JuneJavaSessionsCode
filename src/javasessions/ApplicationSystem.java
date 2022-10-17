package javasessions;

public class ApplicationSystem {

	String name;
	int pages;//10
	String url;

	public ApplicationSystem(String name, int pages, String url) {
		this.name = name;
		this.pages = pages;
		this.url = url;
	}

	public int getPageCount(String appName) {
		switch (appName) {
		case "amazon":
			return pages;
		case "flipkart":
			return pages;
		case "uber":
			return pages;

		default:
			System.out.println("app not found....");
			return -1;
		}
	}

}
