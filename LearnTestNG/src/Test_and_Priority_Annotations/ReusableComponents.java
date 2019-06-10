package Test_and_Priority_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReusableComponents {

	public static WebDriver driver;
	public ReusableComponents btch;
	String ErrorMEssage;

	//Launch Browser
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/");
	}
	//close Browser
	public void CloseBrowser() {
		driver.close();
	}
	public void adminlogin(String Uname,String PWD) {
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
	
	//TC 1 Verify adming login
	@Test(priority=1)
	public void verifyAdminLogin() {
		btch=new ReusableComponents();
		
		btch.LaunchBrowser();
		btch.adminlogin("admin","admin@123");
		String currenturl=driver.getCurrentUrl();
		if (currenturl.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Admin login is successfull");
		}
		else
		{
			System.out.println("Admin login is uncessfull.");	
		}
		btch.CloseBrowser();
	}
	
	//TC 2 - Verify the login functionality in login functionality
	@Test(priority=2)
	public void InvalidAdminLogin() {
		btch.LaunchBrowser();
		btch.adminlogin("admin1","admin@1234");
		String url=driver.getCurrentUrl();
		
		if (!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			ErrorMEssage=driver.findElement(By.xpath("//tr/td[@class=\"messageStackError\"]")).getText();
			System.out.println(ErrorMEssage);
			
		}
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin login is Successful-Passed");
		}
		else if(ErrorMEssage.contains("Error: Invalid administrator login attempt.")) {
			
			System.out.println("Admin login is Uncessusful, Shwowing the correct error message for Uncessusful Login-Passed");
			
		}
		else {
			System.out.println("Admin login is Uncessusful but not Shwoing the correct error message.-Failed");
		}
		btch.CloseBrowser();
	}
	
	//TC 3Verify Recording functionality after login(redirecting from admin to customer interface)
	@Test(priority=3)
	public void redirect() throws InterruptedException {
		btch.LaunchBrowser();
		btch.adminlogin("admin","admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("create")).click();
	}

}
