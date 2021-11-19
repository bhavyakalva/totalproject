package Sep14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_exmple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//finding the sign-up button from the registeration form present in the  facebook application //using the (child)
	//driver.findElement(By.xpath("//div[@id=\"reg_form_box\"]/child::div[10]"));
	
		//locate firstname filed from the sign up button here self element is signup // here we used parent 
	//driver.findElement(By.xpath("//button[@id=\"u_2_s_Dy\"]/parent::*/parent::*/child::div[1]/div/div[1]"));
		
	//identify the password from mobile number field in facebook. // here we use (following)	
	//	driver.findElement(By.xpath("//input[@name=\"reg_email__\"]/following::input[2]"));
		
		//locate mobile number using password field //here we are using (preceding)
		//driver.findElement(By.xpath("//input[@id="password_step_input"]/preceding::input[2]"))
		
		//locate surname from radio female button in facebook //here we are using (ancestor)
		//driver.findElement(By.xpath("//input[@id="u_2_2_ny"]/ancestor::div[2]/div[1]/div/div[2]"));
		//or
		//driver.findElement(By.xpath("driver.findElement(By.xpath("//input[@id="u_2_2_ny"]/ancestor::div[2]//input[@id='u_2_d_Hg']"));
		
		//next we are taking google search example for parent 
		//driver.get("https://www.facebook.com/")
		//identify the search textbox from the google using  google search button present in the google search home page here google searchbox is self node// here we are using  (parent)
		//driver.findElement(By.xpath("//div[3]/center//input[@class="gNO89b"]/parent::*/parent::*/parent::*/child::*[2]"));
		
		//next we are using amazon.com example for following
		//driver.get("https://www.amazon.in/")
		//identify the Bestsellers from the Amazon search text box present in the amazon home page  amazon textbox is self node here //here we are using(following)
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[28]"));
		
		//identify the Hello sign in from the Amazon search text box present in the amazon home page  amazon textbox is self node here //here we are using(following)
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[2]"));
		
		//identify mobiles link which is part of menu bar in amazon using descendant here total menu bar is self node we have to find mobile
		//driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::*[2]"))
		 	
	
			}
	}


