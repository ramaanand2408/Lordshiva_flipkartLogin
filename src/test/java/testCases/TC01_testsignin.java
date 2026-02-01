package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC01_testsignin extends Baseclass {
	
		
	@Test
	public void verifySignUp()
	{
		
		HomePage hm= new HomePage(driver);
		hm.clickLogin();
		RegisterPage ca = new RegisterPage(driver);
		ca.clickCreateaccount();
		Assert.assertEquals(ca.getConfirmation(),"Existing User? Log in" );
	}
	
	

}
