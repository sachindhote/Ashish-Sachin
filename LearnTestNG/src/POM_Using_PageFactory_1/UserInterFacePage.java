package POM_Using_PageFactory_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInterFacePage extends PageObject{

	WebDriver driver;
	
	@FindBy(xpath="//u[text()='login']")
	private WebElement link_Login;
	
	@FindBy(xpath="//u[text()='create an account']")
	private WebElement link_createaccount;
	
	public UserInterFacePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void elementExist() {
		link_createaccount.isDisplayed();
	}
}
