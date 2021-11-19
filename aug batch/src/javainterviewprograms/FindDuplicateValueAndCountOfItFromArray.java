package javainterviewprograms;

import java.util.ArrayList;

public class FindDuplicateValueAndCountOfItFromArray {

	public static void main(String[] args) {
		int[] n = { 22, 3, 1, 4, 2, 1, 4, 5, 7 };

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < n.length; i++) {

			if (!a.contains(n[i])) {
				a.add(n[i]);
				for (int j = i + 1; j < n.length; j++) {
					if (n[i] == n[j]) {
					}

				}

			}
		}
		System.out.println(a);
	}

}
