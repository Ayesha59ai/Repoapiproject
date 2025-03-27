package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscriptclick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/linkfb.html");
		
	 WebElement ele = driver.findElement(By.tagName("a"));
	 ele.click();
	 //driver.close();
		
	}

}
