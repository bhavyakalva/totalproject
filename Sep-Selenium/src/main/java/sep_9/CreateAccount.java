package sep_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("bhaaavvyykkk@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("uniform-id_gender2")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("bhavyaa");
		driver.findElement(By.name("customer_lastname")).sendKeys("kalvaa");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("passwd")).sendKeys("sony1234");
		driver.findElement(By.id("days")).sendKeys("20  ");
		driver.findElement(By.id("months")).sendKeys("december ");
		driver.findElement(By.id("years")).sendKeys("2010  ");
    	driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("optin")).click();
//		driver.findElement(By.name("firstname")).click(); we no need to give again the name it automatically in website it automatically
//		driver.findElement(By.name("lastname")).click();
    	driver.findElement(By.name("company")).sendKeys("sonyy");
		driver.findElement(By.name("address1")).sendKeys("boyington Dr");
		driver.findElement(By.name("city")).sendKeys("Dallas");
		driver.findElement(By.name("id_state")).sendKeys("Texas");
		driver.findElement(By.name("postcode")).sendKeys("75034");
		driver.findElement(By.name("id_country")).sendKeys("United States");
		driver.findElement(By.name("other")).sendKeys("Sony company");
		driver.findElement(By.name("phone")).sendKeys("1111111111");
		driver.findElement(By.name("phone_mobile")).sendKeys("1211111111");
		driver.findElement(By.name("alias")).sendKeys("Dallas");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Add to cart")).click();

	}
}