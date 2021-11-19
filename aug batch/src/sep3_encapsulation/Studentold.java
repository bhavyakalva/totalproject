package sep3_encapsulation;

public class Studentold {

	public static void main(String[] args) {
		String studentschool;
		String studentname;
		int studentrollno;
		String studentclass;
		int studentfee;
		School stu = new School();

		stu.setstudentname("sony");
		stu.setstudentrollno(1);
		stu.setstudentclass("IXth class");
		stu.setstudentfee(15000);

		studentschool = stu.getstudentschool();
		studentname = stu.getstudentname();
		studentrollno = stu.getstudentrollno();
		studentclass = stu.getstudentclass();
		studentfee = stu.getstudentfee();
		System.out.println("schoolname is " + studentschool + ". student name is " + studentname + ". student roolno is "
				+ studentrollno + ". student studying in " + studentclass + ". student fee is " + studentfee);
		
		
		stu.setstudentname("nani");
		stu.setstudentrollno(1);
		stu.setstudentclass("Xth class");
		stu.setstudentfee(20000);

		studentschool = stu.getstudentschool();
		studentname = stu.getstudentname();
		studentrollno = stu.getstudentrollno();
		studentclass = stu.getstudentclass();
		studentfee = stu.getstudentfee();
		System.out.println("schoolname is " + studentschool + ". student name is " + studentname + ". student roolno is "
				+ studentrollno + ". student studying in " + studentclass + ". student fee is " + studentfee);
		
		

	}

}
