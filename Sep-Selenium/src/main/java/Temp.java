import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		 driver.findElement(By.linkText("Sign in")).click();
		 
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 driver.findElement(By.id("email_create")).sendKeys("kbhavkya@gmail.com");
		 String email=driver.findElement(By.id("email_create")).getAttribute("value");
		 System.out.println("email id is "+email);
		 driver.navigate().refresh();
	}

}
