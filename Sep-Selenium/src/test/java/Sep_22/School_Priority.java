package Sep_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class School_Priority {
	@Test(priority=1)
	public void student1() {
		System.out.println("student name is nani");
	}
	@Test(priority=2)
	public void student2() {
		System.out.println("student name is sony");
	}
	
	@Test(priority=4)
	public void student3() {
		System.out.println("student name is abc");
	}
	
	@Test(priority=3)
	public void student4() {
		System.out.println("student name is abcd");
	}
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("i am from before method");
	}

	@AfterMethod  
	public void afterMethod() {						
		System.out.println("i am from after method");
	}
	

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("i am from before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("i am from after test");
	  }
	@BeforeSuite
	public void beforesuite() {
		System.out.println("i am from before suite");
	}
	@AfterSuite
	private void Aftersuite() {
		System.out.println("i am from after suite");
	
	}

}
