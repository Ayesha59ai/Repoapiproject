package KeyboardActions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingActionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("selenium").perform();
		act.keyUp(Keys.SHIFT).perform();

	}

}
