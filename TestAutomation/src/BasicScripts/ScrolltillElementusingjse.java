package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltillElementusingjse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'See personalized recommendations')]"));
		Point Loc = ele.getLocation();
		int  y = Loc.getY();
		System.out.println(y);
		WebElement Link = driver.findElement(By.xpath("//a[.='Facebook']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
			js.executeScript("window.scrollBy(0, "+y+" )");
			Thread.sleep(1000);
			Link.click();
		


	}

}
