package sep1_accessmodifiers;

public class Student extends School {

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println("name of the school is " + obj.schoolName);
		obj.adminSalary();// protected mthd from the schoolclass is accessed as we used extends school //
							// here we accesed both public and protected mthds and default mthds from school class except
							// private method coz it is accesed with in a class
		obj.garden(); // public method from the schoolclass
		obj.playground(); // defaultmethod from the schoolclass

	}

}
