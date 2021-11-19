package aug24;

public class Child1 extends Parent {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.flat();
		c1.bike();
		c1.house();
		c1.land();
		c1.car();

	}
	void flat(){
		System.out.println("2bhk flat");
	}
	
	void bike() {
		System.out.println("Pulser bike");
	}
	
}
