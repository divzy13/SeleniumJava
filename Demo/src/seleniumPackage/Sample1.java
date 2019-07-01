package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public static void main(String[] args) throws InterruptedException {

		//define browser driver in system properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divv1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open CGI page
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cgi.com/en");
		
		//print page title
		System.out.println("CGI Page Title is : "+driver.getTitle());
		
		//print page URL
		System.out.println("CGI Page URL is : "+driver.getCurrentUrl());
		
		//wait for 5 seconds
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
	}

}
