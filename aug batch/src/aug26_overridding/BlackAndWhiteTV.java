package aug26_overridding;

public class BlackAndWhiteTV {

	String tvName = "Sony BW";
	String remote = "1 to 100 channel capacity";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackAndWhiteTV obj = new BlackAndWhiteTV();
		obj.volume();
		obj.channelChange();
		obj.pictureTube();
		System.out.println("Black and White TV Creation is done");
	}

	BlackAndWhiteTV() {
		System.out.println("I am creating BW TV");
	}

	void volume() {
		System.out.println("Volume up and down + -");
	}

	void channelChange() {
		System.out.println("Channel change from 1 to 100nos");
	}

	void pictureTube() {
		System.out.println("Black and White Picture Tube");
	}

}
