package BeforeAndAfter_TestAndMethod_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotation {
  
WebDriver driver; 
	
	@BeforeMethod
	public void launchBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	} 
	
	@Test (priority=1) 
	public void verifyGoogleTitle()
	{ 
		driver.get("https://www.google.co.in/"); 
		String pageTitle=driver.getTitle(); 
		Assert.assertEquals(pageTitle, "Google"); 
	} 
	
	@Test (dependsOnMethods="verifyGoogleTitle") 
	public void verifyYahooTitle()
	{ 
		driver.navigate().to("https://in.yahoo.com/"); 
		String pageTitle=driver.getTitle(); 
		Assert.assertEquals(pageTitle, "Yahoo India"); 
	} 
	
	@Test (dependsOnMethods="verifyYahooTitle")
	 public void verifygcrShopTitle()
	{ 
		driver.navigate().to("http://www.gcrit.com/build3/"); 
		String pageTitle=driver.getTitle(); 
		Assert.assertEquals(pageTitle, "GCR Shop");
	 }

	@AfterMethod
	public void closeBrowser()
	{ 
		driver.close(); 
	}

	
}
