package Scrolling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingbyActionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
	act.scrollByAmount(0, 500).perform();
	Thread.sleep(2000);
	act.scrollByAmount(0, 500).perform();
	
	
	}

}
