package sep_30_listeners_webdrivereventlisteners;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTestcases extends TestBase {
	
	@Test
	public void Logintest001() {
		homepageobj.getSignInLink().click();// here we used homepageobj first becoz signin is present in homepage
		authpageobj.setEmailaddressSignIn("bhavyaak@gmail.com");// after clicking on signin it navigates to authpage so
																// i used authpage here
		authpageobj.setPassword("sony1234");
		authpageobj.getSigninbutton().click();
		Assert.assertEquals(myaccountobj.getSignout().isDisplayed(), true);// here after signin we are validating the signout by using assert we have to
		System.out.println("logintest001 pass");													// validate after signin
	}
																			

	@Test
	public void Logintest002() {
		homepageobj.getSignInLink().click();
		authpageobj.setEmailaddressSignIn("bhavyaak@gmail.com");
		authpageobj.setPassword("sony1234");
		authpageobj.getSigninbutton().click();
		System.out.println("logintest002 pass");	
	}

}
