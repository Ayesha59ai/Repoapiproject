package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingScrollingUsingJs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		//up
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");

	}

}
