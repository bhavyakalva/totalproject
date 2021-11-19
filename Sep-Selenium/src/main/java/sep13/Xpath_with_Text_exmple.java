package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_with_Text_exmple { // we use xpath with text when we have links with text and when we have

										// no attributes other then text we use this

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();

	}
}
                                                             