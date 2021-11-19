package aug16;

public class Nestedif {

	public static void main(String[] args) {

		int marks = 70;
		if (marks >= 35 && marks <= 100) {
			if (marks >= 60) {
				System.out.println("grade a");
			}
			if (marks >= 50 && marks <= 59) {
				System.out.println("grade b");
			}
			if (marks >= 35 && marks <= 49) {
				System.out.println("grade c");
			}
		} else {
			System.out.println("failed");

		}

	}
}
