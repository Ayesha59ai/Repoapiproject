package BasicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotforElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));//for one element
		File temp = email.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshot/Element1.png");
		FileHandler.copy(temp, perm);
		
		
		//for particular element
		WebElement emailpswbtn = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		File temp1 = emailpswbtn.getScreenshotAs(OutputType.FILE);
		File perm2 = new File("./Screenshot/Element2.png");
		FileHandler.copy(temp1, perm2);
		
		Thread.sleep(1000);
		driver.close();
	}

}
