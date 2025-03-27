package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
	Thread.sleep(4000);
	driver.findElement(By.id("browNotButton")).click();
	Thread.sleep(2000);
	driver.quit();

	}

}
