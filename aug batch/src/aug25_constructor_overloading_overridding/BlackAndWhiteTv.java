package aug25_constructor_overloading_overridding;

public class BlackAndWhiteTv{

	public static void main(String[] args) {
		
		 BlackAndWhiteTv obj = new BlackAndWhiteTv();
		obj.volume();
		obj.channelChange();
		obj.pictureTube();
		System.out.println("Black and White TV Creation is done");
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
