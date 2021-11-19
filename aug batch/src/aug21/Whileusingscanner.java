package aug21;

import java.util.Scanner;

public class Whileusingscanner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number");
	
		int x=1;
		int y = input.nextInt();
		while (x <= y) {
			System.out.println(x + " hello sony");
			x++;

		}
	}

}
