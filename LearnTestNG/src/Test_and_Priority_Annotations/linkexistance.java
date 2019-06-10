package Test_and_Priority_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkexistance {

	@Test
	public void checklinkexistance() {
	
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		//check link existance without Exception handling
		try {
		
		boolean linkexist_1=driver.findElement(By.linkText("Yahoo")).isDisplayed();
		if(linkexist_1==true) {
			System.out.println("Yahoo link exist");
		}
		else {
		System.out.println("Yahoo link does not exist");	
		}
		}
		catch(NoSuchElementException e){
			
				System.out.println("Gmail link does not exist");	
							
		}
		//check link existance with Exception handling
		try {
			boolean linkexist_2=driver.findElement(By.linkText("Gmail")).isDisplayed();
			
			if(linkexist_2==true) {
				System.out.println("Gmail link exist");
			}
		}
		catch(NoSuchElementException e){
			
				System.out.println("Gmail link does not exist");	
							
		}
		
		driver.close();
	}
}
