package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledoesnothaveID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/disableelementjse.html");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	js.executeScript("arguments[0].value='  ' ",usn);
		 
		

	}

}
