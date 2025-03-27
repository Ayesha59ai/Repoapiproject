package AssgIFRAME;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingwithsnowcityiframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://snowcityblr.com/");
		driver.findElement(By.xpath("//li[@id='menu-item-16074']//a[text()='Contact Us']/.")).click();
		//driver.switchTo().frame(0);

		WebElement frameelement = driver.findElement(By.xpath("(//iframe)[1]"));
driver.switchTo().frame(frameelement);
driver.findElement(By.xpath("//div[text()='Directions']")).click();
Set<String> windowchrome = driver.getWindowHandles();
	for (String string : windowchrome) {
		driver.switchTo().window(string);
		
	}
TakesScreenshot ts =(TakesScreenshot)driver;
File src =ts.getScreenshotAs(OutputType.FILE);
File trg=new File("./Screenshort/" + src.getName());

FileHandler.copy(src, trg);


	
	}

}
