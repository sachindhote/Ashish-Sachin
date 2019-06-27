package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listners.class)
public class ListnerImplements {
	
	String ErrorMEssage,ErrorMessage_1;
	
	@Test(priority=1)
	public void customerRegisterGCR () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3");
		driver.findElement(By.partialLinkText("create an")).click();
		
		driver.findElement(By.xpath("//tbody//td/input[@name='gender']")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("XYZ");
		driver.findElement(By.id("dob")).sendKeys("11/08/2000");
		driver.findElement(By.name("email_address")).sendKeys("abc.xyzsjdhote@gmail.com");
		driver.findElement(By.name("company")).sendKeys("Google");
		
		driver.findElement(By.name("street_address")).sendKeys("Pimple Saudagar");
		driver.findElement(By.name("postcode")).sendKeys("411027");
		
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
		Select dropdwn=new Select(driver.findElement(By.name("country")));
		dropdwn.selectByVisibleText("India");
						
		driver.findElement(By.name("telephone")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.name("confirmation")).sendKeys("abc@123");
		
		driver.findElement(By.id("tdb4")).click();
		
		String ConfirmationMessage=driver.findElement(By.tagName("h1")).getText();
		
		if (ConfirmationMessage.equals("Your Account Has Been Created!")) {
			System.out.println("Login is successfull");
		}
		else {
			System.out.println("Login is unsuccessfull");
		}
		
		driver.close();
	}
	
	@Test(priority=2)
	public void customerLoginGCRSHop() {
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3");
		driver.findElement(By.tagName("u")).click();
		driver.findElement(By.name("email_address")).sendKeys("abc.xyzsjdhote@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.id("tdb5")).click();
		//boolean Link_Loggoff=driver.findElement(By.xpath("//span[text()='Log Off']")).isDisplayed();
		try {
		if(driver.findElement(By.linkText("Log Off")).isDisplayed())
		{
			System.out.println("Customer successfully login");
			driver.findElement(By.linkText("Log Off")).click();
		}
		}
		catch(NoSuchElementException e) {
			System.out.println("Customer login unsuccesfull.");
		}
		driver.close();
	}

	@Test(priority=3)
	public void adminLogin() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.gcrit.com/build3/admin/");
			driver.findElement(By.xpath("//input [@type='text']")).click();
			driver.findElement(By.xpath("//input [@type='text']")).clear();
			driver.findElement(By.xpath("//input [@type='text']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input [@type='password']")).click();
			driver.findElement(By.xpath("//input [@type='password']")).clear();
			driver.findElement(By.xpath("//input [@type='password']")).sendKeys("admin@123");
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			Thread.sleep(4000);

			String url=driver.getCurrentUrl();
			if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
					{
						System.out.println("Admin login is successfull");
					}
			else
			{
				System.out.println("Admin login is uncessfull.");	
			}
			driver.findElement(By.linkText("Online Catalog")).click();
			Thread.sleep(1000);
			driver.findElement(By.partialLinkText("create")).click();
			driver.quit();
		}
		
	@Test(priority=4)
	public void InvalidAdminLogin() {
		
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.xpath("//input [@type='text']")).click();
		driver.findElement(By.xpath("//input [@type='text']")).clear();
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//input [@type='password']")).click();
		driver.findElement(By.xpath("//input [@type='password']")).clear();
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		String url = driver.getCurrentUrl();
		
		if (!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			ErrorMEssage=driver.findElement(By.xpath("//tr/td[@class=\"messageStackError\"]")).getText();
			System.out.println(ErrorMEssage);
			
		}
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin login is Successful-Passed");
		}
		else if(ErrorMEssage.contains("Error: Invalid administrator login attempt.")) {
			
			System.out.println("Admin login is Unsuccessful, Showing the correct error message for Unsuccessful Login-Passed");
			
		}
		else {
			System.out.println("Admin login is Unsuccessful but not Showing the correct error message.-Failed");
		}

	
}
}