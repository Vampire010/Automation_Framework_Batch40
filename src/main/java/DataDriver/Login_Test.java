package DataDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://www.mykidsbank.org/");
		Thread.sleep(2000);
		
		Login_Base_Class k=new Login_Base_Class(d);
		
		k.test(d);


	}

}
