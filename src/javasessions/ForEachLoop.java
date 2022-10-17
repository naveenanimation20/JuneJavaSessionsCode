package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = new int[4];//0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//1. index based for loop:
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("------");
		
		//2. for each:
		for(int e : i) {
			System.out.println(e);
		}
		
		//
		double d[] = new double[3];//0-2
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 23.44;

		for(double e : d) {
			System.out.println(e);
		}
		
		//
		char c[] = new char[3];//0-2
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		
		for(char e : c) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
