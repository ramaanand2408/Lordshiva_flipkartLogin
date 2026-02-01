package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage{

WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		//here we are calling parent class driver
	    //(base page which contains page factory method which helps to identify the elements using find by annotation)
		super(driver);	
		
	}
	
	@FindBy (xpath="//div[@class='iOpC5p']/a[text()='New to Flipkart? Create an account']")  WebElement Link_createaccount;
	@FindBy (xpath="//a[@class='dSM5Ub Kv3ekh evKOtR']") WebElement confirmation;
	
	
	public void clickCreateaccount()
	{
		//Link_createaccount.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(Link_createaccount).click().Perform();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", Link_createaccount);
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(Link_createaccount)).click();
		
		Link_createaccount.sendKeys(Keys.ENTER);
		
		
		
	}
	
	public String getConfirmation() {
		try {
			return confirmation.getText();
		} catch (Exception e)
		{
			return (e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
}
