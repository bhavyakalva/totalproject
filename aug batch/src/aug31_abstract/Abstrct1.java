package aug31_abstract;



public abstract class Abstrct1 {
	public static void main(String[] args) {
		Abstrct1.school();
		System.out.println("i am from main method");
	}

	Abstrct1() {
		System.out.println("i am from Abstrct constructor class ");
	}

	static void school() {
		System.out.println("school name is greenwood");
	}

	void schooladd() {
		System.out.println("school address is warangal");
	}

	abstract void branch();

	abstract void principalname();

	abstract void teachername();
	
	
   
}
