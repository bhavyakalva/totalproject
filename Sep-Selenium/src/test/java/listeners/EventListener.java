package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import oct1_log4jframework.LogfileImpl;

public class EventListener  implements WebDriverEventListener{
	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());

	public void beforeNavigateTo(String url, WebDriver driver) {
	log.info("Before navigating to: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
	log.info("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
	log.info("Value of the:" + element.toString()
				+ " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
	log.info("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
	log.info("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
	log.info("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
	log.info("Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver driver) {
	log.info("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
	log.info("Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver driver) {
	log.info("Navigated forward to next page");
	}

	public void onException(Throwable error, WebDriver driver) {
	log.info("Exception occured: " + error);
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	log.info("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
	log.info("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
	}

	public void afterScript(String script, WebDriver driver) {
	}

	public void beforeAlertAccept(WebDriver driver) {
		
		
	}

	public void afterAlertAccept(WebDriver driver) {
		
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
	
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
	
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
	
		
	}

}

