package sep_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("sony1234");
		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='5']")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-default button button-medium\"]")).click();
		driver.findElement(By.id("button_order_cart")).click();
	}

}
