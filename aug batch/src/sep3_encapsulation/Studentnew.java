package sep3_encapsulation;

public class Studentnew {
	School student;

	public void student() {
		student = new School();
		student.setstudentname("sony");
		student.setstudentrollno(1);
		student.setstudentclass("ixth");
		student.setstudentfee(15000);
		display();

		student.setstudentname("nani");
		student.setstudentrollno(1);
		student.setstudentclass("xth");
		student.setstudentfee(20000);
		display();

	}

	public static void main(String[] args) {
		Studentnew stu = new Studentnew();
		
		stu.student();
	}

	public void display() {

		String studentschool = student.getstudentschool();
		String studentname = student.getstudentname();
		int studentrollno = student.getstudentrollno();
		String studentclass = student.getstudentclass();
		int studentfee = student.getstudentfee();
		System.out
				.println("school name is " + studentschool + ". student name is " + studentname + ". studentrollno is "
						+ studentrollno + ". student class " + studentclass + ". student fee is " + studentfee);

	}

}
