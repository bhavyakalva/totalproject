package sep4_javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistheterogenous {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("list");
		l.add('a');
		l.add(1);
		l.add(null);
		l.add(1.1);
		l.add("");
		l.add(null);

		System.out.println(l);
		l.remove(4);
		System.out.println("after removing the value "+l);
		System.out.println(l.get(4));
		System.out.println(l.contains(null));
		System.out.println(l.contains("list"));
		System.out.println(l.contains("java"));
		l.set(4,"heyy");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(l.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
