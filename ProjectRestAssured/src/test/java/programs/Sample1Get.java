package programs;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Sample1Get {

	public static void main(String[] args) {
		//https://postman-echo.com/cookies/set?foo1=bar1&foo2=bar2
		// to  validate the status
		RestAssured.baseURI ="https://postman-echo.com";
		given().
		            param ("foo1","bar1").
	            	param ("foo2","bar2").
		when().
		            get("cookies/set").
		then().
		assertThat().statusCode(200);
		System.out.println("status code is 200 and pass");
		
		// to validate the status and content type
	RestAssured.baseURI="https://postman-echo.com";
	given(). 
	            param("foo1","bar1").
	            param("foo2","bar2").
	  when().
	               get("cookies/set").
	    then().
	    assertThat().statusCode(200).contentType(ContentType.JSON);
	System.out.println("status code is 200 and content type is JSON");

	// To validate json body
	//Note: i changed the URI, below line is the example
	//http://dummy.restapiexample.com/api/v1/employees
	String empname ="Tiger Nixon";
	RestAssured.baseURI="http://dummy.restapiexample.com";
	given().
	when().
	get("api/v1/employees").
	then().
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("data[0].employee_name",equalTo(empname));
	System.out.println("emp name is "+ empname +"emp validation is dome successfully");
	
	//Verify the "Emp Name" and "Salary" from body.
	RestAssured.baseURI="http://dummy.restapiexample.com";
	given().
	when().
	get("api/v1/employees").
	then().
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("data[0].employee_name",equalTo("Tiger Nixon"))
	.body("data[0].employee_salary",equalTo(320800));
	System.out.println("verifying the emp Name and Salary is Done");
	
	//Validating the Response "Headers"
	RestAssured.baseURI="http://dummy.restapiexample.com";
	given().
	when().
	get("api/v1/employees").
	then().
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and();
	System.out.println("validating the headers is Done");	
	
	
	}


}
