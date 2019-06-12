package POM_without_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GCRShopTestCase {
	
	@Test(priority=1)
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginPAGE lp=new LoginPAGE(driver);
		
		driver.get("http://www.gcrit.com/build3/admin/login");
		
		lp.clearUserName();
		lp.typeUserName("admin");
		lp.clearPassword();
		lp.typePassword("admin@123");
		lp.clickButton();
		
		String url=driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
				System.out.println("Admin login is successfull");
		}
		else
		{
			System.out.println("Admin login is uncessfull.");	
		}
		driver.close();
	}
	
	@Test(priority=2)
	public void RedirectAdmintoCustomerUI() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginPAGE lp=new LoginPAGE(driver);
		
		
		driver.get("http://www.gcrit.com/build3/admin/login");
		lp.clearUserName();
		lp.typeUserName("admin");
		lp.clearPassword();
		lp.typePassword("admin@123");
		
		lp.clickButton();
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			lp.clickLink();
			System.out.println("First Verification - Admin user loged in successfully and licked on 'Online Catalog' link-Passed");
		}
		else {
			System.out.println("First Verification - Admin login Unsuccessfully -Failed");
		}
		String url2=driver.getCurrentUrl();
		if (url2.contains("http://www.gcrit.com/build3/")) {
			System.out.println("Second Verification- Redirected from Admin interface to USer interface-Passed");
		}else {
			System.out.println("Second Verification Not Redirected from Admin interface to USer interface-Failed");
		}
		driver.close();
	}
	
	@Test(priority=3)
	public void InvalidAdminLogin() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginPAGE lp=new LoginPAGE(driver);
				
		driver.get("http://www.gcrit.com/build3/admin/login");
		lp.clearUserName();
		lp.typeUserName("admin");
		lp.clearPassword();
		lp.typePassword("admin@1234");
		lp.clickButton();
		Thread.sleep(4000);
		String ErrMEssage=lp.captureError();
		
		if (ErrMEssage.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Thrid Verification - Admin login  Unsuccessfully-Passed");
		}
		else {
			System.out.println("Third Verification - Admin login  Unsuccessfully-Failed");
		}
		driver.close();
	}

}
