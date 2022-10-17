package javasessions;

import java.util.ArrayList;

public class Application {

	public double getNumber(double d1, double d2) {

		double d = d1 + d2;
		return d;

	}

	// WAF: getDevicesList(empName):
	// param: empName (String)
	// return: list of devices --> ArrayList

	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for : " + empName);
		ArrayList<String> devicesList = new ArrayList<String>();

		if (empName.equalsIgnoreCase("shweta")) {
			devicesList.add("iPhone 13");
			devicesList.add("Macbook pro");
			devicesList.add("Airtel SIM");
		} else if (empName.equalsIgnoreCase("aarthi")) {
			devicesList.add("iPhone 12");
			devicesList.add("Macbook air");
		} else if (empName.equalsIgnoreCase("prakash")) {
			devicesList.add("samsung 10");
			devicesList.add("Dell laptop");
		} else {
			System.out.println("emp name is not found...." + empName);
		}

		return devicesList;
	}

	public static void main(String[] args) {

		Application obj = new Application();

		ArrayList<String> l1 = obj.getDevicesList("prakash");
		System.out.println(l1);
		System.out.println("total devices: " + l1.size());

		double num = obj.getNumber(1.12, 23.44);// call by value
		System.out.println(num);
	}

}
