package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Authenticationpage;
import pages.Contactuspage;
import pages.CreateAccountpage;
import pages.Footerlinkspage;
import pages.Headerlinkspage;
import pages.Homepage;
import pages.MyAccountpage;

public class TestBase {
	public static WebDriver driver;
	public static Authenticationpage authpageobj;
	public static Contactuspage contactuspageobj;
	public static CreateAccountpage createAccountobj;
	public static Footerlinkspage footerlinksobj;
	public static Headerlinkspage headerlinksobj;
	public static Homepage homepageobj;
	public static MyAccountpage myaccountobj;

	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");

		authpageobj = new Authenticationpage(driver);
		contactuspageobj = new Contactuspage(driver);
		createAccountobj = new CreateAccountpage(driver);
		footerlinksobj = new Footerlinkspage(driver);
		headerlinksobj = new Headerlinkspage(driver);
		homepageobj = new Homepage(driver);
		myaccountobj = new MyAccountpage(driver);

	}

}