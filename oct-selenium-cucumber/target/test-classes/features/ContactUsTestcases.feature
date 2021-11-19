Feature: Here we are verifying the functionality of Contact us 

Scenario: Verify_the_contact_us_functionality001 
	Given Open application automationpractise 
	When Click on the ContactUs link 
	Then Verify page is exist or not? 
	When Provide details "webmaster", "bhavyaak@gmail.com", "1234567890", "hello my order is missing" 
	Then Verify the success message 
	
Scenario: Verify_the_contact_us_functionality002 
	Given Open application automationpractise 
	When Click on the ContactUs link 
	Then Verify page is exist or not? 
	When Provide details "webmaster", "bhavyaak@gmail.com","1234567890" 
	Then Verify the failure message 
	
Scenario: Verify_the_contact_us_functionality003 
	Given Open application automationpractise 
	When Click on the ContactUs link 
	Then Verify page is exist or not? 
	When Provide details 
		|selecttype      | Email            | orderreference| Message                 |
		|webmaster       |bhavyaak@gmail.com|1234567890     |hello my order is missing|
		|customerservice |bhavyaak@gmail.com|123456         |hi my order is missing   |
	Then Verify the success message 
	
	
Scenario Outline: Verify_the_contact_us_functionality004 
	Given Open application automationpractise 
	When Click on the ContactUs link 
	Then Verify page is exist or not? 
	When Provide details selecttype<selecttype> and email<Email> and orderrefernce<orderreference> and message<Message> 
	Examples: 
		|selecttype      | Email            | orderreference | Message            |
		|webmaster       |bhavyaak@gmail.com| 1234           |my order is missing |
		|customer service|bhavyaak@gmail.com| 123456         |hi order is missing |
		
		
