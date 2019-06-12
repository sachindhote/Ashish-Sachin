package POM_Using_PageFactory_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManufacturersPage extends PageObject{
	
	WebDriver driver;
	
	@FindBy(xpath="//td[@class='pageHeading' and text()='Manufacturers']")
	private WebElement text_Manufacturers;

	@FindBy(xpath="//span[@class='ui-button-text' and text()='Insert']")
	private WebElement button_Insert;
	
	@FindBy(xpath="//span[@class='ui-button-text' and text()='Edit']")
	private WebElement button_Edit;
	
	@FindBy(xpath="//span[@class='ui-button-text' and text()='Delete']")
	private WebElement button_Delete;
	
	@FindBy(xpath="//input[@type='text' and @name='manufacturers_name']")
	private WebElement textbox_ManufName;
	
	@FindBy(xpath="//span[@class='ui-button-text' and text()='Save']")
	private WebElement button_Save;
	
	public ManufacturersPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickInsert()
	{
		button_Insert.click();
	}
	
	public void entermanfname(String manufname)
	{
		textbox_ManufName.sendKeys(manufname);
	}
	
	public void clicksave()
	{
		button_Save.click();
	}
	public void clickEdit()
	{
		button_Edit.click();
	}
	
	public void clickDelete()
	{
		button_Delete.click();
	}
	
	public String getManfName() {
		return textbox_ManufName.getText();
		
	}
}
