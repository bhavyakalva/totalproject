package sep4_javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("sony");
		list.add("nani");
		list.add("sona");
		Iterator itr =list.iterator();//diff way to printing values 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list.size()); //to print size of the values 
		
		list.add(3, "bhavya");
		list.add("baba");
		System.out.println("after adding values");
		for(int i=0; i<list.size();i++) {//regular way to print values 
			System.out.println(list.get(i));
		}
		
      System.out.println("after adding empty value");
		list.add(4," ");
		for(String name:list) {         // diff way to print values 
			System.out.println(name);
		}
		
		
	}

}
