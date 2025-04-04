package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextFeild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/index.php");
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//To Handle disabled web elements by using JavascriptExecutor.
		js.executeScript("arguments[0].value='Rakesh';", target);
	}

}
