package sep1_interface;            //here we are doing multiple inheritance with interfaces 

public class MainSchool implements SchoolA,SchoolB{ //here we can implement both SchoolA&SchoolB interfaces in one class means one class can access - 
                                                   // both SchoolA and SchoolB interfaces. multiple inheritance is done here one class accessed -
	public static void main(String[] args) {       // two interfaces here.

         MainSchool obj= new MainSchool();
         obj.SchoolName();
         obj.staffRoom();
         obj.adminRoom();
         obj.classRoomsForPrimaryStudents();
         obj.classRoomsForHigherStudents();
	}

	@Override
	public void classRoomsForHigherStudents() {
		System.out.println("I to V");
		
	}

	@Override
	public void adminRoom() {
		System.out.println("this is Admin Room");
		
	}

	@Override
	public void classRoomsForPrimaryStudents() {
		System.out.println("VI to X");
		
	}

	@Override
	public void staffRoom() {
		System.out.println("this is staff room");
		
	}

}
