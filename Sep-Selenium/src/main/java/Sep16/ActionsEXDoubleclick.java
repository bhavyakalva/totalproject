package Sep16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEXDoubleclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com/");
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.id("input"));
		// double click on the webelement
		act.moveToElement(search).click().sendKeys("tomato").doubleClick().build().perform();// act.moveToElement is use
		// to move the curser,.click()we are clicking on textbox and to send tomato we
		// are using .sendKeys("tomato")is used to search and
		// .doubleclick() is used to click double and build().perform() is used to
		// execute the command

		// right click on webpage
		act.moveToElement(search).contextClick().build().perform();// in perform method we have buld and perfform so
																	// direct we can acll perform() insted of calling
																	// build().perform();
//act.contextClick(search).perform();//other way towrite
		
	}
}
