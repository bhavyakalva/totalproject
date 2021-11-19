package oct4_ExtentReporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;

public class ContactUs extends TestBase {

	@Test
	public void ContactUsTest001() {

		String TestcaseId = new Object() {
		}.getClass().getEnclosingMethod().getName();// here we are getting the name of the method which is
													// ContactUsTest001 and storing it in TestcaseId 
		extentLogger = extent.startTest(TestcaseId, "this testcase is to very the contactuspage functionality");//this line is used to start the test 

		extentLogger.log(LogStatus.INFO, "clicking on the ContactUs link");//herewe are giving info using logstatus.info
		homepageobj.getContactUs().click();
		
		extentLogger.log(LogStatus.INFO, "verifying if the ContactUs page is exist or not by getting the text");
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		
	    extentLogger.log(LogStatus.INFO, "entering the data");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		
		  extentLogger.log(LogStatus.INFO, "verifying the SuccessMessage displayed properly or not ");
		  Assert.assertEquals(contactuspageobj.getContactusSuccessMessage().getText(),
				"Your message has been successfully sent to our team.");
		  
		  extentLogger.log(LogStatus.PASS,"ContactUsTest001 PASS");

	}

	@Test
	public void ContactUsTest002() {

		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		 extentLogger = extent.startTest(TestcaseId, "TestStarted");
		 
		extentLogger.log(LogStatus.INFO, "clicking on the ContactUs link");
		homepageobj.getContactUs().click();
		 
        extentLogger.log(LogStatus.INFO, "verifying if the ContactUs page is exist or not by getting the text");
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		
		extentLogger.log(LogStatus.INFO, "entering the data without providing the data to message field");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.getSendbutton().click();
		  extentLogger.log(LogStatus.INFO, "verifying the ErrorMessage displayed properly or not with giving correct text ");
		Assert.assertEquals(contactuspageobj.getContactusErrorMessage().getText(), "The message cannot be blank.");
		  extentLogger.log(LogStatus.PASS,"ContactUsTest002 PASS");

	}

	@Test
	public void ContactUsTest003() {

		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		 extentLogger = extent.startTest(TestcaseId, "TestStarted");

		extentLogger.log(LogStatus.INFO, "clicking on the ContactUs link");
		homepageobj.getContactUs().click();
		
        extentLogger.log(LogStatus.INFO, "verifying if the ContactUs page is exist or not by getting the text");
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		
		 extentLogger.log(LogStatus.INFO, "entering the data with out providing the data to message field ");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.getSendbutton().click();// here i gave wrong erroe message to wantedly fail testcase
		  extentLogger.log(LogStatus.INFO, "verifying the ErrorMessage displayed properly or not by giving wrong text ");
		if (contactuspageobj.getContactusErrorMessage().getText().equals("The message cannot be ")) {
			 extentLogger.log(LogStatus.PASS,"ContactUsTest003 PASS");
			Assert.assertTrue(true);
		} else {
			extentLogger.log(LogStatus.FAIL,"ContactUsTest003 failed due to the mismatch in the text");
			Assert.assertTrue(false);
			
		}
	}

	@Test
	public void ContactUsTest004() {

		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		 extentLogger = extent.startTest(TestcaseId, "TestStarted");
		 
        extentLogger.log(LogStatus.INFO, "clicking on the ContactUs link");
		homepageobj.getContactUs().click();

		extentLogger.log(LogStatus.INFO, "verifying if the ContactUs page is exist or not by getting the text");
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		
		 extentLogger.log(LogStatus.INFO, "entering the data with invalid email address ");
		contactuspageobj.setSubjectHeading("Customer service");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		  extentLogger.log(LogStatus.INFO, "verifying the invalidEmailerror Message  displayed properly or not with given text ");
		Assert.assertEquals(contactuspageobj.getContactusInvalidEmailerrorMessage().getText(),
				"Invalid email address.");
		 extentLogger.log(LogStatus.PASS,"ContactUsTest004 PASS");

	}

	@Test
	public void ContactUsTest005() {

		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		 extentLogger = extent.startTest(TestcaseId, "TestStarted");
		 
        extentLogger.log(LogStatus.INFO, "clicking on the ContactUs link");
		homepageobj.getContactUs().click();

		extentLogger.log(LogStatus.INFO, "verifying if the ContactUs page is exist or not by getting the text");
		String contactuspagetext = contactuspageobj.getContactuspagetext().getText();
		Assert.assertEquals(contactuspagetext, "CUSTOMER SERVICE - CONTACT US");
		
		 extentLogger.log(LogStatus.INFO, "entering the data without giving subject heading ");
		contactuspageobj.setEmailaddress("bhavyaak@gmail.com");
		contactuspageobj.setOrderreference("123");
		contactuspageobj.setMessage("hello my order is late");
		contactuspageobj.getSendbutton().click();
		 extentLogger.log(LogStatus.INFO, "verifying the SubjectHeadingError Message  displayed properly or not with given text");
		Assert.assertEquals(contactuspageobj.getContactusSubjectHeadingErrorMessage().getText(),
				"Please select a subject from the list provided.");
		 extentLogger.log(LogStatus.PASS,"ContactUsTest005 PASS");

	}

}
