package sep4_javacollection;

import java.util.ArrayList;

import java.util.Collections;

public class Arraylist_homogenousdatayt {// here we used same type of data to do sorting and shuffling and we saw how
											//  to use add all and remove methods

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("c");
		al.add("b");
		al.add("x");
		al.add("y");
		al.add("z");
		// sorting
		Collections.sort(al);
		System.out.println(al);
		// reversing
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		// shuffling
		Collections.shuffle(al);
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<String>();
		// adding all elements from above arraylist
		al2.addAll(al);
		System.out.println(al2);
		// removing all elements from arraylist
		al2.removeAll(al);
		System.out.println(al2);

	}

}
