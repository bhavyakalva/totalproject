package aug30_thisandfinalkeyword;

public class BlackAndWhiteTv { // if we use final keyword before this class it cannot be accesed by colour tv
	String tvName = "Sony";

	public static void main(String[] args) {

		BlackAndWhiteTv obj = new BlackAndWhiteTv();
		obj.volume();
		obj.channelChange();
		obj.pictureTube();
		System.out.println("Black and White TV Creation is done");

	}

	final void volume() {
		System.out.println("Volume up and down + -");

	}

	void channelChange() {
		System.out.println("Channel change from 1 to 100nos");
	}

	void pictureTube() {
		System.out.println("Black and White Picture Tube");
	}

}
