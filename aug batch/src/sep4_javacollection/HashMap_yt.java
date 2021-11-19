package sep4_javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_yt {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "sony");
		m.put(102, "nani");
		m.put(103, "chintu");
		m.put(null, "amma");
		m.put(104, "saibaba");
		m.put(105, "krishna");
		m.put(106, "krishna");
		m.put(107, null);
		m.put(108, " ");

		Set s = m.entrySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			Map.Entry mm=(Entry) itr.next();
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		m.remove(107);
		
		for (Map.Entry mm : m.entrySet()) {
			System.out.println(mm.getKey() + " " + mm.getValue());
		}
		System.out.println(m.containsKey(107));
		System.out.println(m.containsValue(" "));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(Object hh: m.keySet())//here we are giving keyset to hh 
		{
			System.out.println(hh+ " "+m.get(hh));//here uf we give key it prints values so we gave first hh it prints key
			                                       //then we gave get(hh) it prints the values this way we can print both keys and values
		}
		
		HashMap<Integer, String> m2 = new HashMap<Integer, String>();

		m2.putAll(m);
		for (Map.Entry mm : m2.entrySet()) {
			System.out.println(mm.getKey() + " " + mm.getValue());
		}
		m2.clear();
		System.out.println(m2);
		System.out.println(m2.isEmpty());
	}

}
