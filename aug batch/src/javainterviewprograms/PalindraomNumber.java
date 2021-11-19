package javainterviewprograms;

public class PalindraomNumber {

	public static void main(String[] args) {
		int num = 121;
		int norg = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;

			num = num / 10;
		}
		System.out.println(rev);
		if (norg == rev) {
			System.out.println("it is a palindrom");
		} else {
			System.out.println("it is not  a palindrom");
		}
	}
}
