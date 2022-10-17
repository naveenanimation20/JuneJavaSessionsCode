package javasessions;

public class ArrayLiterals {

	public static void main(String[] args) {

		
		//ArrayLiterals: static array
		int i[] = {10,20,30,40};//0-3
		
		System.out.println(i.length);//4
		System.out.println("hi = " + (i.length-1));
		System.out.println("li = " + 0);
		
		System.out.println(i[0]);
		//System.out.println(i[4]);//AIOB

		
		for(int e: i) {
			System.out.println(e);
		}
		
		
		//String array literals:
		String students[] = {"Ramya", "Ravi", "Tom", "Peter"};
		System.out.println(students.length);
		
		for(String e : students) {
			System.out.println(e);
				if(e.equals("Tom")) {
					System.out.println("100 marks....");
					break;
				}
		}
		
		
		//Object Array Literals:
		Object empData[] = {"Vinay", 25, 25.55, true, 'm'};
		for(Object e : empData) {
			System.out.println(e);
		}
		
		
	}

}
