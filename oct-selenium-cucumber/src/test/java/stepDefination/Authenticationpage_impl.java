package stepDefination;

import org.junit.Assert;

import Base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authenticationpage_impl extends TestBase {
	@Given("^open the browser and navigate to the application url$")
	public void open_the_browser_and_navigate_to_the_application_url() throws Throwable {
		setup();
	}

	@When("^click on the SignIn$")
	public void click_on_the_signin() throws Throwable {
		homepageobj.getSignInLink().click();

	}

	@Then("verify the Authentication page is exist or not")
	public void verify_the_Authentication_page_is_exist_or_not() {
		Assert.assertTrue(authpageobj.getCreateaccountbutton().isEnabled());

	}

	@When("^enter login details username \"([^\"]*)\"  password \"([^\"]*)\"$")
	public void enter_login_details_username_something_password_something(String strArg1, String strArg2)
			throws Throwable {
		authpageobj.setEmailaddressSignIn(strArg1);
		authpageobj.setPassword(strArg2);
		authpageobj.getSigninbutton().click();

	}


}