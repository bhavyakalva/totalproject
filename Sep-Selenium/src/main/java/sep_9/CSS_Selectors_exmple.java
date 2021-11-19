package sep_9;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors_exmple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		//CSS selectors with TagName & ID  ->  tag#id
	//driver.findElement(By.cssSelector("input#email")).sendKeys("abc"); //in Css_selector we can use tagname&id like this "tagname#id" it is one way other
	//driver.findElement(By.cssSelector("#email")).sendKeys("abc"); //  another way with outproviding tagname we can give #id here both ways we can do
	
	//CSS selectors with TagName & class  -> tag.class
	   //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc"); // here we can use tagname.class here it is one method or
	  //driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc"); //we can use .classname directly also
		
		//CSS selectors with TagName & Attribute -> tag[attribute=value]
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc");//here we are using tag name with any attribute in side squarebracket
	   //driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("abc");//here we used tagname and data-test attribute                                                                       //tagname[attribute] we can use any attribute 
		
		//CSS selectors with TagName, class & Attribute	-> tag.class[attribute=value]
		//driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("abc");//here we used tagname.classvalue[attribute]
	//driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc");//HERE we used tagname.classvaluewithediffattribute

		
		
		
		
		
		
		
		
		
		
	
	}

}
