package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingnestedframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/mainpgnestedframe.html");
		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		
		un.sendKeys("admin");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("admin123");
		driver.switchTo().frame(0);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("1234678890");
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin123@gmail.com");
		//switch back to immediate parent
		driver.switchTo().parentFrame();
		mob.clear();
		//switch back to mainpg
		driver.switchTo().defaultContent();
		un.clear();
		

	}

}
