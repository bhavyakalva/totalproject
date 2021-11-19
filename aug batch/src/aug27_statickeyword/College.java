package aug27_statickeyword;//here we learn how to use statickeyword to variable and methods why we use 

public class College {
	public static String collegename = "mallareddy college of engineeering";
	 String address = "kompally";

	public static void main(String[] args) {
		
		College obj = new College();
		obj.studentInfo(1, "sony", "cse");
		obj.studentInfo(2, "nani", "eee");
		obj.studentInfo(3, "sona", "mech");// as we used static before variable college name we no need to write college
											// name here in objects it automaticaly prints in o/p
		obj.studentInfo(4, "sai", "it");

		College.Teacher();// here can call method with obj.teacher also but as we used static method so we
							// have used classname.methodname();

	}

	 void studentInfo(int rollNo, String name, String branch) {
		System.out.println("Student Roll No " + rollNo);
		System.out.println("Student Name " + name);
		System.out.println("Student branch " + branch);
		System.out.println("College name " + College.collegename);// here we can write +college name or
																	// college.collegename both are correct
		System.out.println("College address " + address);
	}

	public static void Teacher() {// we used static method here so that we no need to call obj explicitly we can call it by 
		//using classname.methdname
		System.out.println("Total number of staff is 10");
	}

	
}
