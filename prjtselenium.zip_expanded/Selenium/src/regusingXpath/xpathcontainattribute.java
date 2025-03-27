package regusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcontainattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("ayeshfath@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ayesgha");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		//String Message=driver.findElement(By.xpath("//div[contains(@class,'validati')]")).getText();
		String a=driver.findElement(By.xpath("//span[contains(text(),'Login wa')]")).getText();
		System.out.println(a);
		driver.close();
		

	}

}
