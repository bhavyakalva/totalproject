package aug24;

public class Student extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();

		System.out.println("School name is " + stu.SchoolName);// here we can access school class and teacher class also
																// coz we used student extends teacher so the methods
																// present in teacher we use and teacher extended school
																// in teacher class so we can access both teacher and
																// school methods
		System.out.println("school code is " + stu.SchoolCode);
		stu.schoolOffice();
		stu.schoolAddress();
		stu.staffRoom();
		stu.library();
		stu.playGround();
		stu.salary();
		stu.subject();
		stu.designations();
		stu.books();
		stu.classRoom();
		stu.booksOfStudents();
	}

	void classRoom() {
		System.out.println("Class rooms from I to X");
	}

	void booksOfStudents() {
		System.out.println("All class books");
	}
}
