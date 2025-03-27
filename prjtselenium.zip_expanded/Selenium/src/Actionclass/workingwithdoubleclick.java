package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwithdoubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=doc");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement doubleclick = driver.findElement(By.id("add"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		WebElement doubleclick1 =driver.findElement(By.id("minus"));
	act.doubleClick(doubleclick1).perform();
	Thread.sleep(2000);
		

	}

}
