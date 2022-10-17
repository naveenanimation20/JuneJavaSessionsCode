package oop_encapsulation;

import java.util.ArrayList;

public class Users {

	String name;
	int age;
	ArrayList<String> devicesList;

	public Users(String name, int age, ArrayList<String> devicesList) {
		this.name = name;
		this.age = age;
		this.devicesList = devicesList;
	}

	public static void main(String[] args) {


		ArrayList<String> tomDevicesList = new ArrayList<String>();
		tomDevicesList.add("iph12");
		tomDevicesList.add("macbook pro");
		tomDevicesList.add("samsung phone");
		
		Users u1 = new Users("tom", 25, tomDevicesList);
		
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.devicesList);
		System.out.println(u1.devicesList.size());
	}
	
	public int searchRestra(String name) {
		return 100;
	}
	
	public ArrayList<String> searchRestra(String name, String foodItem) {
		ArrayList<String> ar = new ArrayList<String>();
		
		
		if(name.equals("rest1")) {
			ar.add("rest1");
			ar.add("burger");
			return ar;
		}
		
		return null;
		
	}
	
	
	
//	feature2: Search a restaurant
//	by restaurant name - return 100
//	by  name and food item - return an Arraylist<String> with restaurant name and food items
//	by name, food item and price - return an Arraylist<String> with restaurant name, food items and price
//	by name, food item, price and rating (1 to 5 star) - return an Arraylist<String> with restaurant name, food items and price

}
