package sep2_Arrays;

public class Teacher {

	public static void main(String[] args) {
		String[] Teachernames = { "sony", "nani", "bhavya", "suresh" };// it is one way to write string names in array
		System.out.println(Teachernames.length);// to print total no of string names in array we use stringname.length
		
		String[] names = new String[5];// this another way to write string names in array here we can give limitation
										// of writing stringnames by using new string[]
		names[0] = "sony";
		names[1] = "nani";
		names[2] = "bhavya";
		names[3] = "suresh";
		names[4] = "sona";
		System.out.println(names.length);// to print total no of string names in array we use stringname.length
		
		for (int i = 0; i < names.length; i++) {// to print all string names in array
			System.out.println(names[i]);

		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].toUpperCase());// to print all string names in capital letters we used
														// strngname.touppercase().

		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].toLowerCase());// to print all string names in small letters we used
														// strngname.tolowercase().
		}
		System.out.println(names[0]);
		
	}
}

