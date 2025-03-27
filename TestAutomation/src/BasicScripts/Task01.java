package BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		driver.close();
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver	driver1 =new FirefoxDriver();
	driver1.get("https://netflix.com");
	Thread.sleep(1000);
	driver1.quit();
	
	}
}
