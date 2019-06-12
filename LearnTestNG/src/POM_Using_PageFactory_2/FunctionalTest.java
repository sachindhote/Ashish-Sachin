package POM_Using_PageFactory_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FunctionalTest
{
	public static WebDriver driver;

 	//@BeforeClass
    public FunctionalTest(){
 		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
 		driver = new ChromeDriver();
    	System.out.println("Driver creation");
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	driver.get("http://www.google.com");
 	}
 	
 	@AfterClass
 	public static void tearDown(){
 		driver.manage().deleteAllCookies();
 		driver.close();
 	}
}