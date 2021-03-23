package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Groups
{
	//WebDriver driver;
	
	/*@BeforeMethod
	public void strt_browser()
	{

		
		
		
	}*/
	
	
	//@Test( groups ="smoketest")
	//@Test(dependsOnMethods = { "tc_02" })
	@Test(priority = 3)
	public void tc_01()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mykidsbank.org");
		WebElement Banker_IDS = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input"));
		WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input"));
		WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input"));
		WebElement Login_Btn = driver.findElement(By.xpath("//*[@id=\'clicked_when_enter_id\']"));
		
		Banker_IDS.sendKeys("669078");
		Username.sendKeys("testcase01");
		Password.sendKeys("abc123");
		Login_Btn.click();
		
		driver.close();
		
	}
	//@Test( groups ="regtest")
	@Test(priority = 2 , enabled = false)
	public void tc_02()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mykidsbank.org");
		WebElement Banker_IDS = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input"));
		WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input"));
		WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input"));
		WebElement Login_Btn = driver.findElement(By.xpath("//*[@id=\'clicked_when_enter_id\']"));
		
		Banker_IDS.sendKeys("789456");
		Username.sendKeys("testcase02");
		Password.sendKeys("abc123");
		Login_Btn.click();
		
		driver.close();

	}
	
	
	
	
	@Test(priority = 1)
	public void tc_03()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mykidsbank.org");
		WebElement Banker_IDS = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input"));
		WebElement Username = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input"));
		WebElement Password = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input"));
		WebElement Login_Btn = driver.findElement(By.xpath("//*[@id=\'clicked_when_enter_id\']"));
		
		Banker_IDS.sendKeys("54612");
		Username.sendKeys("testcase03");
		Password.sendKeys("abc123");
		Login_Btn.click();
		
		driver.close();

	}
	
/*	@AfterMethod
	public void close_browser()
	{
		String titl = driver.getTitle();
		System.out.println(titl);
		
		
	}*/
	

}
