package BasicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tasktoclosetabsandrc {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement Link1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));		
		WebElement Link2 = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		WebElement Link3 = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		WebElement Link4 = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		ArrayList<WebElement> arry=new ArrayList<WebElement>();
		arry.add(Link1);
		arry.add(Link2);
		arry.add(Link3);
		arry.add(Link4);
		int count=arry.size();
		Actions act=new Actions(driver);
		for(int i=0;i<count;i++) {
			WebElement link = arry.get(i);
			Thread.sleep(1000);
			act.contextClick(link).perform();
			Robot ar=new Robot();
			ar.keyPress(KeyEvent.VK_DOWN);
			ar.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			ar.keyPress(KeyEvent.VK_ENTER);
			ar.keyRelease(KeyEvent.VK_ENTER);
			}
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(wins);
		int countitle = arr.size();
		for(int i=0;i<countitle;i++) {
			String win = arr.get(i);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			
		}
	}
}


