package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptRightclick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement cart = driver.findElement(By.xpath("//a[.='Cart']"));
Actions s =new Actions(driver);
//rightclick
s.contextClick(cart).perform();
Robot r =new Robot();
r.keyPress(KeyEvent.VK_DOWN);
//we 
r.keyRelease(KeyEvent.VK_DOWN);

Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);


	}

}
