package sep3_encapsulation;

public class School {
	private String studentschool="Greenwood high school";
	private String studentname;
	private int studentrollno;
	private String studentclass;
	private int studentfee;
	
	
	public void setstudentname(String value) {
		studentname=value;
	}
	public void setstudentrollno(int  value) {
		 studentrollno=value;
		}
	
	public void	setstudentclass (String value) {
		studentclass=value;
		}
		
	public void setstudentfee(int  value) {
		 studentfee=value;
	}
	
	
	public String getstudentschool() {
		return studentschool;
		
	}
	public String getstudentname() {
		return studentname;
		
	}
	public int getstudentrollno() {
		return studentrollno ;
		
	}
	public String getstudentclass () {
		return studentclass ;
		
	}
	public int getstudentfee () {
		return studentfee;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
