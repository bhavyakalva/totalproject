package Sep15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_From_Websites {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhavyaak@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("sony1234");

		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		String loginText = "My Account";
		WebElement getlogintext= driver.findElement(By.xpath("//h1[contains(text(),'My account')]"));
		String afterlogintext = getlogintext.getText();
		if(loginText.equals(afterlogintext)) {
			System.out.println("Testcase pass");
		}else {
			System.out.println("Testcase fail");
		}
		
		String accountInfo = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		System.out.println(accountInfo);
		
		
		}
		
		

		
		
	}


