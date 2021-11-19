package javainterviewprograms;

public class Find2ndLargestNumberfromArray {

	public static void main(String[] args) {
		int a[] = { 2, 33, 4, 2, 5, 6, 110, 67, 89, 3 };
		int largenumber = 0;
		int secoundlargenumber = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largenumber) {
				secoundlargenumber = largenumber;
				largenumber = a[i];
			} else if (a[i] > secoundlargenumber) {
				secoundlargenumber = a[i];

			}
		}
		System.out.println("largest number is " + largenumber);
		System.out.println("secoundlargest number is " + secoundlargenumber);
	}

}
