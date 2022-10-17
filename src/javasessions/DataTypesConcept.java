package javasessions;

/**
 * 
 * @author naveenautomationlabs
 * Date: june 30th 2022
 */
public class DataTypesConcept {

	public static void main(String[] args) {

		//data types:
		//strict data type
		//1. primitive data types: can be used directly inside the memory
		//no need to create any object
			//a. boolean type: boolean (true/false)
			//b. Numeric type:
				//b.1: character type: char
				//b.2: Integral type:
						//b.2.1: Integer: byte, short, int, long
						//b.2.2: floating-point: float, double
		
		//2. non primitive data types: class, String, Array, interface, Abs class
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		//2x2x2x2x2x2
		byte b = 1;
		 b = 10;
		System.out.println(b); //10
		byte b1 = -10;
		
		//2. short: 
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767
		short s = 10000;
		System.out.println(s);
		short s1 = 1;
		System.out.println(s1);
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647
		//-2^32 to 2^32-1
		int i = 1212121;
		int p = 1;
		int e = 10;
		System.out.println(p+e);
		
		
		//4. long:
		//size: 8 bytes = 8 x8 = 64 bits
		//range: -2^64 to 2^64-1
		long num = 88889898989L;
		System.out.println(num);
		long dis = 10;
		
		//floating-point
		//5. float:
		//size: 4 bytes = 4x8 = 32 bits
		float f = 12.33f;
		float f1 = (float)3.44;
		System.out.println(f);
		System.out.println(f1);
		float f2 = 100;
		System.out.println(f2);
		
		
		//6. double:
		//size: 8 bytes = 8x8 = 64 bits
		double d = 12.33333;
		double d1 = -123.4444;
		System.out.println(d);
		double d2 = 10.1;
		double d3 = 23.44;
		System.out.println(d2+d3);
		
		//7. char:
		//size: 2 bytes = 16 bits
		char c = 'a';//97
		char c11 = 'b';//98
		char c1 = '1';
		char c2 = '$';
		System.out.println(c);//a
		System.out.println(c+c11);//97+98 = 195
		System.out.println(c-c11);
		System.out.println(c*c11);
		char t = '4';
		char t1 = '0';
		System.out.println(t+t1);
		System.out.println(t1);

		//range:
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println((byte)c);
		System.out.println((int)'b');
		
		char gender = 'm';
		char currency = '$';
		
		
		//8. boolean: true/false
		//size: ~1 bit
		boolean bl = true;
		boolean bl1 = false;
		
		System.out.println(bl);
		System.out.println(false);
		
		boolean flag = true;
		System.out.println(flag);
		
		
		
		
		
		
	}

}
