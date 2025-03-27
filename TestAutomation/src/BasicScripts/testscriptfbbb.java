package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscriptfbbb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass"));
		email.sendKeys("ayesha");
		pswd.sendKeys("ayesha@123");
		driver.navigate().refresh();
		email.sendKeys("ayesha");
		pswd.sendKeys("ayesha@123");

	}

}
