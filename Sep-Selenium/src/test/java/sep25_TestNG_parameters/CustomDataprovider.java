package sep25_TestNG_parameters;

import org.testng.annotations.DataProvider;

public class CustomDataprovider {

	@DataProvider()
	public Object[][] d() {
		return new Object[][] { new Object[] { "abc@gmail.com", "abc" }, new Object[] { "xyz@gmail.com", "xyz" },
				new Object[] { "mno@gmail.com", "mno" } };
		
				
				
				
		
	}
}
