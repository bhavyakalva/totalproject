package sep4_javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue_InterfaceDemo2 {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		// for adding we can use add() and offer() methods
		l.offer(1);
		l.add(1.1);
		l.offerFirst(0);
		l.addLast(null);
		l.add("sony");
		System.out.println(l);
		
		// for getting head element from queue element() and peek() methods
		
		//System.out.println(l.element());
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		// for getting and removing element from remove() and poll() methods
		
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
