package DependsOn_Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_DependsOnMethodParameter {
	WebDriver driver; 
	
	@Test 
	public void launchBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
	} 
	
	@Test (dependsOnMethods="verifygcrShopTitle",alwaysRun=true) 
	public void closeBrowser()
	{ 
		driver.close(); 
	} 
	
	@Test (dependsOnMethods="launchBrowser") 
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
		Assert.assertEquals(pageTitle, "Yahoo"); 
	} 
	
	@Test (dependsOnMethods="verifyYahooTitle")
	 public void verifygcrShopTitle()
	{ 
		driver.navigate().to("http://www.gcrit.com/build3/"); 
		String pageTitle=driver.getTitle(); 
		Assert.assertEquals(pageTitle, "GCR Shop");
	 }

}
