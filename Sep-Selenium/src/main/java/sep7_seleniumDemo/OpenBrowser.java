package sep7_seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.get("https://www.nykaa.com/");
		driver.get("https://www.flipkart.com/");
		driver.quit();

	}

}
