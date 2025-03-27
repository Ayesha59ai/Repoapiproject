package Assgscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demoshreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		driver.findElement(By.xpath("(//span[text()='WebDriver'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Elements']")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("./Screenshort/" + src.getName());
        
        FileHandler.copy(src, trg);
     driver.close();

	}

}
