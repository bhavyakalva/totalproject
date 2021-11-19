package sep3_encapsulation;

public class CollegeStunew {
	College stu;

	public void student() {
		stu =new College();
		stu.setstudentname("sony");
		stu.setstudentcollege("mallareddy");
		display();
	}
		
		public static void main(String[] args) {
	
		CollegeStunew obj=new CollegeStunew();
		obj.student();
	
}	
		void display() {
			String studentname=stu.getstudentname();
			String studentcollege=stu.getstudentcollege();
			String branch=stu.getstudentbranch();
		System.out.println("student name is "+studentname+" student college is "+studentcollege+" student branch is "+branch);
		
		}
		
	}


