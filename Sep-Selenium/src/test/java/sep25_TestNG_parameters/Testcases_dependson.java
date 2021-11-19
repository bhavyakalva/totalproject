package sep25_TestNG_parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcases_dependson extends TestBase {

	@Test(dependsOnMethods = "testcase003")
	@Parameters({"vegName1"})
	public void testcase001(String name1) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		// Double click on the webelemebt
		act.moveToElement(search).click().sendKeys(name1).doubleClick().build().perform();

		Thread.sleep(5000);

	}

	@Test
	@Parameters({"vegName2"})
	public void testcase002(String name2) {
		String veg = name2;

		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']"));

		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(veg).build().perform();
	}

	@Test
	public void testcase003() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));

		act.moveToElement(shopByCat).build().perform();

		Thread.sleep(5000);

		if (shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}

}
