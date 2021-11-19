package Sep17;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		String handlevalue =driver.getWindowHandle();
		System.out.println(handlevalue);//o/p-CDwindow-321413AA766633A5FA6206F3D2BB882A
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set <String> Handlevalues=driver.getWindowHandles();
		for(String h:Handlevalues)
		{
			//System.out.println(Handlevalues);//o/p->[CDwindow-E44CF83CA9D432DF470E3D372DDE2ACE, CDwindow-2C4B44DA02A357D39EE83EEAA96BA4A6]
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);//Frames & windows
			                          //Selenium
			
//			if(title.equals("Frames & windows")) {//here we used the first window name so it closed to close secound window just give 
//				driver.close();                    //secound window name in place of first window
//			}
			
			//how to do any operation like click on webelement in secound page we use this method  
			if(title.equals("Selenium")) {
				driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span")).click();//if title equals to secound page then do operation
			}	
		}	
}
}