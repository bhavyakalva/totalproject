package sep4_javacollection;

import java.util.LinkedList;

public class Linkedlistspecificmethods {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		System.out.println(l);
		
		l.addFirst("firstelement");
		l.addLast("lastelement");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
	}

}
