package sep4_javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(20);

		for (Integer name : list) { // diff way for printing value
			System.out.println(name);
		}

		list.add(4, null); // adding null
		
		System.out.println("after adding null value");
		Iterator itr = list.iterator();// diff way for printing values
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.remove(3); // removing integer
		System.out.println("after removing value");
		for (int i = 0; i < list.size(); i++) { // general way of printing
			System.out.println(list.get(i));
		}
		System.out.println(list.size()); // to print the size of the values
	}

}
