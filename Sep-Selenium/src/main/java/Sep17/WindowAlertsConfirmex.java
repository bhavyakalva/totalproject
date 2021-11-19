package Sep17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlertsConfirmex {



public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	String alertstring;
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	Thread.sleep(5000);
	alertstring = driver.switchTo().alert().getText();//this is for alertsexmple
	driver.switchTo().alert().accept();
	System.out.println(alertstring);
	
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	Thread.sleep(5000);
	alertstring = driver.switchTo().alert().getText();//this is for windowsalerts confirm button click pop up of text and clicking on cancel
	driver.switchTo().alert().dismiss();
	System.out.println(alertstring);
	

	}

}     
