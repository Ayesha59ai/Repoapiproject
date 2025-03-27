package ass4regshoper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartfetchnameandprice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	 String mess = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).getText();
     System.out.println(mess);
     Thread.sleep(3000);
     String mesage= driver.findElement(By.xpath("(//div[text()='₹60,999'])[1]")).getText();
	  System.out.println(mesage);
	  driver.close();
	}
}