package POM_Using_PageFactory_2;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.*;
/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePage extends PageObject {
	private WebDriver driver;
	
     @FindBy(name="q")
     private WebElement searchInput;
	//private WebElement searchInput=driver.findElement(By.id("lst-ib")); // no need of @FindBy(id="lst-ib")

    @FindBy(className="btn-yamm")
    private WebElement myTiendo;

    @FindBy(xpath = "//*[@id=\"results-allOffersSection\"]/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/span")
    private WebElement firstCatalog;

    @FindBy(className = "navbar")
    private WebElement navbar;
    
    @FindBy(xpath="//input[@id='gbqfbb']//preceding-sibling::input")
    private WebElement button;

    public HomePage(WebDriver driver){
        super(driver);
    	//PageFactory.initElements(driver,this);
        //  assertTrue(this.searchInput.isDisplayed());
        assertTrue(this.searchInput.isDisplayed());
    }    
    public void enterResearch(String research){
        searchInput.clear();
        searchInput.sendKeys(research);
        
      //  this.searchInput.clear();
      //  this.searchInput.sendKeys(research);
    }

    public ResearchPage submit(){
       // searchInput.click();
    	button.click();
        return new ResearchPage(driver);
    }

    public boolean isInitializedNavbar() {
        return navbar.isDisplayed();
    }
    public boolean isInitialized() {
        return searchInput.isDisplayed();
    }

}