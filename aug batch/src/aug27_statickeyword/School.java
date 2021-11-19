package aug27_statickeyword;//nested class with static keyword exmple prgrm class with in class is called nested class

public class School {// we cannot use static keyword with parent class we can use only for
						// nestedclass

	public static void main(String[] args) {

		Teacher.abc();// as we used static mthd in nested class we no nedd to create obj just using
						// classname.method name(); we call method here

	}

	static class Teacher {// we used static keyword with class here
		static void abc() {// we used static keyword with method here
			System.out.println("i am from abc method");

		}
	}
}