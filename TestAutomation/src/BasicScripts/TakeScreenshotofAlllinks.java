package BasicScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenshotofAlllinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		//// Wait for images to load
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button")));


		List<WebElement> image = driver.findElements(By.xpath("//button"));
		int count = image.size();
	
	
		for(int i=0;i<count;i++) {
		WebElement img = image.get(i);
		File temp=img.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
	    File perm = new File("./Screenshot/image1"+ i + ".png");
	    Thread.sleep(1000);
		FileHandler.copy(temp, perm);
		}

	}

}
