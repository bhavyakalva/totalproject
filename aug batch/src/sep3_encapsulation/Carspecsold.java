package sep3_encapsulation;

public class Carspecsold {

	public static void main(String[] args) {
		String carcompanyname;
		String carname;
		String remote;
		int carprice;

		Company car = new Company();
		car.setcarcompanyname("suzuki");
		car.setcarname("xuv500");
		car.setcarprice(2000000);

		carcompanyname = car.getcarcompanyname();
		carname = car.getcarname();
		carprice = car.getcarprice();
		remote = car.getremote();
		System.out.println("name of the company is " + carcompanyname + " carname is " + carname + " carprice "
				+ carprice + " carremote" + remote);

		car.setcarcompanyname("suzuki");
		car.setcarname("xuv800");
		car.setcarprice(5000000);

		carcompanyname = car.getcarcompanyname();
		carname = car.getcarname();
		carprice = car.getcarprice();
		remote = car.getremote();
		System.out.println("name of the company is " + carcompanyname + " carname is " + carname + " carprice "
				+ carprice + " carremote" + remote);

		car.setcarcompanyname("suzuki");
		car.setcarname("alto");
		car.setcarprice(100000);

		carcompanyname = car.getcarcompanyname();
		carname = car.getcarname();
		carprice = car.getcarprice();
		remote = car.getremote();

		System.out.println("name of the company is " + carcompanyname + " carname is " + carname + " carprice "
				+ carprice + " carremote" + remote);

	}
}
