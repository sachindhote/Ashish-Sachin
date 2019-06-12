package BeforeAndAfter_TestAndMethod_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class TestNGFile {

	public String baseurl="http://newtours.demoaut.com/";
	public WebDriver driver;
	public String expected=null;
	public String actual=null;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@BeforeMethod
	public void verifyHomePageTitle() {
		expected="Welcome: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected="Register: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected="Under Construction: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
  public void goBAckTOHomePage() {
		driver.findElement(By.linkText("Home")).click();
  }

    @AfterTest
  public void closeBrowser() {
    	driver.close();
  }

}
