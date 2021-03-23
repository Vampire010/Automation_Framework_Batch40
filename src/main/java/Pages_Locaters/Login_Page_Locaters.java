package Pages_Locaters;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page_Locaters 
{
	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	protected WebElement Banker_IDS;
	
	
	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")	
	protected WebElement Username;
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")	
	protected WebElement Password;
	
	@FindBy( how = How.XPATH , using = "//*[@id=\'clicked_when_enter_id\']")	
	protected WebElement Login_Btn;


}
