package Pages;

import Pages_Locaters.Login_Page_Locaters;

public class Login_Page extends Login_Page_Locaters
{

	public void Bnk_Id(String Bnk_Ids)
	{	
		Banker_IDS.sendKeys(Bnk_Ids);	
	}
	
	public void UserNames(String Usr_name)
	{	
		Username.sendKeys(Usr_name);	
	}
	
	public void Passwords(String Usr_Password)
	{	
		Password.sendKeys(Usr_Password);	
	}
	
	public void Login_btns()
	{	
		Login_Btn.click();
	}
}
