package POM_Using_PageFactory_2;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePageTest extends FunctionalTest {

	 
	 
    @Test
    public void showCatalogs(){
    	HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());
        homePage.enterResearch("Selenium");
        homePage.submit();
        
    }
}