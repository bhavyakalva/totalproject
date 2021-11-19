package sep13;                                           //in Xpath we have two types 
                                              // 1) Absoulte xpath 2) relativexpath
import java.util.concurrent.TimeUnit; //1) Absoulte xpath contains only nodes and start with  /

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //2)relative xpath have nodes and attribute and starts with // we use only relative xpath more
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absoulte_exmple {

	public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver",
					"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();//sign in using fullxpath i.e absoulte
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("bhavyaak@gmail.com");//email enter
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/span[1]/input[1]")).sendKeys("sony1234");//password
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();//sign in click
	}

}
