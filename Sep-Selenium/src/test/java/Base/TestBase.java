package Base;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import excel.ExcelReader;
import listeners.EventListener;
import oct1_log4jframework.LogfileImpl;
import pages.Authenticationpage;
import pages.Contactuspage;
import pages.CreateAccountpage;
import pages.Footerlinkspage;
import pages.Headerlinkspage;
import pages.Homepage;
import pages.MyAccountpage;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class TestBase {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public ExcelReader datatable;
	public Authenticationpage authpageobj;
	public Contactuspage contactuspageobj;
	public CreateAccountpage createAccountobj;
	public Footerlinkspage footerlinksobj;
	public Headerlinkspage headerlinksobj;
	public Homepage homepageobj;
	public MyAccountpage myaccountobj;
	// extents reporting
	// create two instance variable
	public static ExtentReports extent;
	public static ExtentTest extentLogger;

	@BeforeClass(groups = { "p1", "p2", "p3" })
	public void beforeclass() throws IOException {
		datatable = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\spreadsheets\\TestData.xlsx");
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
			//headless browser 
			ChromeOptions options = new ChromeOptions();//we are giving options obj name of chromeoptions 
//			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080",
//					"--ignore-certificate-errors");//adding arguments to browser

			driver = new ChromeDriver(options);//we aregiving the information of arguments by passong optiond in driver
		}
		if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\edge\\msedgedriver.exe");

			driver = new EdgeDriver();

		}
		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\FireFox\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// class file which we created in above step
		EventListener ecapture = new EventListener();

		// pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);

		// pass ecapture to eventHandler
		eventHandler.register(ecapture);

		authpageobj = new Authenticationpage(eventHandler);
		contactuspageobj = new Contactuspage(eventHandler);
		createAccountobj = new CreateAccountpage(eventHandler);
		footerlinksobj = new Footerlinkspage(eventHandler);
		headerlinksobj = new Headerlinkspage(eventHandler);
		homepageobj = new Homepage(eventHandler);
		myaccountobj = new MyAccountpage(eventHandler);

	}

	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir") + "\\report.html", true);// this lines is used to
																							// generate html report
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\target\\extent-config.xml"));// this line loads the extentconfig xml as it
																									//- have some data we gave its path here 

	}

	@BeforeMethod(groups = { "p1", "p2", "p3" })
	public void beforemethod() {
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod(groups = { "p1", "p2", "p3" })
	public void aftermethod() {
		myaccountobj.getSignout().click();
		// here we are ending the method we started in the class
		extent.endTest(extentLogger);
		// it used to erase previouse data and printnew data
		extent.flush();
		
	}

	@AfterClass(groups = { "p1", "p2", "p3" })
	public void afterclass() {
		driver.quit();

	}

	@AfterTest
	public void testafter() {
		extent.close();// it is closing the extentreport
	}

}
