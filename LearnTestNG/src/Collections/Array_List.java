package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array_List {

	WebDriver driver;
	
	public static void main(String [] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links" + list.size());
		ArrayList<String> linktext=new ArrayList<String>();
		
		for(WebElement element:list) {
			try {
				linktext.add(element.getText());
				//String str=element.getText();
				//System.out.println(str);
			}catch(Exception e) {
				
			}
			System.out.println("*********************************************");
			System.out.println("Size of the ArrayList"+linktext.size());
			
			for(String s : linktext) {
				System.out.println(s);
			}
	}
	
	}
	
	
	

}
