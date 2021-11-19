package Sep16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Dom_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://bigbasket.com/");
		
		WebElement search=driver.findElement(By.id("input"));
		search.sendKeys("colgate");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;//javascript is interface js is obj 
		String exe =" return document.getElementById(\"input\").value";//here we are writer same as driver.get and storing it in string exe
		String res =(String) js.executeScript(exe);//here we are executing string exe in res using javascript
		
		System.out.println(" value is "+res);//we fetched the result in res and we are printing here 
		
		System.out.println(exe);//here we are just printing exe as we stored in in string so just we are printing
		
		
		
	}

}
