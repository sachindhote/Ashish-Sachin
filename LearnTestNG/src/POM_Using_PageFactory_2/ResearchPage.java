package POM_Using_PageFactory_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;
/**
 * Created by clovisolivier on 03/01/2017.
 */
public class ResearchPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(tagName = "search-input")
    private WebElement searchInput;

    public ResearchPage(WebDriver driver){
        super(driver);
        assertTrue(this.header.isDisplayed());
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }
    public String confirmationHeader(){
        return header.getText();
    }

    public String SearchValue(){
        return searchInput.getText();
    }

}