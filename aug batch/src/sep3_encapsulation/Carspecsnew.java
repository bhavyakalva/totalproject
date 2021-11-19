package sep3_encapsulation;

public class Carspecsnew {
	Company car; // here we created the object of the company in the instance variable level
					// because we can use it in all methods if we create in main
					// method we can only access in main method so we created obj her in the instancelevel
			

	public void car() {
		car = new Company(); // here we assigned the value for the obj we created in instance variable simple
		car.setcarcompanyname("suzuki");
		car.setcarname("xuv500");
		car.setcarprice(3000000);
		display();

		car.setcarcompanyname("suzuki");
		car.setcarname("alto");
		car.setcarprice(100000);
		display();

		car.setcarcompanyname("suzuki");
		car.setcarname("xuv800");
		car.setcarprice(500000);
		display();

	}

	public static void main(String[] args) {
		Carspecsnew car = new Carspecsnew();
		car.car();
	}

	public void display() {
		String carcompanyname = car.getcarcompanyname();
		String carname = car.getcarname();// with help of the car we created in instance variable we are calling the get
											// methods here
		String remote = car.getremote();
		int carprice = car.getcarprice();
		System.out.println("name of the company is " + carcompanyname + ". name of the car" + carname
				+ ". car price is " + carprice + ". car remote  " + remote);

	}
}
