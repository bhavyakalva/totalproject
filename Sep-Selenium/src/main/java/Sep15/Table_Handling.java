package Sep15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handling {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> Tablerow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		System.out.println(" " + Tablerow.size());
		for (int i = 0; i < Tablerow.size(); i++) {
			String ContactName = Tablerow.get(i).getText();
			System.out.println("contact name is" + ContactName);
		}

		List<WebElement> Tablecolumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]"));
		System.out.println(" " + Tablecolumn.size());
		for (int i = 0; i < Tablecolumn.size(); i++) {
			String ROW = Tablecolumn.get(i).getText();
			System.out.println("row name is " + ROW);
		}
		
		List<WebElement> tablerow3= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		System.out.println(" "+tablerow3.size());
		for(int i=0;i<tablerow3.size();i++) {
		String Country=tablerow3.get(i).getText();
		System.out.println("Country name is "+ Country);
	}

		WebElement tablerow2column3= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]//td[3]"));
		System.out.println(" "+tablerow2column3.getSize());
			System.out.println(tablerow2column3.getText());
		}
		
	}


