package Sep16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/");
	List<WebElement> footerlinks= driver.findElements(By.xpath("(//div[@class='row'])[6]//ul//li/a"));
		for(int i=0;i<footerlinks.size();i++) {
			System.out.println(footerlinks.get(i).getText());
		}
		
		System.out.println("bigbasket footerlinks");
		driver.get("http://bigbasket.com/");
		List<WebElement> footerlinks2=driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])/ul/li/a"));
		for(int i=0;i<footerlinks2.size();i++) {
			System.out.println(footerlinks2.get(i).getText());
		}
		
		
		}
	}

