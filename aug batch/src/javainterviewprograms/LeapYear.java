package javainterviewprograms;

public class LeapYear {

	public static void main(String[] args) {
		// leap year should divide by 4(year%4==0), 400(year%400==0) and should not divided by 100(year100!=0)
	
		int year = 2016;
		if (year % 4 == 0) {
			System.out.println("it is a leap year");
		} else {
			System.out.println("it is not a leap year");

		}
	}
}
