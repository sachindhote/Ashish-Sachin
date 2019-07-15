package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandling {

	@Test
	public void method1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	try {
	driver.findElement(By.name("fake")).click();
	}catch (NoSuchElementException e)
	{
		System.out.println("Element not found");
		System.out.println("Hello");
		throw(e);
	}
	finally {
	System.out.println("Hello");
	driver.close();
	}
	}
	
	@Test
	public void method2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	try {
	driver.switchTo().alert().accept();
	
	}catch (NoAlertPresentException e)
	{
		e.printStackTrace();
	}
	
	}

	
	
}
