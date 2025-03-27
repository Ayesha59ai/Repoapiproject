package workingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithclear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameTextfield = driver.findElement(By.id("username"));
		userNameTextfield.clear();
		userNameTextfield.sendKeys("ayesha");
		Thread.sleep(2000);
		WebElement userNameTextfields = driver.findElement(By.id("password"));
		userNameTextfields.clear();
		userNameTextfields.sendKeys("ayesha");
	
		

	}

}
