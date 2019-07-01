package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask1 {

	public void OpenHomepage() throws Exception {
		
		//define browser driver in system properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divv1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Try opening CGI page "https://www.cgi.com/en"
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cgi.com/en");
		
		//Get page title
		System.out.println("CGI Page Title is : "+driver.getTitle());
		
		//Get page URL
		System.out.println("CGI Page URL is : "+driver.getCurrentUrl());
		
		//close the browser
		driver.quit();
		
		
	}
}
