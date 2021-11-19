package aug31_abstract;

public abstract class School {// this is abstract class
	public static void main(String[] args) {// we can create psvm method but cannot create objects in abstract class
		School.bonus();// as bonus method is static we can print it without create class name so we can use
						// with classname.mthdname hence it is accepted in abstract class
		System.out.println("i am from main method");// we can write anything in main mthd it prints automatically without
													// creating obj
	}

	abstract void salary();// this is abstract method

	abstract void classRooms();

	void admin() { // this is non abstract method
		System.out.println("i am from admin");
	}

	School() { // we can create constructors in abstract class
		System.out.println("i am from School class constructor");
	}

	static void bonus() { // we can create static methods in abstrct class
		System.out.println("Yearly bonus is 20000");

	}
}

//here the abstract and non abstract methods are accessed in other class and we are creating obj there and giving info there and printing this
//methds over there 

// we can see thet dep1 dep2 usung abstract mthds but the nfo we are givinh are diff in realtime we use this if we have diff clients
//& they want diff info we use this abstraction in java dep1 extends school and use abstrctmthd and give info differently and 
//dep2 extends school and use abtract mthds and give info differently
