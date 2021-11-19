package javainterviewprograms;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 11, 2, 3, 4, 56, 7, 1 };
		int large = a[5];
     for(int i=0;i<a.length;i++) {
		if(a[i]>large) {
        large=a[i];
		}}
		System.out.println("large number is " + large);
	}

}
