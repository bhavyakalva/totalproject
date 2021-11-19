package oct1_log4jframework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTestcases extends TestBase {//here we used log4j framework obj and in place odf sysout use log.info
	public Logger log = LogManager.getLogger(LogfileImpl.class.getName());

	@Test
	public void Logintest001() {
		homepageobj.getSignInLink().click();// here we used homepageobj first becoz signin is present in homepage
		authpageobj.setEmailaddressSignIn("bhavyaak@gmail.com");// after clicking on signin it navigates to authpage so
																// i used authpage here
		authpageobj.setPassword("sony1234");
		authpageobj.getSigninbutton().click();
		Assert.assertEquals(myaccountobj.getSignout().isDisplayed(), true);// here after signin we are validating the signout by using assert we have to
		 log.info("logintest001 pass");													// validate after signin
	}
																			

	@Test
	public void Logintest002() {
		homepageobj.getSignInLink().click();
		authpageobj.setEmailaddressSignIn("bhavyaak@gmail.com");
		authpageobj.setPassword("sony1234");
		authpageobj.getSigninbutton().click();
		 log.info("logintest002 pass");	
	}

}
