package oct4_ExtentReporting;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;

public class TestReporting extends TestBase {
	
	@Test
	public void f() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		 extentLogger = extent.startTest(TestcaseId, "TestStarted");
		 
		  extentLogger.log(LogStatus.PASS, "test passed");
		  extentLogger.log(LogStatus.FAIL, "test failed");
		  extentLogger.log(LogStatus.INFO, "test info");
		  
		
		
		
	}
}
