package sep2_Arrays;

public class Student {

	public static void main(String[] args) {
		int[] stumarks = { 91, 92, 93, 94, 95, 96 };// array values start from 0 to n...
		
		System.out.println(stumarks[0]);// as it start from 0 if we print 0 first integer gets prints
		System.out.println(stumarks[2]);
		System.out.println(stumarks.length);// total no of integers there in array prints with integername.length

		for (int i = 0; i < stumarks.length; i++) {
			System.out.println(stumarks[i]);// to print all integers in array we used for loop 
		}

		for (int i = stumarks.length-1; i >= 0; i--) {// here we can't use intname.length directly because in array
														// int length is 6 as array start from 0 so if
														// we count from 0 we have 5 values here so it can't
														// execute intname.lenght we have to use intname.length-1
														// then it will become 5 and we can execute integers in array
														// to print all integers in array in decending order
			System.out.println(stumarks[i]);
		}
		int totalstumarks = 0; // to print totalmarks of student
		for (int i = 0; i < stumarks.length; i++) {
			totalstumarks = totalstumarks +stumarks[i];// take first totalstumarks as 0 and the do addition with stumarks
														// stumarks
														// it will be like 0=0+91->91
														// 91=91+92->183 so on it will add from 0 with array integers till
														// last array int
		}
		System.out.println("total marks of student is " + totalstumarks);

		int[] amarks = { 1, 2, 3, 4 };
		int c = 1;
		for (int i = 0; i < amarks.length; i++) {// multiplication of integers in array
			c = c *amarks[i];
		}
		System.out.println("total marks of student is " + c);
	}

	
	
	
	
	
	
	
	
	
	

}
