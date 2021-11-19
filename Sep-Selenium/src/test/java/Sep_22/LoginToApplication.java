package Sep_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginToApplication {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void navigateBrowser() {
		driver.get("http://automationpractice.com/");
	}

	@Test
	public void loginWithValidUserNameAndPassword() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("sony1234");
		driver.findElement(By.id("SubmitLogin")).click();
		String valmyaccount ="MY ACCOUNT";
	String MYaccount=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
	Assert.assertEquals(valmyaccount,MYaccount);
		}
	
	@Test
	public void loginWithValidUserNameAndPasswordwithwrongtext() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("sony1234");
		driver.findElement(By.id("SubmitLogin")).click();
		String valmyaccount ="MY account";
	String MYaccount=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
	Assert.assertEquals(valmyaccount,MYaccount);
		
		
			}

	@AfterMethod
		public void signOut() {
			driver.findElement(By.linkText("Sign out")).click();
		}
		
	

	@AfterClass
	public void afterClass() {
		driver.close();
	}

		
	}


