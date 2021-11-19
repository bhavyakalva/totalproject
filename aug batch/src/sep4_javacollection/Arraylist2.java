package sep4_javacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> num =new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(40);
		num.add(50);
		
		num.remove(2);         //removing value
		System.out.println("after removing value");
		Iterator itr = num.iterator();      //one way for printing value
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		num.add(null);
		System.out.println("after adding num value");
		for(int i=0;i<num.size();i++) {      //regular way for printing value
			System.out.println(num.get(i));
		}
		
		
		
//		System.out.println(list); general way of printing it prints name side by side
		
//		   System.out.println(list.get(2));//to print particular value we use arraylistname.get()
				
//				Iterator itr=list.iterator();
//				while(itr.hasNext()) {
//					System.out.println(itr.next());  ->this is one way for printing values
//				}	
				
				
//				for(String name:list) {
//					System.out.println(name);   -> this is another way for prinring values 
//				}
			
			
		
		
		
		
		
		
		
		
		
		
	}

	
}
