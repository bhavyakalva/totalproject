package javainterviewprograms;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		//other way 
		/*StringBuffer sb= new StringBuffer(s);
		StringBuffer rev  = sb.reverse();
		System.out.println(rev);*/
	}

}
