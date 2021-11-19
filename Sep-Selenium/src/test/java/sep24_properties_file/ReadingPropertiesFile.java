package sep24_properties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();//we are creating obj for properties class to copyand print the data in the config file
		FileInputStream fis = new FileInputStream("C:\\automation\\eclipse workspace\\Sep-Selenium\\src\\test\\resources\\properties\\config.properties");//here we created fileinputstream to give loaction of tge file 

		prop.load(fis);//we are loading the file using prop.load and file name is fis so we gave prop.load(fis)
		System.out.println(prop.get("url"));
		System.out.println(prop.get("browser"));//here we use prop.get to get the keys i.e is url, browser information from the file and use it here
		System.out.println(prop.get("username"));
		
	}

}
