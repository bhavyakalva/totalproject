package sep29_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.TestBase;

public class ContactUs extends TestBase {

	@Test
	public void ContactUsTest001() {
		homepageobj.getContactUs().click();
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		Assert.assertEquals(contactuspageobj.getContactusSuccessMessage().getText(),
				"Your message has been successfully sent to our team.");
		System.out.println("ContactUsTest001 PASS");

	}

	@Test
	public void ContactUsTest002() {
		homepageobj.getContactUs().click();
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.getSendbutton().click();
		Assert.assertEquals(contactuspageobj.getContactusErrorMessage().getText(), "The message cannot be blank.");
		System.out.println("ContactUsTest002 PASS");

	}

	@Test
	public void ContactUsTest003() {
		homepageobj.getContactUs().click();
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.getSendbutton().click();// here i gave wrong erroe message to wantedly fail testcase
		if (contactuspageobj.getContactusErrorMessage().getText().equals("The message cannot be ")) {
			System.out.println("ContactUsTest003 PASS");
			Assert.assertTrue(true);
		} else {
			System.out.println("ContactUsTest003 failed due to the mismatch in the text");
			Assert.assertTrue(false);
		}
	}

	@Test
	public void ContactUsTest004() {
		homepageobj.getContactUs().click();
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		Assert.assertEquals(contactuspageobj.getContactusInvalidEmailerrorMessage().getText(),
				"Invalid email address.");
		System.out.println("ContactUsTest004 PASS");

	}

	@Test
	public void ContactUsTest005() {
		homepageobj.getContactUs().click();
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		Assert.assertEquals(contactuspageobj.getContactusSubjectHeadingErrorMessage().getText(),
				"Please select a subject from the list provided.");
		System.out.println("ContactUsTest005 PASS");

	}

}
