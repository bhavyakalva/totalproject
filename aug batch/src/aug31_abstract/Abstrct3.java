package aug31_abstract;

public class Abstrct3 extends Abstrct1 {

	public static void main(String[] args) {
		Abstrct3 obj = new Abstrct3();
		Abstrct1.school();
		obj.schooladd();
		obj.branch();
		obj.principalname();
		obj.teachername();

	}

	@Override
	void branch() {
		System.out.println("we have 1 branch at kammam");

	}

	@Override
	void principalname() {
		System.out.println("our principal name is krishna sir");

	}

	@Override
	void teachername() {
		System.out.println("teacher name is radha mam");
	}

	
	}


