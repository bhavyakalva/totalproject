package sep4_javacollection;

import java.util.LinkedHashSet;

public class LinkedHashsetdemo {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add('a');
		ls.add("sony");
		ls.add(1);
		ls.add(11.1);
		ls.add("");
		ls.add(true);
		ls.add(null);

		for (Object e : ls) {
			System.out.println(e);
		}

		LinkedHashSet ls2 = new LinkedHashSet();

		ls2.addAll(ls);
		ls2.add("hey");
		ls2.add(false);
		ls2.add(123);

		System.out.println(ls2);
		ls2.remove("");

		System.out.println("after removing empty value " + ls2);
		ls2.removeAll(ls);

		for (Object e : ls2) {
			System.out.println(e);
		}
		System.out.println("checking if ls2 contains ls elements :"+ls2.containsAll(ls));
        ls.retainAll(ls2);
        System.out.println(ls2);
        
	}

}
