package OOP_MultipleInheritance;

public class Page extends Web{
	
	@Override
	public void getColor() {
		System.out.println("Page -- Red color");
	}
	
	
	public void getPageLoadTimeOut() {
		System.out.println("page -- 20 secs");
	}

}
