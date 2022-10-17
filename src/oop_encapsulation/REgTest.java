package oop_encapsulation;

public class REgTest {

	public static void main(String[] args) {

		// reg page:
		Registration reg = new Registration("ahmed", "ahmed@gmail.com");

		// go to profile page:
		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhoneNumber() + " " + reg.getPassword());

		// profile page: update the info:
		reg.setLastName("ahmedkhan");
		reg.setPassword("ahemd123");
		reg.setPhoneNumber("989898989");

		// go to profile page:
		System.out.println(reg.getFirstName() + " " + reg.getEmail());

		System.out.println(reg.getLastName() + " " + reg.getPhoneNumber() + " " + reg.getPassword());

		// Registration reg1 = new Registration(firstName, lastName, phoneNumber,
		// password, email);
		
		
		//LognPage:
		
		LoginPage adminUser = new LoginPage("admin", "admin123");
			
		adminUser.doLogin();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
