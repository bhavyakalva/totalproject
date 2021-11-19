package sep25_TestNG_parameters;

import org.testng.annotations.Test;

public class Dataprovider_using_customDataprovider {
  @Test(dataProvider="d",dataProviderClass = CustomDataprovider.class)
  public void f(String email,String pass) {
	  
  }
}
