package stepDefination;

import java.util.List;

import Base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsimpl extends TestBase {
	@Given("^Open application automationpractise$")
	public void open_application_automationpractise() throws Throwable {
		System.out.println("open application");
	}

	@When("^Click on the ContactUs link$")
	public void click_on_the_contactus_link() throws Throwable {
		System.out.println("click on the contactus");

	}

	@Then("^Verify page is exist or not\\?$")
	public void verify_page_is_exist_or_not() throws Throwable {
		System.out.println("verify the page");
	}

	@When("^Provide details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void provide_details_something_something_something_something(String strArg1, String strArg2, String strArg3,
			String strArg4) throws Throwable {
		System.out.println("provide details" + strArg1 + strArg2 + strArg3 + strArg4);

	}

	@Then("^Verify the success message$")
	public void verify_the_success_message() throws Throwable {
		System.out.println("verify the success message");

	}

	@When("^Provide details \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void provide_details_something_somethingsomething(String strArg1, String strArg2, String strArg3)
			throws Throwable {

		System.out.println("provide details" + strArg1 + strArg2 + strArg3);

	}

	@Then("^Verify the failure message$")
	public void verify_the_failure_message() throws Throwable {
		System.out.println("verify the failure message");

	}

	@When("Provide details")
	public void provide_details(io.cucumber.datatable.DataTable data) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> res = data.cells();
		for (int i = 0; i < res.size(); i++) {

			System.out.println(res.get(i).get(0));
			System.out.println(res.get(i).get(1));
			System.out.println(res.get(i).get(2));
			System.out.println(res.get(i).get(3));
		}
	}

	@When("^Provide details selecttype(.+) and email(.+) and orderrefernce(.+) and message(.+)$")
	public void provide_details_selecttype_and_email_and_orderrefernce_and_message(String selecttype, String email,
			String orderreference, String message) throws Throwable {
		System.out.println("select type is " + selecttype);
		System.out.println("email is " + email);
		System.out.println("orderrefernce is " + orderreference);
		System.out.println("message is " + message);
	}
}
