 package Sep16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEXMPLE_OnMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com/");
	Actions act = new Actions(driver);
	WebElement shopbycat=driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
	act.moveToElement(shopbycat).build().perform();
	Thread.sleep(4000);
	if(shopbycat.isDisplayed() && shopbycat.isEnabled()) {
		driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
	}else {
		System.out.println("webelements not present");
		
		
	}
		
	}

}
