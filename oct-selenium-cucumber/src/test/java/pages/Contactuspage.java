package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
	WebDriver driver;

	public Contactuspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

   //heading of contactus
	@FindBy(xpath = "//h1[contains(text(),'Customer service - Contact us')]")
	private WebElement Contactuspagetext;
	
	// SEND A MESSAGE
	@FindBy(xpath = "//select[@id='id_contact']")
	private WebElement SubjectHeading;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Emailaddress;

	@FindBy(id = "id_order")
	private WebElement Orderreference;

	@FindBy(xpath = "//input[@id='fileUpload']")
	private WebElement AttachFile;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement Message;
	
	@FindBy(name = "submitMessage")
	private WebElement Sendbutton;
	
	
	//error and success message
	@FindBy(xpath ="//p[contains(text(),'Your message has been successfully sent to our tea')]")
   private WebElement  ContactusSuccessMessage;	
			
			
	@FindBy(xpath ="//li[contains(text(),'The message cannot be blank.')]")
	private WebElement ContactusErrorMessage;

	@FindBy(xpath ="//li[contains(text(),'Please select a subject from the list provided.')]")
	 private WebElement ContactusSubjectHeadingErrorMessage;
	   
	@FindBy(xpath ="//li[contains(text(),'Invalid email address.')]")
	 private WebElement	ContactusInvalidEmailerrorMessage;
				

	public WebElement getSubjectHeading() {
		return SubjectHeading;
	}

	public void setSubjectHeading(String val) {
		SubjectHeading.sendKeys(val);
	}

	public WebElement getEmailaddress() {
		return Emailaddress;
	}

	public void setEmailaddress(String val) {
		Emailaddress.sendKeys(val);
	}

	public WebElement getOrderreference() {
		return Orderreference;
	}

	public void setOrderreference(String val) {
		Orderreference.sendKeys(val);
	}

	public WebElement getAttachFile() {
		return AttachFile;
	}

	public void setAttachFile(String val) {
		AttachFile.sendKeys(val);
	}

	public WebElement getMessage() {
		return Message;
	}

	public void setMessage(String val) {
		Message.sendKeys(val);
	}

	public WebElement getSendbutton() {
		return Sendbutton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactuspagetext() {
		return Contactuspagetext;
	}

	public WebElement getContactusErrorMessage() {
		return ContactusErrorMessage;
	}

	public WebElement getContactusSubjectHeadingErrorMessage() {
		return ContactusSubjectHeadingErrorMessage;
	}

	public WebElement getContactusInvalidEmailerrorMessage() {
		return ContactusInvalidEmailerrorMessage;
	}

	public WebElement getContactusSuccessMessage() {
		return ContactusSuccessMessage;
	}

}