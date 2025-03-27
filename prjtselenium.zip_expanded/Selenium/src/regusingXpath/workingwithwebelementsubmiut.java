package regusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithwebelementsubmiut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	WebElement	searchtextfield =driver.findElement(By.name("q"));
	searchtextfield.sendKeys("iphone");
	searchtextfield.submit();
	Thread.sleep(5000);
String message = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]")).getText();
System.out.println(message);	
Thread.sleep(2000);
	driver.close();
	}
}