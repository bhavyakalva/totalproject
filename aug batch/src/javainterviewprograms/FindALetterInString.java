package javainterviewprograms;

public class FindALetterInString {

	public static void main(String[] args) {
		String s = "sony nani";

		// checking if the word present in given string or not
		System.out.println(s.contains("nani"));

		// finding position of the character
		System.out.println(s.indexOf("a"));

		// finding length of the string
		System.out.println("length of string is " + s.length());

		// finding a letter position from string
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				System.out.println("found i at " + i + " th position");
				break;
			}

		}
		System.out.println(s.charAt(0));

	}

}
