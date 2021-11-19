package javainterviewprograms;

public class FindANumberInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int p = 3;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == p) {

				System.out.println("found element at " + i + " position");

				break;
			} else {
				System.out.println("not found at : " + i);
			}
		}

	}

}
