package Sep15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {



	public static void main(String[] args) throws InterruptedException {
		

				System.setProperty("webdriver.chrome.driver",
						"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
				WebDriver driver;
				driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		String searchtext="Dresses";
		WebElement SearchBox= driver.findElement(By.xpath("//input[@id='search_query_top']"));
		WebElement SearchButton=driver.findElement(By.xpath("//input[@id='search_query_top']//following-sibling::button"));
		 SearchBox.sendKeys(searchtext);
		 SearchButton.click();
		Thread.sleep(4000);
		 driver.close();
		

	}

}
