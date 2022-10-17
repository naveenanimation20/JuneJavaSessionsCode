package javasessions;

public class ObjectArray {

	public static void main(String[] args) {

		//object static array:
		Object emp[] = new Object[5];//0-4
		emp[0] = "Tom";
		emp[1] = 25;
		emp[2] = 12.33;
		emp[3] = 'm';
		emp[4] = true;
		//emp[5] = 98989898;

		System.out.println(emp[0]);
		//System.out.println(emp[5]);//AIOB

		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		System.out.println("-----");
		
		for(Object e : emp) {
			System.out.println(e);//Tom
				if(e.equals("Tom")) {
					System.out.println("hi....");
					break;
				}
		}
		
		
	}

}
