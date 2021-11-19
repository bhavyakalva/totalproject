package aug19;

public class Forloopwithcontinue {

	public static void main(String args[]) {
		for(int i=1; i<=20; i++) {
			if(i==5 || i==10 ||i==15 ) {
				continue;
			}
			System.out.println(i);
			}
		int table =5;
		
		for(int i=1; i<=10; i++) {
			if(i==5 || i==6 ) {
				continue;
			}
			System.out.println(table*i);
		}
		
		for(int i=10; i>=1; i--) {
			if(i==2|| i==1) {
				continue;
			}
		System.out.println(i);
		
			}
		}
	}
	


