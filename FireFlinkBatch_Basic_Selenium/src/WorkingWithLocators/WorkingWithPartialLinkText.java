package WorkingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.partialLinkText("Shopping")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
	}

}
