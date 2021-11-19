package aug23;

public class Datatypes {

	public static void main(String[] args) {

		Datatypes obj = new Datatypes();
		String collegename = obj.nameofthecollege();// in data types we call obj in main method with the diff datatypes
													// names other than it has in method and print in main method itself
		System.out.println("name of the collge is " + collegename);
		int lecsal = obj.lecturrsalary();
		System.out.println("lecturer sal is " + lecsal);
		int totalsal = obj.salary(lecsal);
		System.out.println("total sal of p is " + totalsal);

	}

	String nameofthecollege() {
		String name = "Mallreddy";
		return name;

	}

	int lecturrsalary() {
		return 25000;
	}

	int salary(int sal) {
		int bonus = 2000;
		int tsalary = sal + bonus;
		return tsalary;
	}

}
