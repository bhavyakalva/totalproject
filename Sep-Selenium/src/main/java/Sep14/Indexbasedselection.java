package Sep14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indexbasedselection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//div/input[@id='email_create']")).sendKeys("bkk@gmail.com");
		driver.findElement(By.xpath("//div/button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("(//input[@name='id_gender'] ) [2]")).click();
	}
	
	

}
