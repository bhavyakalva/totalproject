package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_with_Startwithexample { // xpath with starts-with it will check either attribute value starting with the
								// one we gave we can give only starting value it will check if starting value is same or not 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("Dresses");
		driver.findElement(By.xpath("//button[starts-with(@name,'submit')]")).click();
	}

}
                                                                     