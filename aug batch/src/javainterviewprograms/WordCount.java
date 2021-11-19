 package javainterviewprograms;

public class WordCount {

	public static void main(String[] args) {
		String s= "hello welcome to wordcount";
		int count =1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				count ++;
			}
		}
		System.out.println("word count is "+count);
		
	}

}
