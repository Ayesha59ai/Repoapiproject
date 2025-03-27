package assg4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hindustantimes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hindustantimes.com/");
		
		driver.switchTo().frame("webpush-onsite");
  String msg = driver.findElement(By.xpath("//div[@class='description']")).getText();
System.out.println(msg);
	driver.findElement(By.id("deny")).click();
	String mssg = driver.findElement(By.xpath("(//div[@id=\"topnews\"] //..//.. //a[contains(text(),' Atal Setu ')])[1]")).getText();
	System.out.println(mssg);
	driver.close();
	}
	}