package sep4_javacollection; //we use hashmap frequently used in real time 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap { // in hashmap we have to give index values and keys(datatype)
						// values also in hashmap
						// hashmap dont have any insertion order anynum or any value we can give and we
						// can give only one
						// null key and multiple null values and multiple same values but unique key values
						
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(25, "sony"); // here we use hashname.put to give values
		hs.put(29, "nani");
		hs.put(225, "sonani");
		hs.put(1, "baba");
		hs.put(22, null);
		System.out.println(hs);// print all values in same line
		System.out.println(hs.size());// print size of all values

		hs.put(null, "i have one null key");// we can give only one null key in hashmap
		hs.put(null, "i have nullkey and i'm from new null");// even we give n number of null key it takes only one that
																// too from last null key we gave
		hs.put(1, null); // we can give multiple null values in hashmap
		hs.put(2, null);
		hs.put(22, " ");// we can give blank or empty string values but we cannot give empty key

		System.out.println(hs);

		System.out.println("after removing value");
		hs.remove(22); // to remove values we have to give keysi.e inetegers.
		System.out.println(hs);
		
	
		//other way for printing hashmap..
		Set hp = hs.entrySet(); //hp is name we are giving for setting hashmap
		Iterator itr = hp.iterator();//itr is obj we are giving for iterator 
		while (itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey() + " " + mp.getValue());

	}

}}
