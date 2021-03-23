package Tests;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Broeser_SetUp.Launch_Browser;
import Pages.Login_Page;

public class Login_Test extends Login_Page
{

	static String browser_Type ="chrome";
	static String Url ="http://mykidsbank.org";
	Login_Page lp =  PageFactory.initElements(Launch_Browser.driver, Login_Page.class);
	
	@BeforeMethod(alwaysRun=true)
	public void open_browser()
	{
		Launch_Browser brwser = new Launch_Browser();

		brwser.browsers(browser_Type, Url);
		

	}
	
	@AfterMethod
	public void Close_browser() throws InterruptedException
	{
		//Thread.sleep(5000);
		//brwser.driver.close();
	}
	
	@Test ( groups = "Valid_Cred")
	public  void Valid_Reg_TC1()
	{

		
		Bnk_Id("66907");
		UserNames("banker");
		Passwords("abc123");
		Login_btns();
	}

	@Test( groups = "INValid_Cred")
	public  void InValid_Reg_TC1()
	{

		Bnk_Id("66907");
		UserNames("banker");
		Passwords("abc123");
		Login_btns();
	}
	
	
	@Test( groups = "INValid_Cred")
	public  void INValid_Reg_TC2()
	{
		Bnk_Id("66907");
		UserNames("banker");
		Passwords("abc123");
		Login_btns();
	}
  
}
