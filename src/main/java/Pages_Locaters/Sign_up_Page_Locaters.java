package Pages_Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sign_up_Page_Locaters
{

private WebDriver driver;
	
	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/span/input")
	public WebElement First_Name;
	
	
	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[2]/td[2]/span/input")	
	public WebElement Last_Name;
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[3]/td[2]/span/input")	
	public WebElement Your_Email;
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[4]/td[2]/span/input")	
	public WebElement Re_Your_Email;
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[5]/td[2]/span/input")	
	public WebElement Password_txt;
	
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input")	
	public WebElement Parent_Guardian;
	

	@FindBy( how = How.XPATH , using = "/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr/td[1]/span")	
	public WebElement Sign_Up;
}
