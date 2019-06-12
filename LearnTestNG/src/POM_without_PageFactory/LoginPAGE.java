package POM_without_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPAGE {

	WebDriver driver;
	//create elements using element locators
	By userName=By.name("username");
	By password=By.name("password");
	By loginButton=By.className("ui-button-text");
	By errorMessage =By.className("messageStackError");
	By OnlineCatalog_link=By.linkText("Online Catalog");
	
	
	//constructor in java is block of code similar to a method that is called an instance of object is created
	public LoginPAGE(WebDriver driver) {
		this.driver=driver;				// this is java keyword, use to invoke or instantiate current class constructor
		
		// Check that we're on the right page.
        if (!"Login".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }
	}
	
	//Create user actions
	public void typeUserName(String UName) {
		driver.findElement(userName).sendKeys(UName);
	}
	
	public void captureUserName() {
		String username=driver.findElement(userName).getAttribute("value");
	}
	
	public void clearUserName() {
		driver.findElement(userName).clear();
	}
	
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clearPassword() {
		driver.findElement(password).clear();
		
	}
	public void clickButton() {
		driver.findElement(loginButton).click();
	}
	public String captureError() {
		String ErrorMessage=driver.findElement(errorMessage).getText();
		return ErrorMessage;
	}
	
	public void clickLink() {
		driver.findElement(OnlineCatalog_link).click();
	}

}
