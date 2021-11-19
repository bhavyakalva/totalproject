package javainterviewprograms;

public class SumOfArray {

	public static void main(String[] args) {
	int a[]= {2,5,6,4,7,9};
	int sum=0;
	for(int i=0;i<a.length;i++ ) {
		sum=sum+a[i];
		}
	System.out.println(sum);
		
		//enhanced for loop 
		/*for(int value:a) {
			sum = sum+value;
			}
		System.out.println(sum);*/
		
}
}