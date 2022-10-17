package oop_abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.displayLogo();
		lp.title();
		lp.url();
		lp.resetPwd();
		lp.doLogin("naveen", "naveen123");
		
		//Page p = new Page();//NA
		
		//top casting:
		//child class object can be referred by abstract parent class ref variable:
		
		Page p = new LoginPage();
		p.displayLogo();
		p.timeOut();
		p.title();
		p.url();
		
		//down casting: 
		
		
	}

}
