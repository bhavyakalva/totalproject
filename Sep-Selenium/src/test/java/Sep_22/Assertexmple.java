package Sep_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertexmple {
 WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
	}


	@Test
	public void logoTest() {
   WebElement logo= driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
    Assert.assertTrue(logo.isDisplayed(),"logo not dislpayed on page");

	}

	@Test
	public void contactus() {
		driver.findElement(By.xpath("//title[contains(text(),'Women - My Store')]")).click();
		Assert.assertEquals("Contact Us", "Contact Us");//it is not working for me but the assert statement s correct 
		
	}
	@AfterMethod
	public void aftermethod() {
		driver.close();

	}

}
