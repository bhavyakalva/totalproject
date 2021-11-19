package aug25_constructor_overloading_overridding;

public class Student {// method overloading

	public static void main(String[] args) {// in method overloading method name can be anything but all methods names  should be same 
										// method name may or may not be same as class name and the parameters must be different
										// diff between constructor overloading and method overloading is in method  overloading we
		                               // have to create obj to call methods and method names can be anything
		Student obj = new Student();
		obj.studentInfo();
		obj.studentInfo(123);
		obj.studentInfo("sony");
		obj.studentInfo("hyd", "hyd");
		obj.studentInfo(70, 100);

	}

	void studentInfo() {
		System.out.println("she is studying btech");

	}

	void studentInfo(int rollNo) {
		System.out.println("student roll no is " + rollNo);

	}

	void studentInfo(String name) {
		System.out.println("student name is " + name);

	}

	void studentInfo(String studentAddress, String Dist) {
		System.out.println("student address is " + studentAddress + " and distict is also " + Dist);

	}

	int studentInfo(int marks, int marks2) {
		System.out.println("student marks of first sub marks " + marks);
		System.out.println("student marks of secound sub marks " + marks2);

		return marks;
	}

}
