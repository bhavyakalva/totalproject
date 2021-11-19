package programs;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Sample4GetPostStringFromAMethodWithParam {

	public static void main(String[] args) {
	
		//get the request string from the method
		RestAssured.baseURI = "http://216.10.245.166/";	

		System.out.println("Get request from the method");
		JsonRequest obj = new JsonRequest();
		String response = given().log().body().
				header("Content-Type","application/json")
		.body(obj.addLibrary2("61")).
		when().
				post("Library/Addbook.php")
		.then().log().body().extract().response().asString();
		
		System.out.println(response);
	}

}

