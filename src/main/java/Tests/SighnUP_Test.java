package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Broeser_SetUp.Launch_Browser;
import Pages.Sign_up_Page;

public class SighnUP_Test
{
	
	static String browser_Type ="edge";
	static String Url ="http://mykidsbank.org";

	@BeforeMethod
	public void open_browser()
	{
		Launch_Browser brwser = new Launch_Browser();
		brwser.browsers(browser_Type, Url);
	}
	
	@AfterMethod
	public void Close_browser()
	{
		Launch_Browser brwser = new Launch_Browser();
		brwser.browsers(browser_Type, Url);
	}
	
	@Test
	public static void Valid_Reg()
	{
		Sign_up_Page sp =  PageFactory.initElements(Launch_Browser.driver, Sign_up_Page.class);
		
		sp.FirstName("John");
		sp.LastName("Smith");
		sp.YourEmail("John@example.com");
		sp.ReYourEmail("John@example.com");
		sp.Passwords("john1234");
		sp.Parent_Gurds();
		sp.Signup();
	}

	
	
}
