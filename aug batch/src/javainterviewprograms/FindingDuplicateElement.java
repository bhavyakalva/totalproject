package javainterviewprograms;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateElement {

	public static void main(String[] args) {
		int a[]= {2,3,1,2,55,3,6,7};
		System.out.println("duplicate elements are ");
		Set <Integer> s = new HashSet<Integer>();
		for(int v:a) {
			if(s.add(v)==false)
			{
				System.out.println(v+"");
			}
		
		}
	}

}
