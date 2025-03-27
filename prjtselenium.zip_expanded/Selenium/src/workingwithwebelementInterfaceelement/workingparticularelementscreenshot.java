package workingwithwebelementInterfaceelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingparticularelementscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.swiggy.com/");
        Thread.sleep(3000);
        WebElement textfield = driver.findElement(By.id("location"));
        File src =textfield.getScreenshotAs(OutputType.FILE);
        File trg = new File("./Screenshort/swiggy.png");
        FileHandler.copy(src, trg);
driver.close();
	}

}
