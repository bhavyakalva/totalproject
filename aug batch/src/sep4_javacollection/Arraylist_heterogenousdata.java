package sep4_javacollection;//in arraylist we can have homogenous data and heterogenius data to have same kind of data we have to use 
//ArrayList<String> list = new ArrayList<String>(); we hav eto give like this with the data type you want tot store to have diff type of data which is
//heterogenousdata then we have to give Arraylist al = new Arraylist();

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_heterogenousdata {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(100);
		al.add("string");
		al.add(11.1);
		al.add('a');
		al.add(true);
		al.add(null);
		// System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}//size
		System.out.println("number of elements in arraylist " + al.size());
		//remove
		al.remove(1);
		//al.remove("string"); we can remove element by giving the index number or directly we can give the element 
		
		System.out.println("number of elements in arraylist after removing element " + al.size());
		//adding element
		al.add(3, "java");
		System.out.println("after insertion "+al.size()+al);
		//retreive specific element
		System.out.println(al.get(2));
		//change the element/replace
		System.out.println("element after changing "+al.set(3,"java script")+al);
		//checking if element present or not 
		System.out.println(al.contains("java script"));
		//cheching arraylist is empty or not
		System.out.println(al.isEmpty());
		//for loop
		/*for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		//for each loop
		/*for(Object e :al) {
			System.out.println(e);
		}*/
		Iterator itr1 =al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}
	}

