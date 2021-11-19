package sep4_javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(11, null);
		hm.put(22, null);
		hm.put(33, null);
		hm.put(34, "sony");
		hm.put(44, "sony");

		System.out.println(hm);
		hm.remove(44); // removing keyvalue and string value using key value
		hm.remove(33);
		hm.put(44, " ");//we can give blank or empty string value also
		// hm.put( , "sony"); but we cannot give empty of blank key
		hm.put(null, "i am from null");
		hm.put(null, "i am from new null");// even if we give two null keys it only takes one null ey that too last one
											// we gave means the i AM FROM NEW NULL it will take as null key
		System.out.println("update printout");
		

		// hashmap printing
		
		Set hp = hm.entrySet(); //hp is name we are giving for setting hashmap
		Iterator itr = hp.iterator();//itr is obj we are giving for iterator 
		while (itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey() + " " + mp.getValue());
		}

	}
}