package javainterviewprograms;

public class PalindromString {

	public static void main(String[] args) {
		String  s ="madam";
		String sorg=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		if(sorg.equals(rev)) {
			System.out.println(sorg+" it is a palindrom");
		}
			else {
				
				System.out.println(sorg+" it is not a palindrom");
			}
		}
		
		
		
		
		
		
		
		
	
}
