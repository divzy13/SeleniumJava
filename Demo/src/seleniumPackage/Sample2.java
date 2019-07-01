package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Sample2 {
	WebDriver driver;
	
	 @BeforeTest
	    public void startingTests() throws Exception {
		//open Web page
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\divv1\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//open sample page
			driver.manage().window().maximize();
			driver.navigate().to("https://www.seleniumeasy.com/test/");
			Thread.sleep(5000);
	    }

	 @Test
	 	public void findElementByID() throws Exception {
		 //Get the element by using its ID
		 //<input type="text" class="form-control" placeholder="Enter value" id="sum1">
		 driver.findElement(By.id("sum1")).sendKeys("50");
	 }
	 
	 @Test
	 	public void findElementByName() throws Exception {
		 //Get the elements by using its Name and get its attributes
		 //<input type="text" class="form-control" placeholder="Please enter your Message" id="user-message">
		 System.out.println(driver.findElement(By.id("user-message")).getAttribute("type")); //text
		 System.out.println(driver.findElement(By.id("user-message")).getAttribute("class")); //form-control
		 System.out.println(driver.findElement(By.id("user-message")).getAttribute("placeholder")); //Please enter your Message
	 }
	 
	 @Test
	 	public void findElementByClassName() throws Exception {
		 //Use className and get the text
		 //<div id="site-slogan" class="site-slogan">Complete Automation Testing Tutorials</div>
		 System.out.println(driver.findElement(By.className("site-slogan")).getText()); //Complete Automation Testing Tutorials
	 }
	 
	 @Test
	 	public void findElementsByAllClassName() throws Exception {
		 //use class attributes and get all the text
		 System.out.println("Total Items with same class names are: "+driver.findElements(By.className("panel-heading")).size());
		 List<WebElement> lsElements = driver.findElements(By.className("panel-heading"));
		 
		 for(WebElement list : lsElements) {
			 System.out.println(list);
			 //Menu List
			 //Single Input Field
			 //Two Input Fields
		 }
	 }
	 
	 @AfterTest
	    public void endingTests() throws Exception {
	        driver.quit();
	    }
}
