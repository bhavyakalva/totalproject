package programs;

public class JsonRequest {
	
	public String addLibrary() {
		String name = "{\r\n" + 
				"\"name\":\"Learn API Automation with Java.\",\r\n" + 
				"\"isbn\":\"santoshDCITNew\",\r\n" + 
				"\"aisle\":\"11.2\",\r\n" + 
				"\"author\":\"Santosh Kuamr\"\r\n" + 
				"}";
		return name;
	}
	
	public String addLibrary2(String Num) {
		String name = "{\r\n" + 
				"\"name\":\"Learn API Automation with Java.\",\r\n" + 
				"\"isbn\":\"santoshAPI.Net1\",\r\n" + 
				"\"aisle\":\""+Num+"\",\r\n" + 
				"\"author\":\"Santosh Kuamr\"\r\n" + 
				"}";
		return name;
	}
	
}
