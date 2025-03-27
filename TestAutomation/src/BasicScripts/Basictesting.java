package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basictesting {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//System.setProperty("webdriver.chrome.diver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/Selenium/basictesting.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		
	}

}
