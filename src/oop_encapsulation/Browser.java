package oop_encapsulation;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkOSComtible();
		enoguhRAMSpace();
		checkbrowserUpgrade();
		System.out.println(" browser is launched");

	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
	private void checkOSComtible() {
		System.out.println("checkOSComtible");
	}
	
	
	private void enoguhRAMSpace() {
		System.out.println("enoguhRAMSpace");
	}
	
	
	private void checkbrowserUpgrade() {
		System.out.println("checkbrowserUpgrade");
	}
	
	
	
	
	

}
