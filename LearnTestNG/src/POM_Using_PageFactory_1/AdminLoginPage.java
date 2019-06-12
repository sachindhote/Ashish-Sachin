package POM_Using_PageFactory_1;
//import Smoketest.POM.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends PageObject {

	WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username_textbox;
	//private WebElement username_textbox=driver.findElement(By.xpath("//input[@name='username']"));
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//span[@class='ui-button-text']")
	private WebElement login_button;
	
	//gcrSHop image
	@FindBy(xpath="//img[@title=' GCR Shop Admin ']")
	private WebElement image;
	
	@FindBy(xpath="//a[text()='Administration']")
	private WebElement link_administration;
	
	@FindBy(xpath="//a[text()='Online Catalog']")
	private WebElement link_Catalog;
	
	@FindBy(xpath="//a[text()='Support Site']")
	private WebElement link_site;
	
	@FindBy(xpath="//a[text()='Manufacturers']")
	private WebElement link_Manufacturers;
	
	
	public AdminLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void typeUserName(String username)
	{
		username_textbox.sendKeys(username);
	}
	
	public void typePassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	
	public void clickButton()
	{
		login_button.click();
	}
	
	public void clickOnlineCatalog()
	{
		link_Catalog.click();
	}
	
	public void clickonManufacturers()
	{
		link_Manufacturers.click();
	}
	
	
	
}

