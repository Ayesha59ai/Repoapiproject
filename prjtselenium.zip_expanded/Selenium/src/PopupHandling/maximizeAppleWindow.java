package PopupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeAppleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/Downloads/Multiple%20Windows%20(1).html");
		driver.findElement(By.id("open-windows-button")).click();
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds)
		{
		driver.switchTo().window(id);
		if(driver.getCurrentUrl().equals("https://www.apple.com/"))
		{
			driver.manage().window().maximize();
		}
		else {
			driver.close();
		}
		Thread.sleep(2000);
		}
		
	}
}
