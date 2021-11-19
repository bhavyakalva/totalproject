package Sep17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsexmple {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	String alertstring;
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	Thread.sleep(5000);
	alertstring = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(alertstring);
	}

}
