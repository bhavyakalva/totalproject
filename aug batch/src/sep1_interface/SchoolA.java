package sep1_interface;

public interface SchoolA {
	default void SchoolName() {
		System.out.println("Geethanjali Public School");
	}

	void classRoomsForPrimaryStudents();

	void staffRoom();

}
