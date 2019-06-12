package POM_Using_PageFactory_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalTests {

	
	public static WebDriver driver;

 	//@BeforeClass
    public FunctionalTests(){
 		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
 		driver = new ChromeDriver();
    	System.out.println("Driver creation");
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	driver.get("http://www.gcrit.com/build3/admin/login.php");
 	}
 	
 	@AfterClass
 	public static void tearDown(){
 		driver.manage().deleteAllCookies();
 		driver.close();
 	}
}
