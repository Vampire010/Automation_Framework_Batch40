package TestNg_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Kb_login
{

	
	WebDriver driver ;
	@Parameters("browser_Type")
	@Test
	public void open_browser(String browser_Type)
	{

		if(browser_Type.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://mykidsbank.org/");
			
		}
		else if(browser_Type.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "G:\\Kids_Bank_Pom\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://mykidsbank.org/");
			
		}
		
		else if(browser_Type.equals("edge"))
		{
			
			System.setProperty("webdriver.edge.driver", "G:\\Kids_Bank_Pom\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("http://mykidsbank.org/");
			
		}
			
		else 
		{
			
			System.out.println("Specified browser type is not found");
			
		}
		
		
		WebElement Banker_IDS = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input"));
		WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input"));
		WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input"));
		WebElement Login_Btn = driver.findElement(By.xpath("//*[@id=\'clicked_when_enter_id\']"));
		
		Banker_IDS.sendKeys("669078");
		Username.sendKeys("banker");
		Password.sendKeys("abc123");
		Login_Btn.click();
	}
	


}
