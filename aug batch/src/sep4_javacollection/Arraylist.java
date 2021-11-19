package sep4_javacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sony");
		list.add("nani"); 
		list.add("suresh");
		list.add("bhavya");
		list.add("chintu");
		list.remove(4);
		
		System.out.println("after replacing the value"); // to print values 
    	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		System.out.println(list.size());  //to print the size of values
		
		list.add("chintu");
		list.add(5, "");// we can add empty value by providing key 
		list.add(6, null); // we can add null values 
		
		System.out.println("after adding the value");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  //->this is one of the way for printing values
			
		}
		}
		
		
//		System.out.println(list); general way of printing it prints name side by side
	
//	   System.out.println(list.get(2));//to print particular value we use arraylistname.get()
			
//			Iterator itr=list.iterator();
//			while(itr.hasNext()) {
//				System.out.println(itr.next());  ->this is one way for printing values
//			}	
			
			
//			for(String name:list) {
//				System.out.println(name);   -> this is another way for prinring values 
//			}
		
		
		
		
	}

