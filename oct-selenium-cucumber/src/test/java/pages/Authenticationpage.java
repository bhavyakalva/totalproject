package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authenticationpage{

	WebDriver driver;

	public Authenticationpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Authentication
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[1]/a[1]/i[1]")
	private WebElement BacktoHomeButton;

	// create an account
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement EmailaddressCreateAccount;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
	private WebElement Createaccountbutton;
	
	@FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
	private WebElement Createaccountinvalidemailaddress;
	
	@FindBy(xpath ="//li[contains(text(),'An account using this email address has already be')]")
	private WebElement Emailalreadyusederror;

	// Already Registered Account

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailaddressSignIn;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotpassword;

	@FindBy(name = "SubmitLogin")
	private WebElement signinbutton;
	
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	private WebElement AuthenticationFailed;
	
	@FindBy(name ="//li[contains(text(),'Invalid password.')]")
	private WebElement Invalidloginpassword;

	public WebElement getEmailaddressCreateAccount() {
		return EmailaddressCreateAccount;
	}

	public void setEmailaddressCreateAccount(String val) {
		EmailaddressCreateAccount.sendKeys(val);
	}

	public WebElement getEmailaddressSignIn() {
		return EmailaddressSignIn;
	}

	public void setEmailaddressSignIn(String val) {
		EmailaddressSignIn.sendKeys(val);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String val) {
		this.password.sendKeys(val);
	}

	public WebElement getBacktoHomeButton() {
		return BacktoHomeButton;
	}

	

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public WebElement getAuthenticationFailed() {
		return AuthenticationFailed;
	}

	public WebElement getInvalidloginpassword() {
		return Invalidloginpassword;
	}

	public WebElement getCreateaccountinvalidemailaddress() {
		return Createaccountinvalidemailaddress;
	}

	public WebElement getEmailalreadyusederror() {
		return Emailalreadyusederror;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateaccountbutton() {
		return Createaccountbutton;
	}

}
