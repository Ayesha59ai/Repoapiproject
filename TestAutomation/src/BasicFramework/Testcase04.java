package BasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase04  extends Genericscript
{
	@Test
	public void enteremail() throws InterruptedException 
	{
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Ayesha");
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.id("pass"));
		Thread.sleep(1000);
		psw.sendKeys("ayesh@123");
		
	}
	
	

}
