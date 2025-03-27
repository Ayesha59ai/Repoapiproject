package AssginWindowsPOPup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class barbeqhandlewindowsandcloseallTab {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.barbequenation.com/");
		driver.findElement(By.xpath("//span[@class='fa fa-facebook fa-lg']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-twitter fa-lg']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-instagram fa-lg']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-youtube fa-lg']")).click();
//		Set<String> allIds = driver.getWindowHandles();
//		for(String id:allIds)
//		{
//		driver.switchTo().window(id);
//		if(driver.getCurrentUrl().equals(""))
//		{
//			driver.manage().window().maximize();
//		}
//		else {
//			driver.close();
//		}
//		Thread.sleep(2000);
//		}
		
	}

}
