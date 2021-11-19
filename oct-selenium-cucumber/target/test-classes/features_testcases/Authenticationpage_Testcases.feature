Feature: Authentication testcases

@login
Scenario: Logintestcase001
Given open the browser and navigate to the application url
When click on the SignIn
Then verify the Authentication page is exist or not 
When enter login details username "bhavyaak@gmail.com"  password "sony1234"
