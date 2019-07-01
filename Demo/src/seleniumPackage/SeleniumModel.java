package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumModel {
	WebDriver driver;
	boolean blnDN = false;
	boolean blnItems = false;
	
	@BeforeTest
	public void startTest() throws Exception {
		//open Web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divv1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//open sample page
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
	}
	
	@Test
	public void validatePage() throws Exception {
		//click on input form link
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(.,'Input Forms')]")).click();
		Thread.sleep(2000);
		//verify dropdown is opened
		blnDN = driver.findElement(By.xpath("//li[@class='dropdown open']")).isDisplayed();
		if(blnDN) //if drop down is opened
		{	
			blnItems = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(.,'Simple Form Demo')]")).isDisplayed();
			if(blnItems) //if out item exist in the drop down list
			{
				driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(.,'Simple Form Demo')]")).click();
				Thread.sleep(2000);
				System.out.println("Single Input Field Validation");
				System.out.println("Enter a New message inside the message box as : 'Text box field'");
				Thread.sleep(2000);
				//enter the message
				driver.findElement(By.id("user-message")).sendKeys("Text box field");
				Thread.sleep(4000);
				//click on show message box
				driver.findElement(By.xpath("//button[@class='btn btn-default' and contains(.,'Show Message')]")).click();
				//validate the displayed message as 'Text box field'
				String strMs = driver.findElement(By.id("display")).getText();
				if(strMs.equalsIgnoreCase("Text box field")) {
					System.out.println("Entered Message is 'Text box field'");
					Thread.sleep(5000);
				} else {
					System.out.println("Wrong Message");
				}
			}
		}
		}
		
	@AfterTest
	public void EndTest() throws Exception {
		//This method will run at the end
		driver.close();
	}

}
