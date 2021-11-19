package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_with_Containsexample { // it is most usefull when we have dynamic elements we can use contains with
		// starting part of value of an attribute it will check weither it is in starting middle or end
		// it should contain the value we gave for the attribute that's it it can be anywhere

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("bhavyaak@gmail.com");
		driver.navigate().back();
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("dresses");
		driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();

	}
}
