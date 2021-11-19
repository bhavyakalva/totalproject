$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features_testcases/Authenticationpage_Testcases.feature");
formatter.feature({
  "name": "Authentication testcases",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Logintestcase001",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "open the browser and navigate to the application url",
  "keyword": "Given "
});
formatter.match({
  "location": "Authenticationpage_impl.open_the_browser_and_navigate_to_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the SignIn",
  "keyword": "When "
});
formatter.match({
  "location": "Authenticationpage_impl.click_on_the_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Authentication page is exist or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Authenticationpage_impl.verify_the_Authentication_page_is_exist_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter login details username \"bhavyaak@gmail.com\"  password \"sony1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Authenticationpage_impl.enter_login_details_username_something_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});