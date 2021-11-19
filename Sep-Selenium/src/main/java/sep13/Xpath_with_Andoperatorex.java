package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_with_Andoperatorex { // in xpath with and operator both attribute should be correct then only we can
										// find webelement

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(
				By.xpath("//input[@class='is_required validate account_input form-control' and @id='email']"))
				.sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.xpath(
				"//input[@class='is_required validate account_input form-control' and @data-validate='isPasswd']"))
				.sendKeys("sony1234");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).clear();

		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("dresses");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).clear();

		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("jeans");
		driver.findElement(By.xpath("//button[@class='btn btn-default button-search' and @name='submit_search']"))
				.click();

	}
}