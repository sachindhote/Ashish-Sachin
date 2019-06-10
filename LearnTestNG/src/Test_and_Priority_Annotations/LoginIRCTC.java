package Test_and_Priority_Annotations;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginIRCTC {

	@Test
	public void Login_IRCTC() {
	
	System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	
	driver.findElement(By.id("usernameId")).sendKeys("sjdhote");
	driver.findElement(By.className("loginPassword")).sendKeys("GPET123");
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter captch: ");
	String catpcha= scan.nextLine();
	
	driver.findElement(By.xpath("//input[@id='nlpAnswer']")).sendKeys(catpcha);
	//driver.
	
	driver.findElement(By.id("loginbutton")).click();
	
	try{
	
		if(driver.findElement(By.linkText("Sign Out")).isDisplayed()){
		System.out.println("user successfully login to IRCTC portal");
		}
	}
	catch(NoSuchElementException e) {
		System.out.println("User fail to login to IRCTC portal");
	}
		
	driver.close();
	}
}

