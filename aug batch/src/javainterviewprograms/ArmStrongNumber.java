package javainterviewprograms;

public class ArmStrongNumber {// An Armstrong number is a number which equals to the sum of the cubes of its
								// individual digits. For example, 153 is an Armstrong number as − 153 = (1)3 +
								// (5)3 + (3)3 153-> 1 + 125 + 27 = 153.

	public static void main(String[] args) {
		int n = 153;
		int norg = n;
		int temp;
		int sum = 0;

		while (n > 0) {
			temp = n % 10;
			sum = sum + (temp * temp * temp);
			n = n / 10;

		}
		System.out.println(sum);
		if (norg == sum) {
			System.out.println("its a armstrong number");
		} else {
			System.out.println("its not a armstrong number");
		}

	}
}
