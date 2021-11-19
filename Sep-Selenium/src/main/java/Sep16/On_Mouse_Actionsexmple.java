package Sep16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class On_Mouse_Actionsexmple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		Actions act = new Actions(driver);
		WebElement shopbycat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		act.moveToElement(shopbycat).build().perform();
		Thread.sleep(3000);
		WebElement bevarage = driver.findElement(By.xpath("//mega-nav-template[1]/div[1]/ul[1]/li[4]/a[1]"));
		act.moveToElement(bevarage).build().perform();
		WebElement Tea = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/nav/div/div/ul/li[1]/ul/li/mega-nav-template/div/div/div/left-subcategory-template/div/div/div/div[1]/ul/li[4]/a"));
		act.moveToElement(Tea).build().perform();

	}
}