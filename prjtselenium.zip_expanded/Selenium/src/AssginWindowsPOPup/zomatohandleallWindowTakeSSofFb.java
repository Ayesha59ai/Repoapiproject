package AssginWindowsPOPup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zomatohandleallWindowTakeSSofFb {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
//driver.findElement(By.xpath("//a[@href=\"https://in.linkedin.com/company/zomato\"]")).click();
//driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
//driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();

//driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato\']")).click();

driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();

WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class=\"x1b0d499 x1d69dk1\"])[5]")));
driver.findElement(By.xpath("(//i[@class=\"x1b0d499 x1d69dk1\"])[5]")).click();
TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File trg=new File("./Screenshort/" +src.getName());
FileHandler.copy(src, trg);
//(//i[@class="x1b0d499 x1d69dk1"])[5]
		//div[@aria-label='Close']//div
		
	}

}
