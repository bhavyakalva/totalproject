package Sep_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Emp {
  @Test(priority=1)
  public void empname() {
	  System.out.println("employee name is abc");
  }
  @Test(priority=2)
  public void empname2() {
	  System.out.println("employee name is abcd");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }
	@BeforeMethod 
	public void beforeMethod() {
		
		System.out.println("i am from before method");
	}

	@AfterMethod 
	public void afterMethod() {
		
		System.out.println("i am from after method");
	}

  
  
}
