package Sep16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExEnterCaps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com/");

		String vegname = "tomato";
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.id("input"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();

		// instead of giving the veg name separately in string and giving that string
		// name in senkeys we can use it directly also

	}

}