package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList - default class
		//maintains the index/order
		
		
		//create the object of the ArrayList: with new keyword
		
		ArrayList ar = new ArrayList(); //empty array list - VC = 10
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(2);//1
		
		System.out.println(ar.size());//2
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4

		ar.add(5000);//4
		ar.add(1600);//5
		
		System.out.println(ar.size());//6
		
		System.out.println(ar.get(0));//100
		//System.out.println(ar.get(6));//IOB
		//System.out.println(ar.get(-1));//IOB
		
		//to print all the values of arraylist: for loop/for each loop:
		
		//
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));//100 2 300 400 
		}
		
		//
		

		
		
	}

}
