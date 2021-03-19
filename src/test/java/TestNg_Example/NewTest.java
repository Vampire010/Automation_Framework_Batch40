package TestNg_Example;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class NewTest 
{
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Parbank\\Drivers\\chromedriver.exe");  		   
       driver=new ChromeDriver();  
      driver.get("https://www.snapdeal.com/");
      System.out.println("beforeMethod");
  }

  
  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	     Thread.sleep(5000);
	      System.out.println("afterMethod");
	      driver.quit();
  }

  

  @Test
  public void Snapdeal() throws InterruptedException 
  {

      driver.get("https://www.snapdeal.com/");
      
      //Send USERNAME
   WebElement ele=   driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
   ele.click();

   Thread.sleep(5000);
   System.out.println("Test");  
  }


}
