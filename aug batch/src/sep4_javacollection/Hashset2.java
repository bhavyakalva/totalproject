package sep4_javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 { // we dont use much this hashset

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();// in hashset values will get print randomly
		str.add("sony");
		str.add("nani");
		str.add("bhavya");
		str.add(null); // we can give null value only once in hashset
		str.add("suresh");
		

		for (String name : str) {
			System.out.println(name);// it will print all values randomly
		}
		System.out.println("secound printer");
		str.add("baba");
		str.add(" ");
		Iterator itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
