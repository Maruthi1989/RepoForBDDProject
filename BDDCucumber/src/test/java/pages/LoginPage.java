package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{

	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	@FindBy(xpath="//h1[normalize-space()='Logged In Successfully']")
	WebElement Homepage;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		
		highlightElement(Username);
		Username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		highlightElement(Password);
		Password.sendKeys(password);
	}
	
	//This method will click on the submit button....
	
	public void clickSubmit()
	{
		highlightElement(submit);
		submit.click();
	}
	
	//This method will verify the login success or not
	
	public void verifyLoginSuccess()
	{
		if(Homepage.isDisplayed())
		{
			highlightElement(Homepage);
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
			
		}
	}
	
	
	//This method will highlight the webelement
	
	public void highlightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow;');", ele);
	}
}
