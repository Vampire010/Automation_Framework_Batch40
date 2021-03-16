package Pages;

import Pages_Locaters.Sign_up_Page_Locaters;

public class Sign_up_Page extends Sign_up_Page_Locaters
{
	
	public void FirstName(String First_Names)
	{	
		First_Name.sendKeys(First_Names);	
	}
	
	public void LastName(String Last_Names)
	{	
		Last_Name.sendKeys(Last_Names);	
	}
	
	public void YourEmail(String Your_Emails)
	{	
		Your_Email.sendKeys(Your_Emails);	
	}
	
	public void ReYourEmail(String ReYour_Emails)
	{	
		Re_Your_Email.sendKeys(ReYour_Emails);	
	}
	
	public void Passwords(String Usr_Passwords)
	{	
		Password_txt.sendKeys(Usr_Passwords);	
	}
	
	public void Parent_Gurds()
	{	
		Parent_Guardian.click();
	}
	
	public void Signup()
	{	
		Sign_Up.click();
	}
	
}
