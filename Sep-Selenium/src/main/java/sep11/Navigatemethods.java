package sep11;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class Navigatemethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//another way to open webpage we use driver.get and driver.navigate both
			driver.navigate().to("http://automationpractice.com/");
		 driver.findElement(By.linkText("Sign in")).click();
		 
		 driver.navigate().back();
		 Thread.sleep(2000); 
		 
		 driver.navigate().forward();
		 Thread.sleep(2000); 
		 driver.navigate().refresh();
		 
	 driver.findElement(By.id("email_create")).sendKeys("kbhavya@gmail.com");
	 String email = driver.findElement(By.id("email_create")).getAttribute("value");
	 System.out.println("email id is "+email);
	 
	 driver.navigate().refresh();
		 
	  email = driver.findElement(By.id("email_create")).getAttribute("value");
	 System.out.println("email id is "+email);
	 
		
	}}