package sep11;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// get, getCurrentUrl, getTitle,get window handle, getPageSource we have windowhandles also
		driver.get("http://automationpractice.com/");
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current Url is "+currentUrl);
		
		String getTitle = driver.getTitle();
		System.out.println("Title of web page is "+getTitle);
		
		String windowhandle =driver.getWindowHandle();
		System.out.println("window handle "+windowhandle);
		
		
		String WebPageSource = driver.getPageSource();
		System.out.println("web page sourceis "+WebPageSource);
		
	}}