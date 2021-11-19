package aug26_overridding;

public class LED_TV extends ColorTV {

	public static void main(String[] args) {
		
		LED_TV ledtv = new LED_TV();

		ledtv.volume(); // BWTV
		ledtv.channelChange(); // LED
		ledtv.pictureTube(); // LED
		ledtv.soundSystem(); // LED
		System.out.println("LED TV is ready to use");
	}

	LED_TV() {
		System.out.println("i am creating ledtv");
	}

	void channelChange() {
		System.out.println("Channel change from 1 to 1000 no's");
	}

	void pictureTube() {
		System.out.println("LED TV Monitor");//color tv picture tube overided here 
	}

	void soundSystem() {
		System.out.println("Dolby");
	}

}
