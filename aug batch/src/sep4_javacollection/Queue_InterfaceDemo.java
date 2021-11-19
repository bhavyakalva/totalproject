package sep4_javacollection;

import java.util.PriorityQueue;

public class Queue_InterfaceDemo {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();

		// for adding we can use add() and offer() methods
		p.add("a");
		p.offer("b");
		p.add("c");
		p.add("d");
		p.offer("e");
		

		System.out.println(p);

		// for getting head element from queue element() and peek() methods

		// System.out.println(p.element());
		System.out.println(p.peek());
		
		

		// for getting and removing element from remove() and poll() methods
		// System.out.println(p.remove());
		System.out.println(p.poll());
		System.out.println(p);

	}

}
