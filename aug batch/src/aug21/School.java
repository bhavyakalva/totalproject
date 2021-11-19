package aug21;

public class School {

	public static void main(String[] args) {
	
		School obj = new School();
		obj.studentclass();
		obj.studentfee();
		obj.collegefee();

	}

	 void studentclass() {
		System.out.println("vth class");
		teachersalary();//here we are calling teachersalary  method in thsi method
	}

	void teachersalary() {
		System.out.println("salary of the teacher is 10,000");//we are calling teacher method in student class method we ca call like that also 
	}

	   public void studentfee() {
		System.out.println("the fee of the student is 5000");
		
	}

	 void collegefee() {
		System.out.println("the college fee is 1,00,000");
	}

}
