Feature: Testcases for contactus page 
@smoke 
Scenario: ContactusTestcase001 
	Given open the browser and navigate to application url 
	When click on contactus 
	Then verify the contactus page exist or not 
	
@smoke 
Scenario: ContactusTestcase002 
	Given open the browser and navigate to application url 
	When click on contactus 
	Then verify the contactus page exist or not 
	When enter the contactus details 
		|selecttype      | Email            | orderreference| Message                 |
		|webmaster       |bhavyaak@gmail.com|1234567890     |hello my order is missing|
	Then Verify the success message 
	
@smoke @regression 
Scenario: ContactusTestcase003 
	Given open the browser and navigate to application url 
	When click on contactus 
	Then verify the contactus page exist or not 
	When enter the contactus details 
		|selecttype      | Email            | orderreference| Message|
		|webmaster       |bhavyaak@gmail.com|1234567890     |        |
	Then Verify the failure message 