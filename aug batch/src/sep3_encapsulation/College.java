package sep3_encapsulation;

public class College {
	private String studentname;
	private String studentbranch="cse";
	private String studentcollege;
	
	public void setstudentname(String value) {
		studentname=value;
	}
	public void setstudentcollege(String value) {
		studentcollege=value;
	}
	public String getstudentname() {
		return studentname;
		
	}
	public String getstudentbranch() {
		return studentbranch;
		
	}
	public String getstudentcollege() {
		return studentcollege;
		
	}
	
	
	
	
	

}
