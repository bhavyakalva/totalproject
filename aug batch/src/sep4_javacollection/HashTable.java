package sep4_javacollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "sony");
		ht.put(2, "bhavya");
		ht.put(5, "");
		ht.put(3, "nani");
		ht.put(4, "a");
		ht.put(5, "nani");// in hashtable we can give duplicate values but keys should be unique.

		System.out.println(ht);// prints all values in same line using this sysout
		ht.remove(4);
		// ht.put(null,"chintu"); here we get runtime error that we cannot give key  value as null
		//ht.put(22,null); here also we get runtime error that we cannot give value as null
		ht.put(2, "suresh");// here i am trying to suresh for the same key 2 which i gave already as bhavya  it is not
							// printing both values it is printing the latest value i gave for key 2 which is suresh 
							
// for printing values seprately with in different lines
		Set hp = ht.entrySet(); 
		Iterator itr = hp.iterator();
		while (itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey() + " " + mp.getValue());
		}

	}

}
