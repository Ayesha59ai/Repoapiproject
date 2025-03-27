package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingHorizontally {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		//scrollRight
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0);");

	}

}
