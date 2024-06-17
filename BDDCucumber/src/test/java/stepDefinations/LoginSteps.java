package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps 
{

	WebDriver driver=null;
	
	LoginPage login=null;
	
	String strUsername="student";
	String strPassword="Password123";
	
	@Before
	public void luanchBrowser()
	{
		String strDriverpath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strDriverpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
    public void tearDown()
    {
    	driver.close();
    }
	
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() 
	{
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() 
	{
	   login=new LoginPage(driver);
	   login.enterUsername(strUsername);
	   login.enterPassword(strPassword);
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() 
	{
	    login.clickSubmit();
	}

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage() 
	{
	   login.verifyLoginSuccess();
	}

}
