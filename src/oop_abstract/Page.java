package oop_abstract;

public abstract class Page {

	// can not create the object of abs class
	// can have abs + non abs methods in abs class
	//can we create the object of abs.. class?
	//Ans: yes
	//but this will called when you create the object of child class...
	
	//hidden default class....
	
	//in abstract class:
	//1. No (zero) abs... method -- yes -- 0% abstraction
	//2. only abs... method -- yes -- 100% abstraction
	//3. abs + non abs methods -- yes -- partial abstraction
	
	//Interface:
	//100% abstraction

	
	public Page() {
		System.out.println("page ..default...const....");
	}
	
	public Page(int i) {
		System.out.println("page ..const..." + i);
	}
	

	public abstract void title();

	public abstract void url();

	public void timeOut() {
		System.out.println("page -- time out : 20 secs");
	}

	public final void displayLogo() {
		System.out.println("page -- displayLogo");
	}

}
