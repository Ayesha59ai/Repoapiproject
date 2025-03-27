package PopupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPOPuphandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		//to get session id of main page
		String mainID=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		//2tabs get the session id of all the tabs
		Set<String> allIds = driver.getWindowHandles();
		//sysout(allids);
		for(String id:allIds) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println("Loop:"+driver.getTitle());
			System.out.println("Loop:"+driver.getCurrentUrl());
			Thread.sleep(2000);
			driver.close();
			
			
		}
	}

}
