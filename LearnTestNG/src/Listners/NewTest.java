package Listners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
 
	@Test
  public void floginByEmail() {
		System.out.println("Login by email");
		Assert.assertEquals("sachin", "sachin");//True
	}
	
	@Test
	public void loginByFacebook() {
		System.out.println("Logn By Facebook");
		Assert.assertEquals("Sachin","Dhote");//False
	}
}
