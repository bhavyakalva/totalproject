package aug24;

public class Employee extends Employer {

	public static void main(String[] args) {
		
		Employee obj = new Employee();

		obj.employeeid();
		obj.employeename();
		obj.employeesal();
		obj.manufacture();
		obj.packing();
		obj.delivery();
		System.out.println("company name is " + obj.companyname);
		System.out.println("company code is " + obj.companycode);

	}

	void employeeid() {
		System.out.println("employee id is 123");
	}

	void employeename() {
		System.out.println("employee name is abc");
	}

	void employeesal() {
		System.out.println("employee salary is 10000");
	}

}
