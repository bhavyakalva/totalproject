package aug26_overridding;

public class LED_TV_LowCost extends ColorTV {// we used super key in this prgrm

	String tvName = "Sony LED TV LC";// <- it is instance variable just remember
	String remote = "1 to 1000 channel capacity";

	public static void main(String[] args) {

		LED_TV_LowCost ledtv = new LED_TV_LowCost();

		ledtv.volume(); // BWTV

		ledtv.pictureTube(); // LED
		ledtv.soundSystem(); // LED
		System.out.println("LED TV is ready to use");
	}

	LED_TV_LowCost() {// we used constructor here and parent constructor will also automatically print-
						// in output
		System.out.println("I am creating the LED_TV_LC ");
	}

	void channelChange() {
		System.out.println("Channel change from 1 to 1000 no's");
	}

	void pictureTube() {
		System.out.println("LED TV Monitor");
	}

	void soundSystem() {
		System.out.println("Dolby");
		super.channelChange();// here we used super keyword and called immediate parent method as colourtv-
								// don't have channel it calling b/wtv channel
		System.out.println("Name of the TV is " + tvName);// we are using this line to print the instance variable above-
															// the main method
		System.out.println("Remote " + super.remote);// b/w //here weused super key and used instance variable of b/w tv class-
														// as colour tv dont have instance var it used b/w instance variable 

	}

}
 