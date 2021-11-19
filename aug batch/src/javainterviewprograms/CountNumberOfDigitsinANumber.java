package javainterviewprograms;

public class CountNumberOfDigitsinANumber {

	public static void main(String[] args) {

		int n = 23486980;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		System.out.println("number of digits in n is " + count);

	}
}
