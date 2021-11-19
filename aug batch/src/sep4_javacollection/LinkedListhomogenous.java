package sep4_javacollection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListhomogenous {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("a");
		l.add("b");
		l.add("e");
		l.add("d");
		l.add("c");

		LinkedList<String> l2 = new LinkedList<String>();
		l2.addAll(l);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		Collections.sort(l2, Collections.reverseOrder());
		System.out.println(l2);
		Collections.shuffle(l2);
		System.out.println(l2);
		l2.removeAll(l2);
		System.out.println(l2.isEmpty());
	}

}
