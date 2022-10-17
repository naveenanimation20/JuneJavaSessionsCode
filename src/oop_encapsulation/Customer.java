package oop_encapsulation;

import java.util.ArrayList;

public class Customer {

	private String name;
	private int age;
	private ArrayList<String> ordersList;

	public Customer(String name, int age, ArrayList<String> ordersList) {
		this.name = name;
		this.age = age;
		this.ordersList = ordersList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(ArrayList<String> ordersList) {
		this.ordersList = ordersList;
	}

	public static void main(String[] args) {

		ArrayList<String> orderList = new ArrayList<String>();
		orderList.add("nike tshirt");
		orderList.add("nike shoes");
		orderList.add("nike tracks");

		Customer c1 = new Customer("Peter", 30, orderList);
		
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getOrdersList());
		
		
		orderList.add("reebok tracks");
		orderList.add("reebok tshirt");
		
		c1.setOrdersList(orderList);
		
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getOrdersList());
		
		c1.getOrdersList().add("pop");
		
		System.out.println(c1.getName() + " " + c1.getAge() + " " + c1.getOrdersList());


		
	}

}
