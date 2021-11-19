package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountpage {
	WebDriver driver;

	public CreateAccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// personal information
	@FindBy(id = "id_gender2")
	private WebElement Genderselectfemale;

	@FindBy(id = "id_gender1")
	private WebElement Genderselectmale;

	@FindBy(name = "customer_firstname")
	private WebElement FirstName;

	@FindBy(name = "customer_lastname")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	// Date of birth
	@FindBy(id = "days")
	private WebElement days;

	@FindBy(xpath ="//select[@id='months']")
	private WebElement months;

	@FindBy(id = "years")
	private WebElement years;

	@FindBy(id = "newsletter")
	private WebElement newslettercheckbox;

	@FindBy(name = "optin")
	private WebElement recievespecialofferscheckbox;

	// your address
	@FindBy(id = "firstname")
	private WebElement AddFirstname;

	@FindBy(id = "lastname")
	private WebElement AddLastname;

	@FindBy(name = "company")
	private WebElement companyname;

	@FindBy(name = "address1")
	private WebElement Address1;

	@FindBy(name = "address2")
	private WebElement Address2;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement ziporpostalcode;

	@FindBy(id = "id_country")
	private WebElement Countryname;

	@FindBy(name = "other")
	private WebElement Additionalinformation;

	@FindBy(name = "phone")
	private WebElement Homephone;

	@FindBy(name = "phone_mobile")
	private WebElement mobilephone;

	@FindBy(name = "alias")
	private WebElement assignaddressalis;

	@FindBy(name = "submitAccount")
	private WebElement Register;
	
	//successfull login 
	
	@FindBy(xpath="//p[@class=\"info-account\"]")
	private WebElement WelcometomyAccountmessage;
	

	// ERROR MESSAGES
	@FindBy(xpath = "//b[contains(text(),'lastname')]")
	private WebElement Lastnamerequirederror;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]")
	private WebElement Firstnamerequirederror;

	@FindBy(xpath = "//b[contains(text(),'passwd')] ")
	private WebElement Passwordrequirederror;

	@FindBy(xpath = "//li[contains(text(),\"The Zip/Postal code you've entered is invalid. It \")]")
	private WebElement ziporpostalinvaliderror;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[2]")
	private WebElement Cityrequirederror;

	@FindBy(xpath = "//li[contains(text(),'This country requires you to choose a State.')]")
	private WebElement Staterequirederror;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]")
	private WebElement Address1requirederror;

	@FindBy(xpath = "//li[contains(text(),'You must register at least one phone number.')]")
	private WebElement Phonenumberrequirederror;
	
	public WebElement getGenderselectfemale() {
		return Genderselectfemale;
	}

	public void setGenderselectfemale(WebElement genderselectfemale) {
		Genderselectfemale = genderselectfemale;
	}

	public WebElement getGenderselectmale() {
		return Genderselectmale;
	}

	public void setGenderselectmale(WebElement genderselectmale) {
		Genderselectmale = genderselectmale;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(String val) {
		FirstName.sendKeys(val);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(String val) {
		LastName.sendKeys(val);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String val) {
		this.password.sendKeys(val);
	}

	public WebElement getDays() {
		return days;
	}

	public void setDays(String val) {
		this.days.sendKeys(val);
	}

	public WebElement getMonths() {
		return months;
	}

	public void setMonths(String val) {
		this.months.sendKeys(val);
	}

	public WebElement getYears() {
		return years;
	}

	public void setYears(String val) {
		this.years.sendKeys(val);
	}

	public WebElement getNewslettercheckbox() {
		return newslettercheckbox;
	}

	public void setNewslettercheckbox(String val) {
		this.newslettercheckbox.sendKeys(val);
	}

	public WebElement getRecievespecialofferscheckbox() {
		return recievespecialofferscheckbox;
	}

	public void setRecievespecialofferscheckbox(String val) {
		this.recievespecialofferscheckbox.sendKeys(val);
	}

	public WebElement getAddFirstname() {
		return AddFirstname;
	}

	public WebElement getWelcometomyAccountmessage() {
		return WelcometomyAccountmessage;
	}

	public void setAddFirstname(String val) {
		this.AddFirstname.sendKeys(val);
	}

	public WebElement getAddLastname() {
		return AddLastname;
	}

	public void setAddLastname(String val) {
		this.AddLastname.sendKeys(val);
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String val) {
		this.companyname.sendKeys(val);
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public void setAddress1(String val) {
		Address1.sendKeys(val);
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public void setAddress2(String val) {
		Address2.sendKeys(val);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String val) {
		this.city.sendKeys(val);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String val) {
		this.state.sendKeys(val);
	}

	public WebElement getZiporpostalcode() {
		return ziporpostalcode;
	}

	public void setZiporpostalcode(String val) {
		this.ziporpostalcode.sendKeys(val);
	}

	public WebElement getCountryname() {
		return Countryname;
	}

	public void setCountryname(String val) {
		Countryname.sendKeys(val);
	}

	public WebElement getAdditionalinformation() {
		return Additionalinformation;
	}

	public void setAdditionalinformation(String val) {
		Additionalinformation.sendKeys(val);
	}

	public WebElement getHomephone() {
		return Homephone;
	}

	public void setHomephone(String val) {
		Homephone.sendKeys(val);
	}

	public WebElement getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String val) {
		this.mobilephone.sendKeys(val);
	}

	public WebElement getAssignaddressalis() {
		return assignaddressalis;
	}

	public void setAssignaddressalis(String val) {
		this.assignaddressalis.sendKeys(val);
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getLastnamerequirederror() {
		return Lastnamerequirederror;
	}

	public WebElement getFirstnamerequirederror() {
		return Firstnamerequirederror;
	}

	public WebElement getPasswordrequirederror() {
		return Passwordrequirederror;
	}

	public WebElement getZiporpostalinvaliderror() {
		return ziporpostalinvaliderror;
	}

	public WebElement getCityrequirederror() {
		return Cityrequirederror;
	}

	public WebElement getStaterequirederror() {
		return Staterequirederror;
	}

	public WebElement getAddress1requirederror() {
		return Address1requirederror;
	}

	public WebElement getPhonenumberreuirederror() {
		return Phonenumberrequirederror;
	}

}