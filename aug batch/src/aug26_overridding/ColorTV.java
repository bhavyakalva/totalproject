package aug26_overridding;//method overriding

public class ColorTV extends BlackAndWhiteTV {

	public static void main(String[] args) {

		ColorTV ctv = new ColorTV();
		ctv.volume();// b/w
		ctv.channelChange();// b/w
		ctv.pictureTube();// colour
		System.out.println("Color TV creation is done");
	}

	ColorTV() {
		System.out.println("I am creating the ColorTV");
	}

	void pictureTube() {
		System.out.println("Color TV picture tube");

	}

}
