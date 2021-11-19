package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath { // Relative xpath contains nodes and attributes

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("sony1234");
		driver.findElement(By.xpath("//Button[@name='SubmitLogin']")).click();
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();

	}
}