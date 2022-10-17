package oop_Interface;

import java.util.Arrays;

public class Browsers {
	
	String name;
	double version;
	String plugin[];
	
	public Browsers(String name, double version, String[] plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}


	

	public static void main(String[] args) {
		
		Browsers b= new Browsers("Chrome",169.85, new String[]{"xpath","camera","addon"} );
		System.out.println(Arrays.toString(b.plugin));
	}

}
