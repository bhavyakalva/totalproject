package sep1_interface;

public interface RBI {
	abstract void interest();

	abstract void homeinterest();

	abstract void loaninterest();

	default void dispaly() { // this is a default method it cannot implemented in class but it can call using
								// obj in o/p we get this default mthd
		System.out.println("i am prime to all banks i.e RBI");
	}
}
