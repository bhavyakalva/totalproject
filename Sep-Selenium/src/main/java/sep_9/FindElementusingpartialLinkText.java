package sep_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementusingpartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.partialLinkText("Terms")).click();
		

	}

}
