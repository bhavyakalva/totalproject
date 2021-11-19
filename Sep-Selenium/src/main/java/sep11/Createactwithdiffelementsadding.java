package sep11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createactwithdiffelementsadding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("bhhhaaavvyyk@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("bhavaya");
		driver.findElement(By.id("customer_lastname")).sendKeys("k");
		driver.findElement(By.id("passwd")).sendKeys("sony1234");
		// Method 1
//		driver.findElement(By.id("days")).sendKeys("1  ");
//		driver.findElement(By.id("months")).sendKeys("January ");
//		driver.findElement(By.id("years")).sendKeys("2010  ");

		// By selectByVisibleText
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("20  ");

		// By selectByIndex
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByIndex(12);

		// By selectByValue
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("2010");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("newsletter")).click();// here we gave newsletter agin to unclick to unclick any
															// statement we have to give it twice
		boolean newslattercheckboxstatus = driver.findElement(By.name("newsletter")).isSelected();
		if (newslattercheckboxstatus == false) {
			driver.findElement(By.name("newsletter")).click();
		}

		driver.findElement(By.name("company")).sendKeys("sonyy");
		driver.findElement(By.name("address1")).sendKeys("boyington Dr");
		driver.findElement(By.name("city")).sendKeys("Dallas");
		driver.findElement(By.name("id_state")).sendKeys("Texas");
		driver.findElement(By.name("postcode")).sendKeys("75034");
		driver.findElement(By.name("id_country")).sendKeys("United States");
		driver.findElement(By.name("other")).sendKeys("Sony company");
		driver.findElement(By.name("phone")).sendKeys("1111111111");
		driver.findElement(By.name("phone_mobile")).sendKeys("1211111111");
		driver.findElement(By.name("alias")).click();
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Add to cart")).click();

	}

}
