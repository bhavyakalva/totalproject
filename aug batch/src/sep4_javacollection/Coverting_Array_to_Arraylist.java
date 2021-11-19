package sep4_javacollection;

import java.util.ArrayList;
import java.util.Arrays;

public class Coverting_Array_to_Arraylist {

	public static void main(String[] args) {
		String[] names = { "sony", "nani", "bhavya", "suresh" };
		for(String v:names) {
			System.out.println(v);
		}
		
		
			ArrayList al = new ArrayList(Arrays.asList(names));
			
			for(Object v2:al) {
				System.out.println(v2);
			}
			
		}
	}


