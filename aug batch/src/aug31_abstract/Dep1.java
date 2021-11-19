package aug31_abstract;

public class Dep1 extends School {  //we are giving info to abstract mthd diff from dep2 

	public static void main(String[] args) {

		Dep1 obj = new Dep1();
		obj.admin();// here we are calling non-abstract mthd in school class by calling obj
					// explicity coz we gave info there just we willcall here
		obj.salary();
		obj.classRooms();
		School.bonus();//here we used parent class staticmethod so we have to use parentname.mthd name();
	}

	@Override // here we are using abstractmthds of school class and giving i/p or info to
				// mthds and printing them by creating obj
	void salary() {
		System.out.println("Salary of the teacher is 15000");
	}

	@Override
	void classRooms() {
		System.out.println("Total number of class rooms are 10");

	}

}
 
