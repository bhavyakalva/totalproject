package aug30_thisandfinalkeyword;

public class School {

	public static void main(String[] args) {

		School sch = new School();
		sch.display();
	}

	void display() {
		final String schoolName = "Geethanjali High School";

		System.out.println("Name of the school is " + schoolName);

		// schoolName = "Greenwood high school";->as we used final keyword before
		// instance variable we cannot change the string value

		// System.out.println("Name of the school is " + schoolName);

	}

}
