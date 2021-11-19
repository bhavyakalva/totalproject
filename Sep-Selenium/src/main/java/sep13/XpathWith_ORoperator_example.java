package sep13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWith_ORoperator_example { // in xpath with or operator we use 2attributes anyone attribute should be
											// correct for sure then only it finds element

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://automationpractice.com/");// generally we dont use or operator much
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd' or @data-validate='isPasswd']")).sendKeys("sony1234");
		driver.findElement(By.xpath("//button[@id='SubmitLogin' or @name='SubmitLogin']")).click();
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input'or @name='search_query']"))
				.sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[@class='btn btn-default button-search' or @name='submit_search']"))
				.click();

	}

}
