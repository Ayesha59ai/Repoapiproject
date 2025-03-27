package workingwithwebelementInterfaceelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(3000);
        TakesScreenshot ts =(TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("./Screenshort/zomato.png");
        
        FileHandler.copy(src, trg);
     driver.close();
	}

}
