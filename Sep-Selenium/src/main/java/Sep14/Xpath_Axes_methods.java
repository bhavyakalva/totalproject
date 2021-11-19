package Sep14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\automation\\eclipse workspace\\Sep-Selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xpath axes methods :-
		//self, parent , child, sibling, Ancestor, Decendent, following, following sibling , preceding, preceding sibling
		//self node is the node we use
		//parent node - select the parent of current node
		//child- select all childrens of current node (one or more)
		// sibling- select all siblings of current node 
		//decendent - select all decendants (children, grand children etc..)
		//ancestor - select all ancestors(parent,grand parent,)
		//following - select every thing on the document after closing tag of current node/self node
        //following sibling -  select all following  siblings of current node 
		//preceding - select all nodes that appear before current node 
		//preceding sibling- select all preceding sibling nodes that appear before the current node 
}
}