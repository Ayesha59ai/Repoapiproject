package AssgIFRAME;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingwithSeleniumIframe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		//WebElement frameelement = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		//driver.switchTo().frame(frameelement);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[contains(text(),'Free Mock Tests')])[2]")).click();
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("FreshersNow Test Series | 100% Free Mock Tests"))
			{
				break;
			}
			else
				driver.close();
		}
		driver.findElement(By.xpath("//a[@class='cs-nav-btn visible-lg btn-success']")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshort/" + src.getName());

		FileHandler.copy(src, trg);
	}
}
