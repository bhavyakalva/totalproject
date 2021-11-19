package sep1_accessmodifiers2;

import sep1_accessmodifiers.School;

public class Student2 extends School {

	public static void main(String[] args) {
		Student2 obj = new Student2();
		System.out.println("name of the school is " + obj.schoolName);// here we can access public methods and instance variables  in school and
		obj.garden();//public method 
		obj.adminSalary();// here we can access the protected method in school coz we imported the
							// package.school and used inheritance also so we can access protected methods also 
	
	}

}
