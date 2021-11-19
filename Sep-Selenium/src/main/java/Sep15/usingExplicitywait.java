package Sep15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usingExplicitywait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,60);//explicity wait 
	
		driver.get("http://automationpractice.com/index.php");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search_query_top']"))).sendKeys("T-shirts");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Add to cart')]")));
		
	}

}
