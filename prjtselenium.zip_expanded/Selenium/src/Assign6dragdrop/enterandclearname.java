package Assign6dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class enterandclearname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement clearer = driver.findElement(By.id("APjFqb"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("Ayesha").perform();
		act.keyUp(Keys.SHIFT).perform();
		clearer.click();
		clearer.clear();
		Thread.sleep(2000);
		clearer.click();
		act.keyDown(Keys.SHIFT).sendKeys("Ayesha").perform();
		act.keyUp(Keys.SHIFT).perform();
		

	}

}
