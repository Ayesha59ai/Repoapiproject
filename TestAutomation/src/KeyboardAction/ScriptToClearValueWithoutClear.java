package KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptToClearValueWithoutClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/Username.html");
	WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(1000);
	UN.sendKeys(Keys.CONTROL+ "A");
	Thread.sleep(1000);
	UN.sendKeys(Keys.BACK_SPACE);

	}

}
