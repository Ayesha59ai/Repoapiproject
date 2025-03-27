package workingwithwebelementInterfaceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workinggetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement emailtextfield = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailtextfield.sendKeys("ayesha@gmail.com");
		System.out.println(emailtextfield.getAttribute("value"));
		System.out.println(emailtextfield.getAttribute("class"));
		if (emailtextfield.getAttribute("value").equals("ayesha@gmail.com")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	
	}

}
