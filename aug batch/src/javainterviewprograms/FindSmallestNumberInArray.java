package javainterviewprograms;

public class FindSmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = {11,2,3,4,56,7,1};
	int small=a[6];
	for(int i=0;i<a.length;i++) {
		if(a[i]<small) {
			small=a[i];
		}
	}
		
		System.out.println("smallest number is "+small);
	}
}