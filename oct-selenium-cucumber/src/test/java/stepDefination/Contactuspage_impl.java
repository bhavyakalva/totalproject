package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;

import org.junit.Assert;
import Base.TestBase;

public class Contactuspage_impl extends TestBase {

	@Given("open the browser and navigate to application url")
	public void open_the_browser_and_navigate_to_application_url() {
		setup();

	}

	@When("click on contactus")
	public void click_on_contactus() {
		homepageobj.getContactUs().click();

	}

	@Then("verify the contactus page exist or not")
	public void verify_the_contactus_page_exist_or_not() {

		String Contactus_pagetext = contactuspageobj.getContactuspagetext().getText();
		String text = "CUSTOMER SERVICE - CONTACT US";
		Assert.assertEquals(Contactus_pagetext, text);

	}

	@When("enter the contactus details")
	public void enter_the_contactus_details(DataTable data) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> res = data.cells();
		contactuspageobj.setSubjectHeading(res.get(1).get(0));
		contactuspageobj.setEmailaddress(res.get(1).get(1));
		contactuspageobj.setOrderreference(res.get(1).get(2));
		contactuspageobj.setMessage(res.get(1).get(3));
		contactuspageobj.getSendbutton().click();

	}

	@Then("^Verify the success message $")
	public void verify_the_success_message() throws Throwable {
		String successmessage = contactuspageobj.getContactusSuccessMessage().getText();
		String message = "Your message has been successfully sent to our team.";
		Assert.assertEquals(successmessage, message);

	}

	@Then("^Verify the failure message $")
	public void verify_the_failure_message() throws Throwable {
		String errormessage = contactuspageobj.getContactusErrorMessage().getText();
		String emessage = "The message cannot be blank.";
		Assert.assertEquals(errormessage, emessage);

	}

	@After
	public void closebrowser() {
		driver.close();
	}

}
