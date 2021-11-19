package aug27_statickeyword;//here we learn how to access college class static methods&variables  withoutcreating object of the college class

public class Student {

	public static void main(String[] args) {
	
		System.out.println("college name is " + College.collegename);// here without create college class obj we used
																		// college class variable here-
																		// as we used static before variable with out
																		// creating college class obj we can access-
																		// just by using classname.variablename

		College.Teacher();// here we can access college class method without crtng obj as we used static
							// before the method in college class we just use classname.methodname();here

	}
}
