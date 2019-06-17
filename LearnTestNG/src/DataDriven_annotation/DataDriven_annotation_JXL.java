package DataDriven_annotation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven_annotation_JXL {

	WebDriver driver;
	 // read the data from excel and store it in a DataProvider object	
	 @DataProvider(name="testdata")
	 public Object [][] readExcel() throws BiffException, IOException 
	 {
			
	   File f=new File("C:\\D Drive Backup\\Sachin\\Selenium\\inputdata.xls"); // use only .xls format, .xlsx will not work
	   	Workbook wb=Workbook.getWorkbook(f);
	   	Sheet s1=wb.getSheet("Sheet1"); // u can mentioned index of sheet also instead of sheet name
		int rows=s1.getRows();
		int columns=s1.getColumns();
		//System.out.println(rows+ " "+ columns);
		String inputs [] [] = new String [rows][columns];
		
		for (int i=1;i<rows;i++)
		{
			for (int j=0;j<columns;j++)
			{
				Cell c=s1.getCell(j, i);
				inputs[i][j] =c.getContents();
				System.out.println(inputs[i][j]);
			}
		}
			return inputs;
	  }

	//passing the dataprovider to this test in which data is stored in above method	
	@Test(dataProvider="testdata")
	public void adminlogin(String Uname,String Pwd) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\D Drive Backup\\Sachin\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
			
		driver.get("http://www.gcrit.com/build3/admin/");
			
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
			
		Thread.sleep(4000);
			
		Assert.assertEquals(driver.getCurrentUrl(),"http://www.gcrit.com/build3/admin/index.php");
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
		
	

}
