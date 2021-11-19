package aug25_constructor_overloading_overridding;

public class Emp {// constructor overloading

	@SuppressWarnings("unused")
	public static void main(String[] args) { //here we are overloading constructor with diff
											// parameters we can over load constructor only by using diff parameters
											//  ex if we use int string  parmeters next we cannot use that we have to use
											// int string string or string int we can use
		Emp obj = new Emp();
		

		new Emp(11, 5);

		new Emp(10, "techm");

		new Emp("sony", 10);
		new Emp(20000, 5000, 25000);

	}

	Emp() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum of a and b is " + c);
	}

	Emp(int a, int b) {
		int c;
		c = a * b;
		System.out.println("mul of a and b is " + c);
	}

	Emp(int ofccode, String ofcname) {
		System.out.println("office name is " + ofcname + "office code is " + ofccode);

	}

	Emp(String empname, int empid) {
		System.out.println("employee name is " + empname + " employee id is " + empid);

	}

	Emp(int sal, int bonus, int totalsal) {
		System.out.println("int employee sal is " + sal);
		System.out.println("int employee bonus is " + bonus);
		System.out.println("int employee total sal is " + totalsal);

	}

}