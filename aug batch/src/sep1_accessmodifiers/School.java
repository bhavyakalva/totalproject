package sep1_accessmodifiers;

public class School {
	public String schoolName = "Greenwood high school";// it is also accessed
	private String schoolAddress = "warangal";//it cannot accessed out side class

	public static void main(String[] args) {
		School obj = new School();
		System.out.println("name of the school is " + obj.schoolName);
		System.out.println("address of the school is " + obj.schoolAddress);
		obj.salaryTeacher();
		obj.garden();
		obj.adminSalary();
	}

	private void salaryTeacher() { // it can access with in class
		System.out.println("Salary to the Teacher is 10000/-");
	}

	public void garden() { // it is accessed with in the class&package and outside the package
		System.out.println("this is a school garden");
	}

	protected void adminSalary() {// it is accessed with in class and child class
		System.out.println("Salary to the Admin staff is 6000/-");
	}

	void playground() { // it is a default method it can access with in class,child class and package
						// and not accessed outside the package
		System.out.println("this school playground");
	}
}
