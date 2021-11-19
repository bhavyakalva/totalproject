package javainterviewprograms;

public class FactorialOfNumber {// Factorial of n is the product of all positive descending integers. Factorial
								// of n is denoted by n!. For example: 4! = 4*3*2*1 = 24.

	public static void main(String[] args) {
	int num=4;
	int fact =1;
	for (int i=1;i<=num;i++) {
		fact = fact * i;
		
	}
	System.out.println(fact);
	
		
	}
}