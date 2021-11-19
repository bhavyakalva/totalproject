package sep3_encapsulation;

public class Company {
	private String carcompanyname;
	private String carname;
	private String remote = "4buttons remote";
	private int carprice = 100000;

	public void setcarcompanyname(String value) {
		carcompanyname = value;
	}

	public void setcarname(String value) {
		carname = value;
	}

	public void setcarprice(int value) {
		carprice = value;
	}

	public String getcarcompanyname() {
		return carcompanyname;

	}

	public String getcarname() {
		return carname;

	}

	public String getremote() {
		return remote;

	}

	public int getcarprice() {
		return carprice;

	}
}
