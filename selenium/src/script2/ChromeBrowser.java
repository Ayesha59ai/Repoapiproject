package script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value name='username']")).sendKeys("santhose");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value name='password']")).sendKeys("1234");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@value type='submit']")).click();
		
		

	}

}
