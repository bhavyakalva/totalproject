package javainterviewprograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("value of a is "+ a+ " and value of b is "+b+ " before swapping");
		
		//using single statement
		b=a+b-(a=b);
		
		
		System.out.println("value of a is "+ a+ " and value of b is "+b+ " After swapping");
		
		//logic using third variable
		int aa=20;
		int bb=10;
		int c;
		System.out.println("value of aa is "+ aa+ " and value of bb is "+bb+ " before swapping");
		c=aa;
		aa=bb;
		bb=c;
		System.out.println("value of aa is "+ aa+ " and value of bb is "+bb+ " After swapping");
		
		//logic using + and - without using third variable 
		
		int x=10;
		int y=20;
		System.out.println("value of x is "+x+ " and value of y is "+y+ " before swapping");
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x is "+x+ " and value of y is "+y+ " After swapping");
		
		
		
		
		
		
}
}