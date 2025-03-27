package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/Mainpgframe.html");
		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("admin");
		//driver.switchTo().frame(0);/using index
		//driver.switchTo().frame("f1");/id
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
		pwd.sendKeys("admin123");
		
	}

}
