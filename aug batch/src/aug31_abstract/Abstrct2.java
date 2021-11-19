package aug31_abstract;

public class Abstrct2 extends Abstrct1 {

	public static void main(String[] args) {
		Abstrct2 obj = new Abstrct2();
		Abstrct1.school();
		obj.schooladd();
		obj.branch();
		obj.principalname();
		obj.teachername();
		

	}

	@Override
	void branch() {
		System.out.println("we have 1 branch at hasanparthy");

	}

	@Override
	void principalname() {
		System.out.println("our principal name is bharthwaj sir");

	}

	@Override
	void teachername() {
		System.out.println("teacher name is preety mam");

	}

	}


