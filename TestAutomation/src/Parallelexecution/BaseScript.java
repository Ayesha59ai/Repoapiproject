package Parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseScript 
{
	public WebDriver driver;
	@Parameters("BrowserName")
	@BeforeMethod
	public void LaunchBrowser(String BrowserName) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		if(BrowserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
     
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