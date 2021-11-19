package Sep16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFooterAnchorTags {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bigbasket.com");

	// printing footerlinks of bigbasket
	List<WebElement> footerlinks = driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]/ul/li/a"));

	
for(int i=0;i<footerlinks.size();i++) {
//	if(footerlinks.get(i).getText().equals("privacy policy")) {//if we want to check we use if or else we can use just sysout
//		continue;
//	}
	System.out.println(footerlinks.get(i).getText());
}
	}
}

