package aug31_abstract;

public class Dep2 extends School {//here we are giving diff info to abstract mthd diff from dep1  

	public static void main(String[] args) {
		 Dep2 obj=new  Dep2();
		 obj.admin();
		 obj.salary();
		 obj.classRooms();
		 School.bonus(); //here we used parent class staticmethod so we have to use parentname.mthd name();
	}

	@Override
	void salary() {
		System.out.println("Salary of Admin staff is 8000");
		
	}

	@Override
	void classRooms() {
		System.out.println("Total number of class rooms are 10");
	}

}
