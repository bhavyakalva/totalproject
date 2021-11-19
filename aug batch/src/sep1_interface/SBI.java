package sep1_interface;

public class SBI implements RBI {// a interface and class cannot extend but we can use implement and we can
									// implement the abstract mthds of the interface in class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI();
		obj.dispaly();// RBI default method can accessed in SBI as we used implement we access
						// bycalling explicitly using obj
		obj.interest();
		obj.homeinterest();
		obj.loaninterest();

	}

	@Override
	public void interest() {
		System.out.println("Interest for fix deposite is 4% ");

	}

	@Override
	public void homeinterest() {
		System.out.println("home loan interest is 6.95% ");
	}

	@Override
	public void loaninterest() {
		System.out.println("home loan interest is 10.5% ");

	}
	
}
