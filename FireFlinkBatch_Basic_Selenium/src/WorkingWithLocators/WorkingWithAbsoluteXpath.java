package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/raki9/OneDrive/Documents/SeleniumFireflink/RegisterPage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Rakesh");
		
	}

}
