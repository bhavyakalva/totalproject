package aug23;

public class Methodusingparameters {

	public static void main(String[] args) {

		Methodusingparameters obj = new Methodusingparameters();

		obj.schoolname("Greenwood high school");// in methodsusing parameters we give values in main method while
												// calling methods using objects
		obj.prinicipalsal(10000);
		obj.bonussal(10000, 1500);
		obj.teachersal(10000);
		obj.subteachersal(1000);
	}

	void schoolname(String name) {
		System.out.println("school name is " + name);// here we give methods with parameter and prints them but we give
														// values in main method

	}

	void prinicipalsal(int salary) {
		System.out.println("principal salary is " + salary);
	}

	void bonussal(int basicsalary, int bonussalary) {
		int totalsalary = basicsalary + bonussalary;
		System.out.println("principal total salary is " + totalsalary);
	}

	void teachersal(int tsal) {
		System.out.println("the teacher salary " + tsal);
	}

	void subteachersal(int sal) {
		System.out.println("the sub teacher sal is " + sal);
	}
}
