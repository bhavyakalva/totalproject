package aug30_thisandfinalkeyword;

public class Colourtv extends BlackAndWhiteTv {// we will get error here if we use final keyword before blacknwhitetv
												// class
	public static void main(String[] args) {

		Colourtv ctv = new Colourtv();
		ctv.volume();
		ctv.channelChange();
		ctv.pictureTube();
		ctv.display();

	}

	void pictureTube() {
		System.out.println("Color TV picture tube");

	}
	// void volume() {
	// System.out.println("Volume up and down + -"); // we are getting error becoz
	// we used final keyword to the volume method in
	// blackand white tv wecannot use volume method in colour tv
	// }

	void display() {
		System.out.println("Name of the TV is " + tvName);
	}
}
