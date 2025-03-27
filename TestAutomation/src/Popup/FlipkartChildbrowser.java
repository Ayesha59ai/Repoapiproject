package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetWindowPosition;

public class FlipkartChildbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));		
		search.sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[.='Apple iPhone 11 (Black, 64 GB)']")).click();
		 String currentWindowHandle = driver.getWindowHandle();//
		 //change window contro here
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
        WebElement email = driver.findElement(By.xpath("//input[@maxlength='auto']"));
        email.sendKeys("ayesha@gmail.com");
	}

}
