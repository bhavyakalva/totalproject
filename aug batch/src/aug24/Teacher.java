package aug24;

public class Teacher extends School {
	int salary = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();// teacher can access school methods coz we used inheritance here
		System.out.println("the school name is " + t1.SchoolName);
		System.out.println("the school code is " + t1.SchoolCode);
		t1.schoolAddress();
		t1.schoolOffice();
		t1.staffRoom();
		t1.library();
		t1.playGround();
		t1.salary();
		t1.subject();
		t1.designations();
		t1.books();

	}

	void salary() {
		System.out.println("Salary of the teacher is " + salary);
	}

	void subject() {
		System.out.println("maths, science, social, telugu and etc..");
	}

	void designations() {
		System.out.println("TPT SGT PGP we have these expertise in school");
	}

	void books() {
		System.out.println("All acadamic books should be available with teachers");
	}

}
