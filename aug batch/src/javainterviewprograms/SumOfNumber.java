package javainterviewprograms;

public class SumOfNumber {

	public static void main(String[] args) {
		int a = 2534;
		int sum = 0;
		while (a > 0) {

			sum = sum + a % 10;
			a = a / 10;
		}
		System.out.println("sum of the number is " + sum);
	}

}
