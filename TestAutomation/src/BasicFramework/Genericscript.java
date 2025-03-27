package BasicFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericscript {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
     driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com");

		
	}
	@AfterMethod
   public void closebrowser() throws InterruptedException {
		Thread.sleep(1000);
	   driver.close();
	   
   }
}
