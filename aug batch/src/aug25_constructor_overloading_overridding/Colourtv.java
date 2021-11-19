package aug25_constructor_overloading_overridding;//methodoverriding 

public class Colourtv extends BlackAndWhiteTv {// method overriding here parent class method name and child class method names should be same  here 
//we are using inheritance & declaring the blacknwhitetv methods &we overriding black&whitetv picturetube with colourtv it is called methodoverriding

	public static void main(String[] args) {
		Colourtv ctv = new Colourtv();
		ctv.volume();
		ctv.channelChange();
		ctv.pictureTube();

	}

	void pictureTube() {
		System.out.println("Color TV picture tube");
	}

}
