package sep29_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.TestBase;

public class CreateAccount extends TestBase {

	@Test
	public void CreateAccountTest001() {
		homepageobj.getSignInLink().click();
		authpageobj.setEmailaddressCreateAccount("abcddeees@gmail.com");
		authpageobj.getCreateaccountbutton().click();
		createAccountobj.getGenderselectfemale().click();
		createAccountobj.setFirstName("sony");
		createAccountobj.setLastName("kalva");
		createAccountobj.setPassword("12345@");
		createAccountobj.setDays("20  ");
		createAccountobj.setMonths("december ");
		createAccountobj.setYears("1990  ");
		createAccountobj.getNewslettercheckbox().click();
		createAccountobj.getRecievespecialofferscheckbox().click();
		createAccountobj.getAddFirstname();
		createAccountobj.getAddLastname();
		createAccountobj.setCompanyname("abc");
		createAccountobj.setAddress1("xyz");
		createAccountobj.setAddress2("abc");
		createAccountobj.setCity("ssss");
		createAccountobj.setState("hawai");
		createAccountobj.setZiporpostalcode("00000");
		createAccountobj.setCountryname("unitedstates");
		createAccountobj.setHomephone("9999999999");
		createAccountobj.setMobilephone("1111111111");
		createAccountobj.getAssignaddressalis();
		createAccountobj.getRegister().click();
		Assert.assertEquals(myaccountobj.getWelcometomyAccountmessage().isDisplayed(), true);
		System.out.println("CreateAccountTest001 true");

	}

}
