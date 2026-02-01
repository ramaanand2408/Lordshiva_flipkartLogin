package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//Every page class contains three parts
	//1.constructor
	//2.locators
	//3.actions methods
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		//here we are calling parent class driver
	    //(base page which contains page factory method which helps to identify the elements using find by annotation)
		super(driver);	
			
	}
	
	@FindBy (xpath="//a[@class='iyMZqb']/span") WebElement Link_Login;
	
	
	
	public void clickLogin()
	{
		Link_Login.click();
		//Link_Login.click();
		
	}
	
	

}
