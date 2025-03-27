package BasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcasetask extends Genericscript
{
	@Test
	public void logintofb() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass"));
		email.sendKeys("ayesha");
		pswd.sendKeys("ayesha@123");
		driver.navigate().refresh();
		email.sendKeys("ayesha");
		pswd.sendKeys("ayesha@123");
		
	}

}
