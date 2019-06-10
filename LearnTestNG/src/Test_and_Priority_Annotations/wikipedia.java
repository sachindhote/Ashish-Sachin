package Test_and_Priority_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class wikipedia {

	@Test
	public void openwiki() throws InterruptedException
	{
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximise he browser window
		driver.manage().window().maximize();
		
		//Open the url 'https://en.wikipedia.org/wiki/Selenium_(software)'
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		// Click on "Create account" Link
		driver.findElement((By.linkText("Create account"))).click();
		
		//Capture the Current URL
		String currenturl1=driver.getCurrentUrl();
		
		//To check current link is Internal OR external
		if (currenturl1.contains("wikipedia.org"))
		{
			System.out.println(currenturl1 + " is the internal link.");
		}
		else {
			System.out.println(currenturl1+ " is the external link.");
		}
		
		//Navigate back to Selenium Page
		driver.navigate().back();
		Thread.sleep(4000);
		//open selenum website
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		Thread.sleep(4000);
		
		//capture current url
		String currenturl2=driver.getCurrentUrl();
		
		//To check current link is Internal OR external
		if(currenturl2.contains("seleniumhq.org")) {
			System.out.println(currenturl2+ " is the external link.");
		}
		else {
			System.out.println(currenturl2+ " is the internal link.");
		}
		driver.close();
	}

}

