package ExceptionHandling;

public class throwKeyword {

	public static void main(String[] args) {
		
		String data = null;
		
		if(data == null) {
			try {
				throw new Exception("NODATAFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("data not found error");
				e.printStackTrace();
			}
		}

		
		System.out.println("bye");

	}

}
