package javasessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		System.out.println(marksList.size());
		
		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(11);//2
		marksList.add(20);//3
		
		System.out.println(marksList.get(0));//100

		System.out.println(marksList.get(2));
		
		//marksList.remove(2);
		
		System.out.println(marksList.get(2));
		
		marksList.add(400);
		
		System.out.println(marksList.get(3));
		
		marksList.add(0, 150);
		System.out.println(marksList.get(0));//150

//		marksList.add(7, 1000);
//		System.out.println(marksList.get(7));
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(i+ ":" + marksList.get(i));
		}
		
		
	}

}
