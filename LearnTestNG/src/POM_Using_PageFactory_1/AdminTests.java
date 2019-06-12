package POM_Using_PageFactory_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminTests extends FunctionalTests{
	
//	private static final Boolean  = null;
	
	AdminLoginPage admin_login=new AdminLoginPage(driver);
	ManufacturersPage manf=new ManufacturersPage(driver);
	

	//UserInterFacePage user_interface=new UserInterFacePage(driver);
	@Test(priority=1)
	public void loginAdmin()
	{
		
		admin_login.typeUserName("admin");
		admin_login.typePassword("admin@123");
		admin_login.clickButton();
		
		String getcurrentURL=driver.getCurrentUrl();
		
		if (getcurrentURL.equals("http://www.gcrit.com/build3/admin/index.php"))
				{
					System.out.println("Admin login successfully");
				}
		else 
			System.out.println("Admin does not login successfully");
		
	}
	
	@Test(priority=2)
	public void redirctToCustomerInterface()
	{
		admin_login.clickOnlineCatalog();
		Boolean elemntpresent=driver.findElement(By.xpath("//u[text()='login']")).isDisplayed();
		
		if(elemntpresent==true)
		{
			System.out.println("USer is diverted on USer interface");
		}
		else System.out.println("USer is not diverted on USer interface");
	}
	
	@Test(priority=3)
	public void addManufacturer()
	{	
		driver.navigate().back();
		admin_login.clickonManufacturers();
		
		String manftext=  driver.findElement(By.xpath("//td[@class='pageHeading' and text()='Manufacturers']")).getText();
		Assert.assertEquals(manftext, "Manufacturers");
		
		manf.clickInsert();
		String text_nefmanf=driver.findElement(By.xpath("//strong[text()='New Manufacturer']")).getText();
		Assert.assertEquals(text_nefmanf, "New Manufacturer");
		
		manf.entermanfname("Test_Sachin");
		manf.clicksave();
		
		System.out.println("Manufacturer added successfully");
	}
	@Test(priority=4)
	public void editManufacturer()
	{
		//click on Edit button
		manf.clickEdit();
		String text_editmanf=driver.findElement(By.xpath("//strong[text()='Edit Manufacturer']")).getText();
		Assert.assertEquals(text_editmanf, "Edit Manufacturer");
		
		String text_getmanfName=manf.getManfName();
				
		manf.entermanfname(text_getmanfName+123);
		manf.clicksave();
		System.out.println("Manufacturer edited successfully");
		
	}
	@Test(priority=5)
	public void deletManufacturer()
	{
		manf.clickDelete();
		String text_deletmanf=driver.findElement(By.xpath("//strong[text()='Delete Manufacturer']")).getText();
		Assert.assertEquals(text_deletmanf, "Delete Manufacturer");
		manf.clickDelete();
		System.out.println("Manufacturer deleted successfully");
		
	}
	
	
	
	
	
}
