package DataDriven_annotation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DataDriven_AnnotationPOI {
  
	WebDriver driver;
	
	@DataProvider(name="testdata")
    public Object [][] readExcel() throws BiffException, IOException 
	{	
		File file = new File("C:\\D Drive Backup\\Sachin\\Selenium\\inputdata.xls");
		 
		//Create an object of FileInputStream class to read excel file
	    FileInputStream inputstream=new FileInputStream(file);
	    
	    HSSFWorkbook wb =new HSSFWorkbook(inputstream);
	    
	  //Read sheet inside the workbook by its name
	    HSSFSheet sh = wb.getSheet("Sheet1");

	  //Find number of rows in excel file
	    int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
	    Row row=null;
	    int coulmnCount=row.getLastCellNum();
	    
	    String [][]input =new String[rowCount][coulmnCount]; 	
	    
	    for (int i = 0; i < rowCount+1; i++) 
	    {
	        row = sh.getRow(i);

	        //Create a loop to print cell values in a row
	        for (int j = 0; j < row.getLastCellNum(); j++) 
	        {
	            //Print Excel data in console
	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	            input[i][j]=row.getCell(j).getStringCellValue();
	        }
	    }
	    return input;
	}


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
		
		Assert.assertEquals( driver.getCurrentUrl(),"http://www.gcrit.com/build3/admin/index.php");
		
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}


}
