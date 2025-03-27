package Assignmt5dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class movecursortakescreenshotmyntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
Thread.sleep(3000);
Actions act=new Actions(driver);
WebElement mensproduct = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
act.moveToElement(mensproduct).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
Thread.sleep(3000);
TakesScreenshot ts =(TakesScreenshot)driver;
File src =ts.getScreenshotAs(OutputType.FILE);
File trg=new File("./Screenshort/" + src.getName());

FileHandler.copy(src, trg);
driver.close();
	}

}
